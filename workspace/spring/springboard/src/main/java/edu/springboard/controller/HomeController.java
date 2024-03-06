package edu.springboard.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.springboard.service.MemberService;
import edu.springboard.vo.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value="login.do", method=RequestMethod.GET)
	public String login() {
		
		return "user/login";
	}
	
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public void login(MemberVO vo,HttpSession session, HttpServletResponse response ,HttpServletRequest request) throws IOException {
		
		System.out.println("mid:"+vo.getMid());
		System.out.println("mpassword:"+vo.getMpassword());
		
		
		MemberVO checkVO = memberService.selectLogin(vo);
		
		
		/*
		  ����ڰ� �Է��� ���̵� �н������ ��ġ�ϴ� ���� ������ �����Ѵٸ�
		  ���ǿ� ȸ�� ��ȣ, ȸ�� �̸�, ���̵� ������ ����ּ���.(��ü����)
		  ���� Ű�̸��� login���� �մϴ�.
		 */
		
		if(checkVO != null) {
			
			MemberVO login = new MemberVO();
			login.setMid(checkVO.getMid());
			login.setMno(checkVO.getMno());
			login.setMname(checkVO.getMname());
			
			session.setAttribute("loginname", checkVO.getMname());
			
			session.setAttribute("login", login);
			
			response.setContentType("text/html; charset=utf-8");
			response.setCharacterEncoding("UTF-8");
			
			response
				.getWriter()
				.append("<script>alert('�α��� ����!');location.href='"
						+request.getContextPath()+"'</script>").flush();
			
		}else {
			response.setContentType("text/html; charset=utf-8");
			response.setCharacterEncoding("UTF-8");
			
			response
			.getWriter()
			.append("<script>alert('�α��� ����!');location.href='"
					+request.getContextPath()+"/login.do'</script>").flush();
		}
	}
	
	@RequestMapping(value="logout.do", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	
	
	
	
}
