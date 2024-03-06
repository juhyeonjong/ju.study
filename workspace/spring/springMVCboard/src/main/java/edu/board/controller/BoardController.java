package edu.board.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.board.service.BoardService;
import edu.board.vo.BoardVO;
import edu.board.vo.BoardVO2;

@RequestMapping(value="/board")
@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/list.do",method=RequestMethod.GET)
	public String list(Model model) throws Exception {
		//board 테이블의 데이터 목록 가져오기
		List<BoardVO> list = boardService.list();
		model.addAttribute("list", list);
		return "board/list";
	}
	
	
	
	
	@RequestMapping(value="/list2.do",method=RequestMethod.GET)
	public String list2(Model model) {
		//비지니스 로직 -> DB에 존재하는 게시글 목록 가져오기
		List<String> slist = new ArrayList<String>();
		slist.add("첫번째 데이터");
		slist.add("두번째 데이터");
		slist.add("세번째 데이터");
		
		//Model 객체는 controller 에서 화면으로 데이터를 전달 하는 객체 이다.
		//Model 객체는 반드시 dispatcherservlet이 전달하는 객체로만 데이터를 전송할 수 있다.
		//dispatcherservlet을 통해 Model 객체를 받는 방법은 매개변수이다.
		
		model.addAttribute("list",slist);//request.setAttribute("list",slist);
		
		return "board/list";
	}
	
	@RequestMapping(value="/view2.do", method=RequestMethod.GET )
	public String view2(int bno,Model model) throws Exception {
		
		BoardVO vo = boardService.selectOneByBno(bno);
		model.addAttribute("vo", vo);
		return "board/view2";
	}
	
	
	
	@RequestMapping(value="/view.do")
	public String view(Model model) {
		
//		String title="첫번째 게시글 입니다.";
//		int hit = 10;
//		String writer = "홍길동";
//		String wdate = "2024-01-22";
//		String content= "스프링을 사용하여 게시판 만들기 재밌어요!";
		
		/*
		 * 위 변수 5개를 model 객체를 사용하여 view.jsp에 표의
		 * 형태로 전부 출력하세요.
		 */
//		model.addAttribute("title",title);
//		model.addAttribute("hit",hit);
//		model.addAttribute("writer",writer);
//		model.addAttribute("wdate",wdate);
//		model.addAttribute("content",content);
		
		BoardVO2 bvo = new BoardVO2();
		bvo.setTitle("첫번째 게시글 입니다.");
		bvo.setHit(10);
		bvo.setWriter("홍길동");
		bvo.setWdate("2024-01-22");
		bvo.setContent("스프링을 사용하여 게시판 만들기 재밌어요!");
		
		model.addAttribute("vo",bvo);
		
		
		return "board/view";
	}
	
	@RequestMapping(value="/write.do",method=RequestMethod.GET)
	public String write() {
		System.out.println("전송형식이 GET인 write.do");
		return "board/write";
	}
	@RequestMapping(value="/write.do",method=RequestMethod.POST)
	public String write(BoardVO2 vo ,String num) {
		System.out.println("전송형식이 POST인 write.do");
		System.out.println("title : "+vo.getTitle());
		System.out.println("content : "+vo.getContent());
		System.out.println("num : "+num);
		return "redirect:list.do";
	}
	
	@RequestMapping(value="/modify.do",method=RequestMethod.GET)
	public String modify(int bno, Model model) throws Exception {
		//bno가 일치하는 게시글 한개
		BoardVO vo = boardService.selectOneByBno(bno);
		
		model.addAttribute("vo", vo);
		
		return "board/modify";
	}
	
	@RequestMapping(value="/modify.do",method=RequestMethod.POST)
	public void modify(BoardVO vo, HttpServletResponse res) throws Exception {
		
		//vo안에 값을 DB에 수정
		int result = boardService.update(vo);
		
		//자바스크립트를 실행하여 화면이동
		res.setContentType("text/html; charset=utf-8");
		res.setCharacterEncoding("UTF-8");
		if(result>0) {
			res.getWriter().append("<script>alert('수정되었습니다.');location.href='list.do'</script>");
		}else {
			res.getWriter().append("<script>alert('수정되않았습니다.');location.href='list.do'</script>");
		}
		res.getWriter().flush();
		
		//return "redirect:list.do";
	}
	
	@RequestMapping(value="/delete.do", method=RequestMethod.POST)
	public void delete(int bno,HttpServletResponse res) throws Exception {
		
		int result = boardService.delete(bno);
		//자바스크립트를 실행하여 화면이동
		res.setContentType("text/html; charset=utf-8");
		res.setCharacterEncoding("UTF-8");
		
		PrintWriter pw = res.getWriter();
		
		if(result>0) {
			pw.append("<script>alert('삭제되었습니다.');location.href='list.do'</script>");
		}else {
			pw.append("<script>alert('삭제 실패했습니다.');location.href='list.do'</script>");
		}
		pw.flush();
		
	}
}





