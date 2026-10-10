package day4_copy;

public class ArrayDemo {
/*
 * Array - is used to store multiple values of same data types
 * Array index always starts from 0(zero)
 * If we are not assigning any value at a particular index, 
 * Java will automatically assigns a default value to it 
 * 3 parts - Array
 * >Declaration
 * >instantiation
 * >initialization
 * 
 */
	public static void main(String[] args) {
		int[] ids;//declaration - array of integer
		ids = new int[5];//instantiation
		
		
		ids[0]=20;
		ids[1]=30; //initialization
		
		ids[3]=23;
		ids[4]=67;
		
		
		for(int i=0;i<ids.length;i++) {//5<5
			System.out.println(ids[i]);//ids[3]
		}
		
		//20 30 12 23 67
		
//		System.out.println(ids[0]);
//		System.out.println(ids[1]);
//		System.out.println(ids[2]);
//		System.out.println(ids[3]);
//		System.out.println(ids[4]);
		
				
	}

}
