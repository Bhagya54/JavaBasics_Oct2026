package day1;

public class TypeCastingDemo {

	/* B1 - 5l container -2l water
	 * B2 - 3l container
	 * 
	 * Task1 : B2>B1 - possible
	 * Task2 : B1>B2 - chances of data loss - confirm
	 * 
	 */
	public static void main(String[] args) {
		byte b1=23;//B2
		int i1=b1;//B1
		System.out.println(b1);//23
		System.out.println(i1);//23
		
		int i2=67;//B1
		byte b2=(byte) i2;//B2 - -128 to 127
		System.out.println(i2);//67
		System.out.println(b2);//67
		//data loss - garbage value
		
		
		float f1=56.78f;//Bigger container
		int i3=(int) f1;//small container
		System.out.println(f1);//56.78
		System.out.println(i3);//56
		
		
		int i4=89;//smaller container
		float f2=i4;//larger container
		System.out.println(i4);//89
		System.out.println(f2);//89.0
		
		char c1='A';//smaller container
		int i5=c1;//larger container
		System.out.println(c1);//A
		System.out.println(i5);//65 - Ascii value of character

		
		int i6=67;//larger 
		char c2=(char) i6;//smaller
		System.out.println(i6);//67
		System.out.println(c2);//C
		
		
		String str1="123";
		int i7=Integer.parseInt(str1);
		System.out.println(str1+1);//1231
		System.out.println(i7+1);//124
		
		double d2=56.89;
		String str2=Double.toString(d2);
		System.out.println(d2+1);//57.89
		System.out.println(str2+1);//56.891
		
		
		
	}

}
