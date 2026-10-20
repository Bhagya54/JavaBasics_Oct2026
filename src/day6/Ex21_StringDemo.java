package day6;

public class Ex21_StringDemo {
	/*
	 * 1. String is a non-primitive datatype
	 * 2. String is class
	 * 3. Length of a string - length()
	 * 4. Index starts from 0;
	 * 5. 2 ways to create a String
	 *    > String Literal
	 *    > Using new keyword 
	 * int a=10;
	 * int b=10;
	 * a==b > true
	 * 
	 * String - == > Are these both variables pointing to the same object or not
	 * 
	 */

	public static void main(String[] args) {
		String course="Selenium with Java";
		System.out.println("Size of the course:" + course.length());
		System.out.println("Character at a particular index:" + course.charAt(12));
		
		//Get the character at each index
		for(int i=0;i<course.length();i++) {
			char ch = course.charAt(i);
			System.out.print(ch);
		}
		
		//String Literal
		String sl1="Java";
		String sl2="Python";
		String sl3="Java";
		System.out.println();
		System.out.println(sl1==sl2);//false
		System.out.println(sl1==sl3);//true
		
		
		//new keyword
		String sn1=new String("Tea");
		String sn2=new String("Coffee");
		String sn3=new String("Tea");
		
		System.out.println(sn1==sn2);//false
		System.out.println(sn1==sn3);//false
		
		String str1="Hello";
		str1=str1.concat(" World");
		System.out.println(str1);
		str1=str1.concat(" Planet");
		System.out.println(str1);
	}

}
