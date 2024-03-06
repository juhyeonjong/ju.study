package edu.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {

	@RequestMapping(value="/calc/main.do",method=RequestMethod.GET)
	public String calc() {
		return "sample/calc";
	}
	
	@RequestMapping(value="/calc/result.do",method=RequestMethod.POST)
	public String result(String num1
					, @RequestParam("num2") String number2
					, String oper
					, Model model) {
		System.out.println("num1::"+num1);
		System.out.println("number2::"+number2);
		System.out.println("oper::"+oper);
		
		int num1Val = 0;
		int num2Val = 0;
		
		if(num1 != null && !num1.equals("")) {
			num1Val = Integer.parseInt(num1);
		}
		if(number2 != null && !number2.equals("")) {
			num2Val = Integer.parseInt(number2);
		}
		
		int result = 0;
		
		if(oper.equals("plus")) {
			result = num1Val+num2Val;
		}else if(oper.equals("minus")) {
			result = num1Val-num2Val;
		}else if(oper.equals("multi")) {
			result = num1Val*num2Val;
		}else if(oper.equals("divide")) {
			result = num1Val/num2Val;
		}else if(oper.equals("remain")) {
			result = num1Val%num2Val;
		}
		
		
		model.addAttribute("result", result);
		return "sample/calcResult";
	}
}







