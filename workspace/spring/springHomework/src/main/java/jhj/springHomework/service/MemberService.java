package jhj.springHomework.service;

import org.springframework.stereotype.Service;

import jhj.springHomework.vo.MemberVO;

@Service
public interface MemberService {
	//�α��� �ϴ� �޼ҵ�(��ӹ޴°����� �������ؾ���)
	MemberVO selectLogin(MemberVO vo);
	
	//ȸ������ �ϴ� �޼ҵ�(��ӹ޴°����� ������ �ؾ���)
	int insert(MemberVO vo);
}