package day4_copy;

public class ArrayDemo2 {
/*
 * Array - is used to store multiple values of same data types
 * Array index always starts from 0(zero)
 * If we are not assigning any value at a particular index, 
 * Java will automatically assigns a default value to it 
 */
	public static void main(String[] args) {
		
		//declaration+initialization
		String[] testcases= {"LoginTest","RegistrationTest","CheckoutTest"};
		
		for(int i=0;i<testcases.length;i++) {
			System.out.println("Running the test: " +testcases[i]);
		}
		
				
	}

}
