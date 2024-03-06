package diex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberController {

	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private BoardDAO boardDAO;
	
	public void doGet() {
		//memberDAO bean�� ioc �����̳ʸ� ����Ͽ� ������ �ڵ� ���Թ޾�
		//�ش� dao�� insert �޼ҵ带 ȣ���մϴ�
		memberDAO.insert();
		
		//boardDAO bean�� ioc �����̳ʸ� ����Ͽ� ������ �ڵ� ���Թ޾�
		//�ش� dao�� insert �޼ҵ带 ȣ���մϴ�
		boardDAO.insert();
	}
}

