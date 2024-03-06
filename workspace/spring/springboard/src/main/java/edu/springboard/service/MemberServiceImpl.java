package edu.springboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.springboard.dao.MemberDAO;
import edu.springboard.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDAO;
	
	@Override
	public MemberVO selectLogin(MemberVO vo) {
		return memberDAO.selectLogin(vo);
	}
	
}
