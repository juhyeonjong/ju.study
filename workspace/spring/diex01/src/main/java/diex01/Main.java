package diex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//�Ϲ������� �����ڰ� �ϴ� ������ ���Կ�
		
		Person p1 = new Person();
		//p1�� name �ʵ� ���� "ȫ�浿" �����ϼ���.
		p1.setName("ȫ�浿"); //setter ���� ����
		System.out.println("p1:"+p1.getName());
		
		Child c1 = new Child();
		Parent parent1 = new Parent();
		parent1.setC(c1); //setter ��������
		
		parent1.getC().methodChild();
		
		//spring�� ioc �����̳ʸ� ����Ͽ� xml�о� ���� �� ��ü ȣ���ϱ�
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Person springP1 = ctx.getBean("p1",Person.class);
		System.out.println(springP1.getName());
		
		Parent parent01 = ctx.getBean("parent01",Parent.class);
		parent01.getC().methodChild();
		
	}

}
