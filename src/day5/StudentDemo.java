package day5;

public class StudentDemo {
	
	//instance variable -  we can access only through object creation
	int id;
	String name;
	int grade;
	char section;
	static String schoolName="Testing";
	
	
	public static void main(String[] args) {
		
		StudentDemo s1 = new StudentDemo();
		s1.id=123;
		s1.name="hari";
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		StudentDemo s2 = new StudentDemo();
		s2.id=567;
		s2.name="tina";
		System.out.println(s2.id);
		System.out.println(s2.name);
		
		
		System.out.println(schoolName);
		
		
		System.out.println(Country.countryName);
		
	}
	
}
