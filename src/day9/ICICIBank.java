package day9;

public class ICICIBank implements RBI{
	public void deposit() {
		System.out.println("ICICI deposit of 1 lakh/day");
	}

	@Override
	public void withdraw() {
		System.out.println("ICICI withdraw of 50K/day");	
	}
}
