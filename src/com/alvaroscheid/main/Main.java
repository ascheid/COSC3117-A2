package com.alvaroscheid.main;

import java.util.Scanner;

import com.alvaroscheid.model.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		String buffer = new String();
		
		System.out.print("Enter the intended degree: ");
		System.out.print("Enter the year you are in: ");
		student.setYearInTheProgram(scanner.nextInt());
		System.out.print("Enter the courses you have taken: (enter e to exit)");
		buffer = scanner.nextLine();
		
		while(!buffer.equals("e")) {
			student.getCourseTaken().add(buffer);
			buffer = scanner.nextLine();
		}
		
		scanner.close();

	}

}
