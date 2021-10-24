package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Maze {

	public static void main(String[] args) {
		String[] firstNames = {"Aris", "Nikos", "Caleb", "Garry", "Duarte"};
		String[] lastNames = {"Amp", "Beglis", "Curry", "Kok", "Sarai"};
		
		LinkedList<String> students = new LinkedList<>();
		
		students.push("Aris");
		students.push("Garry");
		students.push("Nik");
		
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
	}
	
}
