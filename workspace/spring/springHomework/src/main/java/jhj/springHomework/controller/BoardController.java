package jhj.springHomework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jhj.springHomework.service.BoardService;
import jhj.springHomework.vo.BoardListVO;
import jhj.springHomework.vo.PageMakerVO;
import jhj.springHomework.vo.PageVO;



//board�� ���ð�� �� ��Ʈ�ѷ� �����Ű�� ��
@RequestMapping(value="/board")
@Controller
public class BoardController {
	
	//����� ���� ����
	@Autowired
	BoardService boardService;
	
	//�α��� ������ �� �������� ������ /�� �� �ʿ�����?
	@RequestMapping(value="/notice.do", method=RequestMethod.GET)
	public String notice(Model model, PageVO vo) {
		System.out.println(vo);
		//List<BoardListVO> list = boardService.selectAll();
		List<BoardListVO> list = boardService.getListPaging(vo);
		model.addAttribute("blist", list);
		int total = boardService.getTotal();
		PageMakerVO pageMake = new PageMakerVO(vo, total);
		System.out.println(pageMake.isNext());
		System.out.println(pageMake.isPrev());
		model.addAttribute("pageMaker", pageMake);
		
		return "board/noticeBoard";
	}
	
	// �˻��� ���
	@RequestMapping(value="/notice.do", method=RequestMethod.POST)
	public String noticeSearch(Model model, BoardListVO vo) {

		System.out.println(vo.getSearch());
		System.out.println(vo.getSearchText());
		
		List<BoardListVO> list = boardService.select1(vo);
		model.addAttribute("blist", list);

		return "board/noticeBoard";
	}
	
	@RequestMapping(value="/post.do", method=RequestMethod.GET)
	public String post() {
		return "board/post";
	}
	
}
