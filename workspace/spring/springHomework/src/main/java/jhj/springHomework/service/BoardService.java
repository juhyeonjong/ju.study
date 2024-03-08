package jhj.springHomework.service;

import java.util.List;

import jhj.springHomework.vo.BoardListVO;
import jhj.springHomework.vo.PageVO;


public interface BoardService {

	List<BoardListVO> selectAll();
	List<BoardListVO> select1(BoardListVO vo);
	

    /* 게시판 목록(페이징 적용) */
    public List<BoardListVO> getListPaging(PageVO pagevo);
    
    public int getTotal();
}
