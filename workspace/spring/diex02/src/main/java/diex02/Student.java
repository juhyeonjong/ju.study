package diex02;

public class Student {
	private String schoolNM;
	private int year;
	private Person person;
	private Child child;
	
	public Student(String schoolNM, int year, Person person, Child child) {
		super();
		this.schoolNM = schoolNM;
		this.year = year;
		this.person = person;
		this.child = child;
	}
	
	public void info() {
		child.method();
		System.out.println(schoolNM);
		System.out.println(year);
		System.out.println(person.toString());
	}
	
}
