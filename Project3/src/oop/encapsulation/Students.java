package oop.encapsulation;

public class Students {

	private String stName;
	private int stID;
	private String dob;
	public String grade;
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStID() {
		return stID;
	}
	public void setStID(int stID) {
		this.stID = stID;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGrade() {
		return grade;
	}	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	private void demoOfPrivate() {
		System.out.println("This is hidden");
	}
	public void display() {
		demoOfPrivate();
	}
}
