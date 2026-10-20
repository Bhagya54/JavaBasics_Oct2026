package day4;

public class Ex06_For_LoopsDemo {
/*
 * for loop
 * for(initialization;condition;increment/decrement) - 1 to 10
 * while
 * do while
 */
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {//11<=10
		System.out.println("Hello World");
		}
		//10 20 30 ... 100
		System.out.println("10 20 30 ... 100");
		for(int i=10;i<=100;i=i+10) {
			System.out.print(i+" ");
		}
		
		//50 45 40 35 30 .. 5
		System.out.println("50 45 40 35 30 .. 5");
		for(int i=50;i>=5;i=i-5) {
			System.out.print(i + " ");
		}
	}

}
