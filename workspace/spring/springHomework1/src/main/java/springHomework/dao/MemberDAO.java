package springHomework.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	//sql연결을 위한 것
	@Autowired
	SqlSession sqlSession;
	
	
}
