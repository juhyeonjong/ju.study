package diex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		//�����ڰ� ������ �����ϴ� �ҽ� �ڵ�
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setAge(30);
		p1.setAddr("����");
		
		Person p2 = new Person();
		p2.setName("��浿");
		p2.setAge(23);
		p2.setAddr("����");
		
		Student student1 = new Student();
		student1.setP(p2);
		student1.setSchoolNM("����");
		student1.setYear(3);
		student1.studentInfo();
		
		//�������� �����̳ʸ� ����Ͽ� student ��ü ȣ���Ͽ� ����ϱ�
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Student student01 = ctx.getBean("student1", Student.class);
		student01.studentInfo();
		
		
		
		
		
		
		
	}

}
