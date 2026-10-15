package day7;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.attendSession();
		s1.markAttendance();
		s1.lunchTime();
		s1.submitProject();
		
		Teacher t1 = new Teacher();
		t1.conductSession();
		t1.evaluateProject();
		t1.lunchTime();
		t1.markAttendance();
		
		Staff st1 = new Staff();
		st1.calculateSalary();
		st1.verifyAttendance();
		st1.lunchTime();
		st1.markAttendance();

	}

}
