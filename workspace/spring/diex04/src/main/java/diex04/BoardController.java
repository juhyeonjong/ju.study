package diex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoardController {
	/*
	 * @Resource 어노테이션은 이름을 기준으로 의존을 자동 주입한다.
	 * bean의 이름은 중복 되는 경우가 없으므로 이름이 일치하는 bean이 없다면
	 * 무조건 오류가 발생한다. 혹은 bean의 이름과 주입될 필드의 이름이 같으나
	 * 타입이 달라도 오류가 발생한다.
	 */
	/*
	 * @Autowired,@inject 어노테이션은 타입을 기준으로 의존을 자동 주입한다.
	 * 이때 타입이 같은 bean이 여러개 인 경우 이름이 같은 bean의 우선순위가 높아진다.
	 * 혹시, 타입이 같은 bean이 여러개 이며 이름이 같은 bean이 하나도 없다면 오류 발생!
	 * 보완하기 위하여 @Qualifier 어노테이션을 사용하여 주입되는 bean의 이름을 특정할 수 있다.
	 */
	@Autowired
	@Qualifier("boardDAO02")
	public BoardDAO boardDAO;
	
	public void doGet() {
		System.out.println("게시글 get 요청 페이지");
	}
	
	public void doPost() {
		System.out.println("게시글 post 요청 페이지");
		boardDAO.insert();
	}
}
