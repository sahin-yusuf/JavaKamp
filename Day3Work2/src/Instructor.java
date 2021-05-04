
public class Instructor extends User {

	String instructorCourse;
	
	
	public Instructor(int id, String name, String lastName, String passwords, String instructorCourse) {
		super(id, name, lastName, passwords);
		this.instructorCourse = instructorCourse;
	}

	public String getInsctructorCourse() {
		return instructorCourse;
	}

	public void setInstructorCourse(String instructorCourse) {
		this.instructorCourse = instructorCourse;
	}



}
