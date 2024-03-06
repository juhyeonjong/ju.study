package edu.springboard.service;

import java.util.List;

import edu.springboard.vo.BoardVO;

public interface BoardService {

	List<BoardVO> selectAll();
	int insert(BoardVO vo);
}
