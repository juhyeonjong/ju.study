package diex01;

public class Student {
	private Person p;
	private String schoolNM;
	private int year;
	
	public void studentInfo() {
		System.out.println("�̸�:"+p.getName());
		System.out.println("����:"+p.getAge());
		System.out.println("�ּ�:"+p.getAddr());
		System.out.println("�б���:"+schoolNM);
		System.out.println("�г�:"+year);
	}
	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public String getSchoolNM() {
		return schoolNM;
	}
	public void setSchoolNM(String schoolNM) {
		this.schoolNM = schoolNM;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
