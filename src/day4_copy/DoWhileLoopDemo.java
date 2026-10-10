package day4_copy;

public class DoWhileLoopDemo {
/*
 * for(intialization;condition;increment/decrement){
 *
 * }
 * 
 * initialization
 * while(condition){
 * statement,
 * increment/decrement
 * }
 * 
 * do{
 * statements
 * increment/decrement
 * }while(condition)
 * 
 */
	public static void main(String[] args) {
		
		//5 10 15.. 50
		
		int i=500;
		while(i<=50) {
			System.out.print(i + " ");
			i += 5;//i=i+5
		}
		
		do {
			System.out.print(i + " ");//500
			i += 5;//505
		}while(i<=50);//505<=50
		
	}

}
