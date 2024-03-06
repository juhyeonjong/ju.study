package edu.springboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping(value="/admin/index.do")
	public String index(Model model) {
		model.addAttribute("data", "sample");
		return "admin/index";
	}
}
