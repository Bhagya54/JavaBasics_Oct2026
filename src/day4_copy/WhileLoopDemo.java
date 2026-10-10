package day4_copy;

public class WhileLoopDemo {
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
 * 
 */
	public static void main(String[] args) {
		
		//5 10 15.. 50
		
		int i=5;
		while(i<=50) {
			System.out.print(i + " ");
			i += 5;//i=i+5
		}
		
	}

}
