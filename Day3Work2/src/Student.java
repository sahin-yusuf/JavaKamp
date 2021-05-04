
public class Student  extends User { 

	String studentCourse;
	
	public Student(int id, String name, String lastName, String passwords) {
		super(id, name, lastName, passwords);
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	
	
}
