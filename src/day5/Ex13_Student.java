package day5;

public class Ex13_Student {
	//properties - id,name,grade,section
	//behaviour - attendSession,submitProject
	
	/*
	 * s1 - 123,"",1,A - object
	 * classname refVar=new classname(); - object
	 * 
	 * s2 - 456,"",2,B- object
	 * classname refVar=new classname(); - object
	 * 
	 * int - 0
	 * string - null
	 * 
	 * 
	 */
	
	int id;
	String name;
	int grade;
	char section;
	
	public void attendSession() {
		System.out.println("Student attends session");
		System.out.println(id);
	}
	
	public void submitProject() {
		System.out.println("Student submits project");
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		Ex13_Student s1=new Ex13_Student(); // each student - 1 object
		s1.id=123;//initialization
		
		s1.grade=1;
		s1.section='A';
		System.out.println("Student 1 Details: " + s1.id + " name: " + s1.name);
		s1.attendSession();
		s1.submitProject();
		
		
		Ex13_Student s2=new Ex13_Student(); // each student - 1 object
		s2.id=345;
		s2.name="tina";
		s2.grade=2;
		s2.section='B';
		System.out.println("Student 2 Details: " + s2.id+ " name: " + s2.name);
		s2.attendSession();
		s2.submitProject();
	}
	
}
