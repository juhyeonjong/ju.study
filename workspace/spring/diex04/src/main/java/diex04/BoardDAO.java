package diex04;

import org.springframework.stereotype.Component;

@Component
public class BoardDAO {

	public String name = "boardDAO01";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void insert() {
		System.out.println("게시글 등록 중...");
	}
	
	public void update() {
		System.out.println("게시글 수정 중...");
	}
	
	public void delete() {
		System.out.println("게시글 삭제 중 ...");
	}
	
	public void select() {
		System.out.println("게시글 조회 중...");
	}
}
