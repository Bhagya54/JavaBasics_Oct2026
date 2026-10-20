package day6;

public class Ex19_ArrayDemo {
	/*
	 * default value gets initialized by java, if we are not initialization Array
	 * index starts from zero arrayName.length
	 * 3 part - 
	 *  > declaration
	 *  > instantiation
	 *  > initialization
	 * byte: 0 
	 * short: 0 
	 * int: 0 
	 * long: 0L 
	 * float: 0.0f 
	 * double: 0.0d 
	 * char: '\u0000' (null character) 
	 * boolean: false
	 */
	public static void main(String[] args) {
		String[] names;//declaration
		names = new String[10];//instantiation
		
		
		names[0] = "Ram";
		names[1] = "Tina"; //initialization
                     
		names[3] = "Raj";
		names[4] = "Iyanah";

		System.out.println("Length of an array:" + names.length);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
