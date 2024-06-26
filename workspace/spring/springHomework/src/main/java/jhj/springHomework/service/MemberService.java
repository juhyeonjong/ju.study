package jhj.springHomework.service;

import org.springframework.stereotype.Service;

import jhj.springHomework.vo.MemberVO;

@Service
public interface MemberService {
	//로그인 하는 메소드(상속받는곳에서 재정의해야함)
	MemberVO selectLogin(MemberVO vo);
	
	//회원가입 하는 메소드(상속받는곳에서 재정의 해야함)
	int insert(MemberVO vo);
}
