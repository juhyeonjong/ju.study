package diex03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		Parent parent01 = ctx.getBean("parent01",Parent.class);
		parent01.getChild().method();
		
	}

}
