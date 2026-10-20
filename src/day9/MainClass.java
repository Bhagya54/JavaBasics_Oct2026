package day9;

public class MainClass {

	public static void main(String[] args) {
//		ICICIBank icici=new ICICIBank();
//		icici.deposit();
//		icici.withdraw();
//		
//		HDFCBank hdfc=new HDFCBank();
//		hdfc.deposit();
//		hdfc.withdraw();
		
		//can we create an object of an interface - RBI
		//We cannot create an object of an interface
		//RBI rbi=new RBI();
		
		RBI rbi=new ICICIBank();
		rbi.deposit();
		rbi.withdraw();
		
		rbi = new HDFCBank();
		rbi.deposit();
		rbi.withdraw();
		
		
		/*
		 * WebDriver - interface
		 * 
		 * WebDriver driver=new ChromeDriver();
		 * 
		   driver=new EdgeDriver();
		 * driver=new FirefoxDriver();
		 * 
		 * XYZBrowser - I support selenium - implements WebDriver
		 * 
		 */

		EmployeeDetails emp=new JREmployee();
		emp.companyName();
		emp.getSalary(2000);
		
		emp=new SREmp();
		emp.getSalary(2000);
			
			
		
	}

}
