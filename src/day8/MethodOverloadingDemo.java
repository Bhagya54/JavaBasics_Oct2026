package day8;

public class MethodOverloadingDemo {
/*
 * Method Overloading
 * > All methods stay in the same class itself - No inheritance required
 * > same method name but difference in:
 *      > no.of parameters that we send
 *      > type of parameters
 * 
 */
	public void add(int a,int b) {
		System.out.println("Sum of 2 integer values is: " + (a+b));
	}
	
	public void add(int a,int b,int c) {
		System.out.println("Sum of 3 integer values is: " + (a+b+c));
	}
	
	public void add(double a,double b) {
		System.out.println("Sum of 2 double values is: " + (a+b));
	}
	public void add(String a,int b) {
		System.out.println("Integer+string " + (a+b));
	}
	
	
	public static void main(String[] args) {
		MethodOverloadingDemo md = new MethodOverloadingDemo();
		md.add(23,5, 2);
		md.add(67.2,0.8);
		md.add(60,10);
		
		
	}
}
