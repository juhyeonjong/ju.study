package edu.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.board.dao.BoardDAO2;
import edu.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO2 boardDAO;
	
	@Override
	public List<BoardVO> list() throws Exception {
		//DB의 board 테이블 게시글 목록 찾기
		
		
		List<BoardVO> blist = boardDAO.list();
		return blist;
	}

	@Override
	public BoardVO selectOneByBno(int bno) throws Exception {
		
		BoardVO bvo = boardDAO.selectOneByBno(bno);
		//로직
		return bvo;
	}

	@Override
	public int update(BoardVO vo) throws Exception {
		
		return boardDAO.update(vo);
	}

	@Override
	public int delete(int bno) throws Exception {
		return boardDAO.delete(bno);
	}

}
