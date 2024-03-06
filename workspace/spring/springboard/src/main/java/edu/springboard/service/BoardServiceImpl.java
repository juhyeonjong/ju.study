package edu.springboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.springboard.dao.BoardDAO;
import edu.springboard.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> selectAll() {
		return boardDAO.selectAll();
	}

	@Override
	public int insert(BoardVO vo) {
		return boardDAO.insert(vo);
	}

}
