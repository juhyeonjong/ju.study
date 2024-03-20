package edu.ezen.practice.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ezen.practice.enums.AUTHORITY;
import edu.ezen.practice.enums.Authority;

@Controller
public class SecurityController {

	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping(value="/login.do")
	public String login() {
		return "security/login";
	}
	
	@RequestMapping(value="/join.do", method=RequestMethod.GET)
	public String join() {
		return "security/join";
	}
	
	@RequestMapping(value="/joinOk.do", method=RequestMethod.POST)
	public String joinOk(String userid, String password, String name ,String phone, String address, String email){
		
		BCryptPasswordEncoder epwe = new BCryptPasswordEncoder();
		
		Map<String,Object> vo = new HashMap<String,Object>();
		vo.put("userid", userid);
		vo.put("password",epwe.encode(password));
		vo.put("name", name);
		vo.put("authority", Authority.ROLE_USER);
		vo.put("phone", phone);
		vo.put("address", address);
		vo.put("email", email);
		
		System.out.println("------------- 회원가입 정보 -------------");
		System.out.println(userid);
		System.out.println(password);
		System.out.println(name);
		System.out.println(phone);
		System.out.println(address);
		System.out.println(email);
		
		
		// 디비로 가입시키는경우. password한개를 추출해두고 해당 패스워드로 INSERT INTO 하면 추가 가능함.
		// 테스터 만들어서 생성해도 될듯.
		
	
		int result = sqlSession.insert("edu.ezen.practice.mapper.userMapper.insert",vo);
		System.out.println("가입결과 : " + result);
		
		return "redirect:/login.do";
	}
	
}
