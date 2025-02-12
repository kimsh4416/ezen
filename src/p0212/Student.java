package p0212;

public class Student {

	private String name;
	private int grade;
	private String schoolName;
	
	public void setName(String name){
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public String toString() {
		return name + grade + schoolName;
	}
}
