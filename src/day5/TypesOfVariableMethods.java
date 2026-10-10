package day5;

public class TypesOfVariableMethods {
	
	int id=10;
	int grade='1';
	
	
	
	public void getAge() {
		int age=12;
		System.out.println(age);
		System.out.println(id);
		System.out.println(grade);
	}
	
	public void getNameAndAge() {
		String name="Sara";
		//System.out.println(age);
		System.out.println(name);
		System.out.println(id);
		System.out.println(grade);
	}

	public static void main(String[] args) {
		/*
		 * Types of variables:
		 * 	1.local: variable defined inside a method.Access only with the method
		 *  2.global : you can access them through out your class
		 * 		a.instance 
		 * 				- can be accessed only via object reference 
		 * 				- variables which are not common across all the objects
		 * 		
		 * 		b.static
		 * 				- common across all the object(schoolName common for all student)
		 * 				- use static keyword 
		 * 				- access without the object creation
		 */

	}

}
