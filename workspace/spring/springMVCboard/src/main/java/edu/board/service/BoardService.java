package edu.board.service;

import java.util.List;

import edu.board.vo.BoardVO;

public interface BoardService {
	List<BoardVO> list() throws Exception;
	BoardVO selectOneByBno(int bno) throws Exception;
	int update(BoardVO vo) throws Exception;
	int delete(int bno) throws Exception;
}
