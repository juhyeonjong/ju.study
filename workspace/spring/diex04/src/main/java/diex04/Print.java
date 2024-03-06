package diex04;

import org.springframework.stereotype.Component;
/*
 * @Component 어노테이션을 사용하여 ioc 컨테이너가 객체를 생성하게 되면
 * 그 객체의 이름은 클래스 명과 동일하지만 앞글자는 소문자로 생성한다.
 */
@Component
public class Print {
	
	public void print01() {
		System.out.println("Print 객체의 print01메소드 호출!");
	}
}
