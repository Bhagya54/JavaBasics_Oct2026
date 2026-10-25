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
		String sn1=new String("tea");
		String sn2=new String("Coffee");
		String sn3=new String("Tea");
		
		System.out.println(sn1==sn2);//false
		System.out.println(sn1==sn3);//false
		
		String str1="Hello";
		str1=str1.concat(" World");
		System.out.println(str1);
		str1=str1.concat(" Planet");
		System.out.println(str1);
		
		System.out.println(sn1.equals(sn3));//false
		System.out.println(sn1.equalsIgnoreCase(sn3));//true
		
		String st="selenium";
		
		System.out.println("Length of string st: "+st.length());//8
		System.out.println("Value at index 2: " + st.charAt(2));//l
		
		System.out.println(st.concat(" with java"));
		System.out.println(st.contains("ium"));
		
		/*char[] ch= {'s','e','l','e'};
		System.out.println(ch[0]);*/
		
		System.out.println(st.endsWith("ium"));
		System.out.println(st.startsWith("s"));
		
		System.out.println(st.indexOf("e"));//1
		System.out.println(st.lastIndexOf("e"));//3
		
		//System.out.println(st.replace("e", "n"));
		System.out.println(st.substring(2,5));
	
		char[] values=st.toCharArray();
		for(int index=0;index<values.length;index++) {
			System.out.println(values[index]);
		}
		
		System.out.println(st.toUpperCase());//SELENIUM
		st="     java    ";
		System.out.println(st.trim());
	
		
		/*
		 * isEmpty()
		 * isBlank()
		 */
		String st1="";
		System.out.println("Is empty:"+st1.isEmpty());
		System.out.println("Is Blank:" + st1.isBlank());
		
		
		
	}

}
