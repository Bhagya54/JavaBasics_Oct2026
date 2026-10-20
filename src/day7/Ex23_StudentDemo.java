package day7;

public class Ex23_StudentDemo {
	/*
	 * Constructor:
	 * same name as that of the class name
	 * 2 types of constructors:
	 * Non Parameterized constructors
	 * Parameterized constructor
	 * 
	 * We can initialize the variables using a constructor 
	 */
	
		
	int id;
	String name;
	int grade;
	char section;
	String pancard;
	/*
	 * Constructor Overloading
	 * Multiple constructors are defined with same name but
	 * difference in 
	 * 1. type of parameters that we pass
	 * 2. no of parameters that we pass
	 * 
	 */
	public Ex23_StudentDemo(int id,String name,int grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	public Ex23_StudentDemo(String name,String pancard) {
		
		this.name=name;
		this.pancard=pancard;
	}
	
	public Ex23_StudentDemo(int id,int grade,char section) {
		this.id=id;
		this.grade=grade;
		this.section=section;
	}
	
	public void attendSession() {
		System.out.println("Student attends session");
		System.out.println(id);
	}
	
	public void submitProject() {
		System.out.println("Student submits project");
		System.out.println(id);
	}
	
	
	
}
