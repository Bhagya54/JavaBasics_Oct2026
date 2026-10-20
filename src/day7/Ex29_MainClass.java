package day7;

public class Ex29_MainClass {

	public static void main(String[] args) {
		Ex25_Student s1 = new Ex25_Student();
		s1.attendSession();
		s1.markAttendance();
		s1.lunchTime();
		s1.submitProject();
		
		Ex26_Teacher t1 = new Ex26_Teacher();
		t1.conductSession();
		t1.evaluateProject();
		t1.lunchTime();
		t1.markAttendance();
		
		Ex27_Staff st1 = new Ex27_Staff();
		st1.calculateSalary();
		st1.verifyAttendance();
		st1.lunchTime();
		st1.markAttendance();

	}

}
