package diex04;

import org.springframework.stereotype.Component;

@Component
public class MemberDAO {

	public void insert() {
		System.out.println("회원 등록 중...");
	}
	
	public void update() {
		System.out.println("회원 수정 중...");
	}
	
	public void delete() {
		System.out.println("회원 삭제 중...");
	}
	
	public void select() {
		System.out.println("회원 조회 중...");
	}
	
}
