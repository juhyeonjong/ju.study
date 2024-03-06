package jhj.springHomework.service;

import java.util.List;

import jhj.springHomework.vo.BoardListVO;


public interface BoardService {

	List<BoardListVO> selectAll();
	List<BoardListVO> select1(BoardListVO vo);
}
