package edu.springboard.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.springboard.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	private final String namespace = "edu.springboard.mapper.memberMapper";
	
	public MemberVO selectLogin(MemberVO vo) {
		return sqlSession.selectOne(namespace+".selectLogin", vo);
	}
}
