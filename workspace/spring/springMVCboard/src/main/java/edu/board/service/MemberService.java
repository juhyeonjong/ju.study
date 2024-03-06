package edu.board.service;

import java.util.List;

import edu.board.vo.MemberVO;
import edu.board.vo.SearchVO;

public interface MemberService {

	List<MemberVO> list(SearchVO vo);
	int insert(MemberVO vo);
	MemberVO selectOneByMno(int mno);
	int update(MemberVO vo);
}
