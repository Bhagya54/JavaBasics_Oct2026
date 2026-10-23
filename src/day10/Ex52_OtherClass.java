package day10;

public class Ex52_OtherClass {

	public static void main(String[] args) {
		Ex51_Student st1 = new Ex51_Student();
		//st1.setId(13);
		st1.setGender('Z');
		System.out.println("student id:"+st1.getId());
		System.out.println("Gender:" + st1.getGender());
	}

}
