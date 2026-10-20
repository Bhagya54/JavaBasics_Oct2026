package day3;

public class Ex05_ControlStatementsDemo {
	/*
	 * if 
	 * if else - true - if / false - else 
	 * marks >=  75  Grade - Distintion 
	 * marks< 75 && marks >= 60 - First class
	 * marks < 60 && marks >= 50 - Second class
	 * marks < 50 && marks >= 40 - Third class 
	 * marks < 40 - failed
	 * if .. else if .. else
	 * 
	 */
	public static void main(String[] args) {
		int age = 32;
		if (age >= 18) {
			System.out.println("You are allowed for voting");
		} else {
			System.out.println("You are not allowed for voting");
		}

		int marks = 64;
		if(marks >=  75) {
			System.out.println("Distintion ");
		}
		else if(marks< 75 && marks >= 60) {
			System.out.println("First class ");
		}
		else if(marks < 60 && marks >= 50) {
			System.out.println("Second class ");
		}
		else if(marks< 50 && marks >= 40) {
			System.out.println("Third class ");
		}
		else if(marks< 40) {
			System.out.println("Failed");
		}
		else {
			System.out.println("Not relevant output");
		}
		
		int day=1;
		switch (day) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		default:
			System.out.println("Invalid input");
		}
		
	}

}
