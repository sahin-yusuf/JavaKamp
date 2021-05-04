
public class User {
	int id;
	String name;
	String lastName;
	String passwords;
	
	public User(int id, String name, String lastName, String passwords) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.passwords = passwords;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	
	

}
