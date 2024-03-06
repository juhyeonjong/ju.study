package aopex02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		A a = ctx.getBean("a",A.class);
		a.method01();
		a.method02();
		
		B b = ctx.getBean("b",B.class);
		b.sum(10,20);
		b.minus(10,20);
	}

}

