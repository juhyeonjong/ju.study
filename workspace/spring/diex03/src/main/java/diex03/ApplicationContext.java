package diex03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //현재 클래스가 bean configuration 파일임을 의미함.
public class ApplicationContext {

	@Bean
	public Person person01() {
		
		Person person = new Person();
		person.setName("홍길동");
		person.setAge(30);
		person.setAddr("전주");
		
		return person;
	}
	
	
	@Bean
	public Child child01() {
		return new Child();
	}
	
	@Bean
	public Parent parent01() {
		Parent p = new Parent();
		p.setChild(child01()); //setter주입
		return p;
	}
	
	@Bean
	public Parent parent02() {
		return new Parent(child01()); //생성자 주입
	}
	
}
