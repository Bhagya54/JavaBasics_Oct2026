package day7;



public class ConstructorDemo {

	public static void main(String[] args) {
		StudentDemo s1 = new StudentDemo(12,"Tina",1);
		//s1.attendSession();
		System.out.println("First student:"+s1.name);
		
		
		StudentDemo s2=new StudentDemo("Raj","ctypk6976d");
		System.out.println("Second student:"+s2.name);
		
		StudentDemo s3=new StudentDemo(23,1,'A');
		System.out.println("Third student:" + s3.id);
	
		
	}

}
