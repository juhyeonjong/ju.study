package jhj.springHomework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jhj.springHomework.dao.BoardDAO;
import jhj.springHomework.vo.BoardListVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public List<BoardListVO> selectAll() {
		return boardDAO.selectAll();
	}

	@Override
	public List<BoardListVO> select1(BoardListVO vo) {
		return boardDAO.select1(vo);
	}

}
