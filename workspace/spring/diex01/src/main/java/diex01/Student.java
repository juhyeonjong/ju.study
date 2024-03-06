package diex01;

public class Student {
	private Person p;
	private String schoolNM;
	private int year;
	
	public void studentInfo() {
		System.out.println("이름:"+p.getName());
		System.out.println("나이:"+p.getAge());
		System.out.println("주소:"+p.getAddr());
		System.out.println("학교명:"+schoolNM);
		System.out.println("학년:"+year);
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
