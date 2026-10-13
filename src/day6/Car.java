package day6;

public class Car {

	//properties - variables
	//behaviour - methods
	/*
	 * Types of Variables:
	 * 1.Local variables - within methods
	 * 2.Global Variables - all the methods of a class
	 * 		> instance
	 * 		> static
	 * 
	 * Types of methods:
	 * 1.instance methods - You can access both static variables
	 * as well as instance variables inside the instance method
	 * 2.static methods -  You can access only static variables
	 * >static keyword
	 */
	
	String carBrand;
	String carModel;
	String color;
	int howManySeaters;
	static int roadTax=2345;
	
	public void getCarDetails(){
		System.out.println("Car Brand: " + carBrand);
		System.out.println("Car Model: " + carModel);
		System.out.println("Car Road Tax: " + roadTax);
	}
	
	public static void getRoadTax() {
		System.out.println("Road Tax:" + roadTax);
		//System.out.println("Car Brand: " + carBrand);
	}
	
	
}
