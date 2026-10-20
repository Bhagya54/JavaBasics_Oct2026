package day4;

public class Ex11_ArraysDemo {

	public static void main(String[] args) {
		int id1 = 12;
		int id2 = 13;
		int id3 = 15;
		//sequence of values of same datatype - Array
		//array index starts from zero
		//int[] ids = new int[size]
		//declaration+instantiation+initialization
		//disadv - size
		//Collection Framework - List,Set...
		int ids[];//declaration
		ids=new int[5];//instantiation
		ids[0]=12;
		ids[1]=13;
		ids[2]=14;  //initialization
		ids[3]=20;
		ids[4]=14;
		
		for(int i=0;i<ids.length;i++) {
			System.out.println(ids[i]);
		}
	}

}
