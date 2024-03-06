package edu.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.board.dao.MemberDAO;
import edu.board.vo.MemberVO;
import edu.board.vo.SearchVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDAO;
	
	@Override
	public List<MemberVO> list(SearchVO vo) {
		return memberDAO.list(vo);
	}

	@Override
	public int insert(MemberVO vo) {
		return memberDAO.insert(vo);
	}

	@Override
	public MemberVO selectOneByMno(int mno) {
		return memberDAO.selectOneByMno(mno);
	}

	@Override
	public int update(MemberVO vo) {
		return memberDAO.update(vo);
	}

}
