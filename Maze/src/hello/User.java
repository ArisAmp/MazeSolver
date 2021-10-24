package hello;

import java.util.List;

public class User {
	private String firstName;
	private String lastName;
	
	public User() {
		
	}
	
	public User(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	
	public String getFirstName() {
		return firstName.toUpperCase();
	}
	
	
	public String getLastName() {
		return lastName.toUpperCase();
	}
	
	public void setFirstName(String fn) {
		firstName = fn;
	}
	
	public void setLastName(String ln) {
		lastName = ln;
	}
	
	public static void printUser(List<User> users) {
		
		for(User u: users) {
			System.out.println(u.getFullName());
		}
		
	}
	
	
	public static void searchUser(List<User> users, User u) {
		searchUser(users, u.getFullName());
	}
	
	
	public static void searchUser(List<User> users, String name) {
		name = name.toUpperCase();
		
		boolean found = false;
		
			for(User user : users) {
				if (user.getFullName().equals(name)) {
					System.out.println("FOUND at index " + users.indexOf(user));
					found = true;
				}
			}
			
			if (!found) {
				System.out.println("NOT FOUND.");
			}
	}
	
	
}
