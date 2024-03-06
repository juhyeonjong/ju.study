package jhj.springHomework.dao;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jhj.springHomework.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	private final String namespace = "springHomework.mapper.memberMapper";
	
	public MemberVO selectLogin(MemberVO vo) {
		return sqlSession.selectOne(namespace+".selectLogin", vo);
	}
	
	public int join(MemberVO vo) {
		return sqlSession.insert(namespace+".insert", vo);
	}
}
