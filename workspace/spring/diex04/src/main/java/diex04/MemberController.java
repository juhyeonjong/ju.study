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
		//memberDAO bean을 ioc 컨테이너를 사용하여 의존을 자동 주입받아
		//해당 dao의 insert 메소드를 호출합니다
		memberDAO.insert();
		
		//boardDAO bean을 ioc 컨테이너를 사용하여 의존을 자동 주입받아
		//해당 dao의 insert 메소드를 호출합니다
		boardDAO.insert();
	}
}

