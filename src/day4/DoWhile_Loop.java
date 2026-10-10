package day4;

public class DoWhile_Loop {
/*
 * for loop
 * for(initialization;condition;increment/decrement) - 1 to 10
 * while
 * initialization
 * while(condition){
 * statements...
 * increment/decrement
 * }
 * do while
 *  initialization
 *  do{
 *  statements
 *  increment/decrement
 *  }while(condition)
 * 
 */
	public static void main(String[] args) {
		int i=100;
		while(i<=10) {//11<=10
			System.out.print(i + " ");//1 2.. 10 
			i++;
		}
		
		do
		{
			System.out.print(i + " ");//100
			i++;//101
		}while(i<=10);//101<=10
	}

}
