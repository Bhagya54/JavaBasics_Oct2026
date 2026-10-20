package day2;

public class Ex04_OperatorsDemo {

	public static void main(String[] args) {
		/*
		 * Unary Operator - 1 operand
		 * 		>Post/Pre increment/decrement
		 * 		
		 * Binary Operator - 2 operands
		 * 		1. Arithmetic Operator - +,-,*,/,%
		 * 		2. Relational Operators - <,>,<=,>=,== - returns a true/false
		 * 		3. Logical Operators - &&,||,!
		 * 
		 * 
		 * 
		 * Ternary Operator - 3 operands
		 * 
		 * Assignment Operator - =
		 */

		
		int a=10;
		//Post Increment - a++ => a+1
		//1.assign value of a
		//2.Increments by 1
		System.out.println("Post Increment: "+ a++);//10 > 11
		System.out.println(a);//11
		
		
		//1.Increments by 1
		//2.assign value of a
				
		int b=20;
		System.out.println("Pre Increment: "+ (++b));//21
		System.out.println(b);
		
		
		//1.assign value of c
		//2.Decrement by 1
		int c = 30;
		System.out.println("Post Decrement: "+ c--);//30 > 29
		System.out.println(c);//29
		
		
		//1.Decrement by 1
		//2.assign value of d
				
		int d=21;
		System.out.println("Pre Decrement: "+ (--d));//20
		System.out.println(d);
		
		
		System.out.println("Arithmetic Operators");
		int x=20;
		int y=5;
		System.out.println(x+y);//25
		System.out.println(x-y);//15
		System.out.println(x/y);//quotient - 4
		System.out.println(x%y);//remainder - 0
		System.out.println(x*y);//100
		
		System.out.println("Relational Operators");
		
		System.out.println(x<=y);//false - boolean
		System.out.println(x>=y);//true
		
		y=20;
		System.out.println(x==y);//true
		
		
		System.out.println("Logical Operators");
		
		x=400;
		y=150;
		int z=200;
		
		System.out.println(x>y && x>z);//true && true > true
		System.out.println(x>y && y>z);// true && false > false
		
		System.out.println(x>y || x>z);//true || true > true
		System.out.println(x>y || y>z);// true || false > true
		
		System.out.println(!(x>y && x>z));//true > false
		
		
		System.out.println("Ternary Operator");
		//condition?statement1:statement2
		
		//x=100,y=150
		x=100;
		System.out.println(x>y?"x is the greatest":"y is the greatest");
		
		
	}

}
