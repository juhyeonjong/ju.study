package diex01;

import org.springframework.context.support.AbstractApplicationContext;

public class PojoClass {
	
	public void method(Student student) {
		student.studentInfo();
	}
	public void method2(AbstractApplicationContext ctx) {
		Student s1 =ctx.getBean("student1",Student.class);
		s1.studentInfo();
	}
}
