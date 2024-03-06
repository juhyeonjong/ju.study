package jhj.springHomework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jhj.springHomework.service.BoardService;
import jhj.springHomework.vo.BoardListVO;



//board로 들어올경우 이 컨트롤러 실행시키는 듯
@RequestMapping(value="/board")
@Controller
public class BoardController {
	
	//사용할 서비스 참조
	@Autowired
	BoardService boardService;
	
	//로그인 성공시 올 공지사항 페이지 /는 왜 필요하지?
	@RequestMapping(value="/notice.do", method=RequestMethod.GET)
	public String notice(Model model) {
		
		//selectList라는 sqlsession함수를 사용했기에 리스트현식으로 리턴되고 받는다
		List<BoardListVO> list = boardService.selectAll();
		
		model.addAttribute("blist", list);
		
		return "board/noticeBoard";
	}
	
	// 검색한 경우
	@RequestMapping(value="/notice.do", method=RequestMethod.POST)
	public String noticeSearch(Model model, BoardListVO vo) {

		System.out.println(vo.getSearch());
		System.out.println(vo.getSearchText());
		
		//검색한 vo값과 함께 실행
		List<BoardListVO> list = boardService.select1(vo);
		model.addAttribute("blist", list);
		System.out.println(list);

		return "board/noticeBoard";
	}
	
	@RequestMapping(value="/post.do", method=RequestMethod.GET)
	public String post() {
		return "board/post";
	}
	
}
