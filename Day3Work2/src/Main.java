
public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Yusuf ", "Sahin", "8964");
		
		Instructor instructor = new Instructor (2,"Mehmet", "Karli", "7851", "Java&React");
		
		Student student = new Student(3, "Emir", "Yılmaz", "1546");
		
		UserManager userManager = new UserManager();
		
		StudentManager studentManager = new StudentManager();
		
		InstructorManager instructorManager = new InstructorManager();
		
		System.out.println("Add Block ");
		System.out.println("----------");
		
		userManager.add(user);
		studentManager.add(student);
		instructorManager.add(instructor);
		
		System.out.println();
		System.out.println("Delete Block ");
		System.out.println("----------");
		System.out.println();
		
		userManager.delete(user);
		studentManager.delete(student);
		instructorManager.delete(instructor);	
	}
}

