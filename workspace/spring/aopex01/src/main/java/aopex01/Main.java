package aopex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		A a = ctx.getBean("a",A.class);
		a.method01();
		a.method02();
		
		B b = ctx.getBean("b",B.class);
		b.method01();
		b.method02();
		
		C c = ctx.getBean("c",C.class);
		c.method01();
		c.method02();
	}

}
