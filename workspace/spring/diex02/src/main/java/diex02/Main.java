package diex02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//개발자가 직접 객체를 생성하여 관리
		Person person01 = new Person("홍길동",30,"전주");
		System.out.println(person01.toString());
		
		
		//개발자가 직접 객체의 의존을 생성자를 통해 주입
		Child child01 = new Child();
		
		Parent parent01 = new Parent(child01); //생성자 의존 주입 발생!!
		parent01.childInfo();
		
		
		//스프링 ioc 컨테이너를 사용하여 xml의 bean 객체 생성하여 사용하기
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Person person01spring = ctx.getBean("person01",Person.class);
		System.out.println(person01spring.toString());
		
		//person02 bean 깨내서 toString 출력하세요.
		Person person02 = ctx.getBean("person02",Person.class);
		System.out.println(person02.toString());
		
		Parent parent02spring = ctx.getBean("parent01",Parent.class);
		parent02spring.childInfo();
	}

}
