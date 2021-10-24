package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		String[] firstNames = {"Aris", "Nikos", "Caleb", "Garry", "Duarte"};
		String[] lastNames = {"Amp", "Beglis", "Curry", "Kok", "Sarai"};
		
		List<User> users = new ArrayList<User>();
		
		
		for(int i = 0; i<firstNames.length; i++) {
			
			User us = new User(firstNames[i], lastNames[i]);
			
			users.add(us);
			
		}
		
		//for(User u : users) {
		//	System.out.println(u.getFullName());
		//}
		User u = new User("aris","amp");
		users.add(u);
		
		
		
		//User.printUser(users);
		//User.searchUser(users, u);
		User.searchUser(users,"aris amp");
		
		
	}
	
}
