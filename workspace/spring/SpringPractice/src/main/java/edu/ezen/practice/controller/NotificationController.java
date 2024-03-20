package edu.ezen.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.ezen.practice.vo.BoardVO;

@RequestMapping(value="/notification")
@Controller
public class NotificationController {

	@RequestMapping(value="/index.do", method=RequestMethod.GET)
	public String index(Model model, String nowPage, String searchType, String searchValue) {
		// 여기서 데이터를 가져올것.
	
		int page = 1;
		if(nowPage != null && !nowPage.equals("")){
			page = Integer.parseInt(nowPage);
		} 
		
		
		
		List<BoardVO> list = new ArrayList<BoardVO>();//boardService.selectAll();
		
		model.addAttribute("list", list);
		
		
		return "notification/list";
	}
}
