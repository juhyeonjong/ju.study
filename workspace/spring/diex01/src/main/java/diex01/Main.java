package diex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//일반적으로 개발자가 하는 의존성 주입예
		
		Person p1 = new Person();
		//p1의 name 필드 값을 "홍길동" 대입하세요.
		p1.setName("홍길동"); //setter 의존 주입
		System.out.println("p1:"+p1.getName());
		
		Child c1 = new Child();
		Parent parent1 = new Parent();
		parent1.setC(c1); //setter 의존주입
		
		parent1.getC().methodChild();
		
		//spring의 ioc 컨테이너를 사용하여 xml읽어 들인 후 객체 호출하기
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Person springP1 = ctx.getBean("p1",Person.class);
		System.out.println(springP1.getName());
		
		Parent parent01 = ctx.getBean("parent01",Parent.class);
		parent01.getC().methodChild();
		
	}

}
