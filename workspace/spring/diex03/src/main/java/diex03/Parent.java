package diex03;

public class Parent {
	private Child child;
	
	public Parent() {}
	public Parent(Child child) {
		this.child = child;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}
	
	
}
