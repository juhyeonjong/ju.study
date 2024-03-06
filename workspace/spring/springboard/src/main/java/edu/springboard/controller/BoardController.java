package edu.springboard.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.springboard.service.BoardService;
import edu.springboard.vo.BoardVO;
import edu.springboard.vo.MemberVO;

@RequestMapping(value="/board")
@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/index.do", method=RequestMethod.GET)
	public String index(Model model,HttpSession session,HttpServletResponse response,HttpServletRequest request) throws IOException {
		
		String filterData = (String)request.getAttribute("filterData");
		
		System.out.println("filterData::"+filterData);
		
		List<BoardVO> list = boardService.selectAll();
		
		model.addAttribute("list", list);
		
		return "board/list";
	}
	
	@RequestMapping(value="/write.do", method=RequestMethod.GET)
	public String write() {
		return "board/write";
	}
	
	
	@RequestMapping(value="/writeOk.do", method=RequestMethod.POST)
	public String writeOk(HttpServletRequest request) {
		
		String title = (String)request.getAttribute("title");
		String content = (String)request.getAttribute("content");
		
		System.out.println("title :: "+title);
		System.out.println("content :: "+content);
		
		
		MemberVO login = (MemberVO)request.getSession().getAttribute("login");
		
		
		BoardVO vo = new BoardVO();
		vo.setBtitle(title);
		vo.setBcontent(content);
		vo.setMno(login.getMno());
		
		int result = boardService.insert(vo);
		
		return "redirect:index.do";
	}
}





