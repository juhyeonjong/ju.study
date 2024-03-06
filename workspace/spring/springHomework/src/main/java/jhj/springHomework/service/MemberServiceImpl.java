package jhj.springHomework.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import jhj.springHomework.dao.MemberDAO;
import jhj.springHomework.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDAO;
	
	@Override
	public MemberVO selectLogin(MemberVO vo) {
		return memberDAO.selectLogin(vo);
	}
	
	@Override
	public int insert(MemberVO vo) {
		return memberDAO.join(vo);
	}
	
}
