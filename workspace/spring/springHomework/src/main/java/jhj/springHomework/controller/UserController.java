package jhj.springHomework.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import jhj.springHomework.service.MemberService;
import jhj.springHomework.vo.MemberVO;

@Controller
public class UserController {

	//��� ���񽺸� ���� ��Ų��
	@Autowired
	MemberService memberService;
	
	//��ũ��Ʈ �ڵ带 ���� response�� Ȩ���� ������ ���� ����� request + ������ MemberVO�� ��Ƽ� ��û
	@RequestMapping(value="join.do", method = RequestMethod.POST)
	public void join(MemberVO vo, HttpServletResponse response ,HttpServletRequest request) throws IOException {
		
		System.out.println("mid:"+vo.getMid());
		
		MemberVO join = new MemberVO();
		join.setMid(vo.getMid());
		join.setMpw(vo.getMpw());
		join.setMname(vo.getMname());
		join.setMemail(vo.getMemail());
		join.setMphone(vo.getMphone());
		join.setMaddr(vo.getMaddr());
		
		int result = memberService.insert(join);
		System.out.println(result);

		//���ڵ� ���ִ°�(�Ƹ� �Ʒ� �۾��°� �����ε�)
		response.setContentType("text/html; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		//flush�� Ŀ�� ������(�� �ϰ� ������Ѵ޶�� ��)
		response.getWriter().append("<script>alert('ȸ������ ����!');location.href='"
					   				+ request.getContextPath()
					   				+ "'</script>").flush();
	}
}