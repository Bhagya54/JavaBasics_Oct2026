package day7;



public class Ex22_ConstructorDemo {

	public static void main(String[] args) {
		Ex23_StudentDemo s1 = new Ex23_StudentDemo(12,"Tina",1);
		//s1.attendSession();
		System.out.println("First student:"+s1.name);
		
		
		Ex23_StudentDemo s2=new Ex23_StudentDemo("Raj","ctypk6976d");
		System.out.println("Second student:"+s2.name);
		
		Ex23_StudentDemo s3=new Ex23_StudentDemo(23,1,'A');
		System.out.println("Third student:" + s3.id);
	
		
	}

}
