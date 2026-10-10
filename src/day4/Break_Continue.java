package day4;

public class Break_Continue {
//break - terminating the loop
	//continue - skip the iteration
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {//6
			if(i==5) {
				//break;
				continue;
			}
			System.out.println(i);//1 2 3 4 6 7 8 9 10
		}
		

	}

}
