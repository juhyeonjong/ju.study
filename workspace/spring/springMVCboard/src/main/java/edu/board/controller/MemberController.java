package edu.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.board.service.MemberService;
import edu.board.vo.MemberVO;
import edu.board.vo.SearchVO;

@RequestMapping(value="/member")
@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	
	@RequestMapping(value="/list.do",method=RequestMethod.GET)
	public String list(Model model,SearchVO searchVO) {
		
		List<MemberVO> list = memberService.list(searchVO);
		model.addAttribute("list",list);
		
		return "member/list";
	}
	
	
	@RequestMapping(value="/register.do", method=RequestMethod.GET)
	public String register() {
		return "member/register";
	}
	
	@RequestMapping(value="/register.do",method=RequestMethod.POST)
	public String register(MemberVO vo){
		
		int result = memberService.insert(vo);
		
		
		
		System.out.println("result::"+result);
		
		return "redirect:view.do?mno="+vo.getMno();
	}
	
	@RequestMapping(value="/view.do", method=RequestMethod.GET)
	public String view(int mno,Model model) {
		MemberVO vo = memberService.selectOneByMno(mno);
		
		model.addAttribute("vo", vo);
		
		return "member/view";
	}
	
	@RequestMapping(value="/modify.do", method=RequestMethod.GET)
	public String modify(int mno,Model model) {
		MemberVO vo = memberService.selectOneByMno(mno);
		
		model.addAttribute("vo", vo);
		
		return "member/modify";
	}
	
	@RequestMapping(value="/modify.do", method=RequestMethod.POST)
	public String modify(MemberVO vo) {
		
		int result = memberService.update(vo);
		
		return "redirect:view.do?mno="+vo.getMno();
	}
}





