package day4_copy;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				//break;//terminate the loop
				continue;//skip that iteration
			}
			System.out.println(i);
		}
		
		System.out.println("Outside the loop");
	}

}

//1
//2
//3
//4
//6
//7
//8
//9
//10
//Outside the loop