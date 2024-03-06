package diex02;

public class Person {
	private String name;
	private int age;
	private String addr;
	
	public Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}
