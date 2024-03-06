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
		//board ���̺��� ������ ��� ��������
		List<BoardVO> list = boardService.list();
		model.addAttribute("list", list);
		return "board/list";
	}
	
	
	
	
	@RequestMapping(value="/list2.do",method=RequestMethod.GET)
	public String list2(Model model) {
		//�����Ͻ� ���� -> DB�� �����ϴ� �Խñ� ��� ��������
		List<String> slist = new ArrayList<String>();
		slist.add("ù��° ������");
		slist.add("�ι�° ������");
		slist.add("����° ������");
		
		//Model ��ü�� controller ���� ȭ������ �����͸� ���� �ϴ� ��ü �̴�.
		//Model ��ü�� �ݵ�� dispatcherservlet�� �����ϴ� ��ü�θ� �����͸� ������ �� �ִ�.
		//dispatcherservlet�� ���� Model ��ü�� �޴� ����� �Ű������̴�.
		
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
		
//		String title="ù��° �Խñ� �Դϴ�.";
//		int hit = 10;
//		String writer = "ȫ�浿";
//		String wdate = "2024-01-22";
//		String content= "�������� ����Ͽ� �Խ��� ����� ��վ��!";
		
		/*
		 * �� ���� 5���� model ��ü�� ����Ͽ� view.jsp�� ǥ��
		 * ���·� ���� ����ϼ���.
		 */
//		model.addAttribute("title",title);
//		model.addAttribute("hit",hit);
//		model.addAttribute("writer",writer);
//		model.addAttribute("wdate",wdate);
//		model.addAttribute("content",content);
		
		BoardVO2 bvo = new BoardVO2();
		bvo.setTitle("ù��° �Խñ� �Դϴ�.");
		bvo.setHit(10);
		bvo.setWriter("ȫ�浿");
		bvo.setWdate("2024-01-22");
		bvo.setContent("�������� ����Ͽ� �Խ��� ����� ��վ��!");
		
		model.addAttribute("vo",bvo);
		
		
		return "board/view";
	}
	
	@RequestMapping(value="/write.do",method=RequestMethod.GET)
	public String write() {
		System.out.println("���������� GET�� write.do");
		return "board/write";
	}
	@RequestMapping(value="/write.do",method=RequestMethod.POST)
	public String write(BoardVO2 vo ,String num) {
		System.out.println("���������� POST�� write.do");
		System.out.println("title : "+vo.getTitle());
		System.out.println("content : "+vo.getContent());
		System.out.println("num : "+num);
		return "redirect:list.do";
	}
	
	@RequestMapping(value="/modify.do",method=RequestMethod.GET)
	public String modify(int bno, Model model) throws Exception {
		//bno�� ��ġ�ϴ� �Խñ� �Ѱ�
		BoardVO vo = boardService.selectOneByBno(bno);
		
		model.addAttribute("vo", vo);
		
		return "board/modify";
	}
	
	@RequestMapping(value="/modify.do",method=RequestMethod.POST)
	public void modify(BoardVO vo, HttpServletResponse res) throws Exception {
		
		//vo�ȿ� ���� DB�� ����
		int result = boardService.update(vo);
		
		//�ڹٽ�ũ��Ʈ�� �����Ͽ� ȭ���̵�
		res.setContentType("text/html; charset=utf-8");
		res.setCharacterEncoding("UTF-8");
		if(result>0) {
			res.getWriter().append("<script>alert('�����Ǿ����ϴ�.');location.href='list.do'</script>");
		}else {
			res.getWriter().append("<script>alert('�����Ǿʾҽ��ϴ�.');location.href='list.do'</script>");
		}
		res.getWriter().flush();
		
		//return "redirect:list.do";
	}
	
	@RequestMapping(value="/delete.do", method=RequestMethod.POST)
	public void delete(int bno,HttpServletResponse res) throws Exception {
		
		int result = boardService.delete(bno);
		//�ڹٽ�ũ��Ʈ�� �����Ͽ� ȭ���̵�
		res.setContentType("text/html; charset=utf-8");
		res.setCharacterEncoding("UTF-8");
		
		PrintWriter pw = res.getWriter();
		
		if(result>0) {
			pw.append("<script>alert('�����Ǿ����ϴ�.');location.href='list.do'</script>");
		}else {
			pw.append("<script>alert('���� �����߽��ϴ�.');location.href='list.do'</script>");
		}
		pw.flush();
		
	}
}





