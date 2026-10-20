package day9;

public class SREmp extends EmployeeDetails{

	@Override
	public void getSalary(int basicSalary) {
		System.out.println("Salary:" + basicSalary*70);
		
	}

}
