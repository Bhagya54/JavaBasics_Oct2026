package day9;

public class JREmployee extends EmployeeDetails{

	@Override
	public void getSalary(int basicSalary) {
		System.out.println("Salary:" +basicSalary * 10);
		
	}

	
}
