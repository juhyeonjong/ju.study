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
		System.out.println("�Խñ� ��� ��...");
	}
	
	public void update() {
		System.out.println("�Խñ� ���� ��...");
	}
	
	public void delete() {
		System.out.println("�Խñ� ���� �� ...");
	}
	
	public void select() {
		System.out.println("�Խñ� ��ȸ ��...");
	}
}
