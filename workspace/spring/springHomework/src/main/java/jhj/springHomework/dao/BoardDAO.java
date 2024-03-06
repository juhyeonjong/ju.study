package jhj.springHomework.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jhj.springHomework.vo.BoardListVO;


@Repository
public class BoardDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	private final String namespace = "jhj.springHomework.mapper.boardMapper";
	
	public List<BoardListVO> selectAll(){
		return sqlSession.selectList(namespace+".selectAll");
	}
	
	public List<BoardListVO> select1(BoardListVO vo){
		return sqlSession.selectList(namespace+".selectNum", vo);
	}
	
}
