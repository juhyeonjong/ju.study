package edu.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.board.vo.MemberVO;
import edu.board.vo.SearchVO;

@Repository
public class MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	public List<MemberVO> list(SearchVO vo){
		List<MemberVO> list  = sqlSession.selectList("edu.board.mapper.memberMapper.selectAll",vo);
		
		return list;
	}
	
	public int insert(MemberVO vo) {
		return sqlSession.insert("edu.board.mapper.memberMapper.insert", vo);
	}
	
	public MemberVO selectOneByMno(int mno) {
		return sqlSession.selectOne("edu.board.mapper.memberMapper.selectOneByMno", mno);
	}
	
	public int update(MemberVO vo) {
		return sqlSession.update("edu.board.mapper.memberMapper.update", vo);
	}
}








