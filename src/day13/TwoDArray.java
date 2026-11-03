package day13;

public class TwoDArray {

	public static void main(String[] args) {
		int[] arrA= {12,45,67};
		String[][] arrB=new String[3][2];
		arrB[0][0]="username1";
		arrB[0][1]="password1";
		
		arrB[1][0]="username2";
		arrB[1][1]="password2";
		
		arrB[2][0]="username3";
		arrB[2][1]="password3";
		
//		System.out.println(arrB[0][0]);
//		System.out.println(arrB[0][1]);
//		System.out.println(arrB[1][0]);
//		System.out.println(arrB[1][0]);
		
		for(int row=0;row<arrB.length;row++) {//row=3<3
			for(int col=0;col<arrB[row].length;col++) {//col=2<2
				System.out.println(arrB[row][col]);//arrB[2][1]
			}
		}

	}

}
