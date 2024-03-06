package diex02;

public class Parent {
	private Child child;

	public Parent(Child child) {
		this.child = child;
	}
	
	public void childInfo() {
		child.method();
	}
	
}
