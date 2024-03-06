package diex02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		
		//개발자가 객체 생성및 의존 주입하는 경우
		Child child = new Child();
		Person person01 = new Person("홍길동",30,"전주");
		Person person02 = new Person("양길동",20,"서울");
		
		Student student01 
			= new Student("이젠",3,person01,child);
		Student student02 
			= new Student("아트",3,person02,child);
		
		student01.info();
		System.out.println("------------------------");
		student02.info();
		
		//applicationContext2.xml을 새로 생성합니다.
		//해당 xml에 main 메소드와 같은 데이터를 갖는 객체 5개를 만듭니다
		//그 후 각 student객체들을 꺼내와 info 메소드를 호출하세요.

		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext2.xml");
		
		student01 = ctx.getBean("student01", Student.class);
		student02 = ctx.getBean("student02", Student.class);
		
		student01.info();
		System.out.println("------------------------");
		student02.info();
		
		
		
	}

}
