package diex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		//개발자가 의존에 관여하는 소스 코드
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setAddr("전주");
		
		Person p2 = new Person();
		p2.setName("고길동");
		p2.setAge(23);
		p2.setAddr("전주");
		
		Student student1 = new Student();
		student1.setP(p2);
		student1.setSchoolNM("이젠");
		student1.setYear(3);
		student1.studentInfo();
		
		//스프링의 컨테이너를 사용하여 student 객체 호출하여 사용하기
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Student student01 = ctx.getBean("student1", Student.class);
		student01.studentInfo();
		
		
		
		
		
		
		
	}

}
