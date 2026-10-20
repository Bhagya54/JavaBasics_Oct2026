package day9;

public class Ex37_AbstractionDemo {

	public static void main(String[] args) {
		/*
		 * Abstraction - hiding the implementation
		 * 2 ways:
		 *  > Interface - 100% abstraction
		 *  > Abstract class - 0% - 100% abstraction
		 *  
		 *  
		 *  
		 *  
		 * RBI - Reserve bank of India.
		 *  deposit
		 *  withdraw
		 *  
		 *  Interface -
		 *  By default every method should have only declaration(no implementation)
		 	Abstract method
		 	
		 	Abstract class - We can have both normal methods and abstract method
		 	
		 */

//		ChildClass c1 = new ChildClass();
//		c1.abc();
//		c1.xyz();
		
		Ex42_AbstractClassDemo ab = new Ex43_ChildClass();
		ab.abc();
		ab.xyz();
	}

}
