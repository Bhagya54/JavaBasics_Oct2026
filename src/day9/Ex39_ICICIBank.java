package day9;

public class Ex39_ICICIBank implements Ex38_RBI{
	public void deposit() {
		System.out.println("ICICI deposit of 1 lakh/day");
	}

	@Override
	public void withdraw() {
		System.out.println("ICICI withdraw of 50K/day");	
	}
}
