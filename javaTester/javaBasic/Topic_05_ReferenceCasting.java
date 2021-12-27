package javaBasic;

public class Topic_05_ReferenceCasting {
	public String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void showStudentName() {
		System.out.println("Student Name =" + studentName);
		
	}
	public static void main(String[] args) {
		Topic_05_ReferenceCasting firstStudent = new Topic_05_ReferenceCasting();
		Topic_05_ReferenceCasting secondStudent = new Topic_05_ReferenceCasting();
		
		firstStudent.setStudentName("Nguyen Van A");
		secondStudent.setStudentName(" Le Van B");
		
		firstStudent.showStudentName();
		secondStudent.showStudentName();
		
		
		//Ep kieu
		
		firstStudent = secondStudent;
		
		firstStudent.showStudentName();
		secondStudent.showStudentName();
		
		secondStudent.setStudentName("Test Ep Kieu");
		

		firstStudent.showStudentName();
		secondStudent.showStudentName();
	}
}
