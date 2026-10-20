package day9;

public class Ex41_MainClass {

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
		
		Ex38_RBI rbi=new Ex39_ICICIBank();
		rbi.deposit();
		rbi.withdraw();
		
		rbi = new Ex40_HDFCBank();
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

		Ex47_EmployeeDetails emp=new Ex48_JREmployee();
		emp.companyName();
		emp.getSalary(2000);
		
		emp=new Ex49_SREmp();
		emp.getSalary(2000);
			
			
		
	}

}
