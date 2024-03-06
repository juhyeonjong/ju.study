package edu.springboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.springboard.vo.BoardVO;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession sqlSession;
	
	private final String namespace = "edu.springboard.mapper.boardMapper";
	
	public List<BoardVO> selectAll(){
		return sqlSession.selectList(namespace+".selectAll");
	}
	
	public int insert(BoardVO vo) {
		return sqlSession.insert(namespace+".insert", vo);
	}
}






