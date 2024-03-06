package diex04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Print print = ctx.getBean("print",Print.class);
		print.print01();
		
		print = ctx.getBean("print01",Print.class);
		print.print01();
		
		BoardController boardCon 
			= ctx.getBean("boardController",BoardController.class);
		boardCon.doPost();
		System.out.println(boardCon.boardDAO.name);
		
		MemberController memberCon
			= ctx.getBean("memberController",MemberController.class);
		memberCon.doGet();
		
		
	}
}
