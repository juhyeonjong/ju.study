package diex03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //���� Ŭ������ bean configuration �������� �ǹ���.
public class ApplicationContext {

	@Bean
	public Person person01() {
		
		Person person = new Person();
		person.setName("ȫ�浿");
		person.setAge(30);
		person.setAddr("����");
		
		return person;
	}
	
	
	@Bean
	public Child child01() {
		return new Child();
	}
	
	@Bean
	public Parent parent01() {
		Parent p = new Parent();
		p.setChild(child01()); //setter����
		return p;
	}
	
	@Bean
	public Parent parent02() {
		return new Parent(child01()); //������ ����
	}
	
}
