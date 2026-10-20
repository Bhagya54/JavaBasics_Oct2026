package day6;

public class Ex18_CarDetails {
	public static void main(String[] args) {
		//instance variable - object creation - instantiation
		Ex17_Car c1 = new Ex17_Car();
		c1.carBrand="BMW";
		c1.carModel="X3M";
		c1.color="blue";
		//System.out.println("CarBrand: " + c1.carBrand);
		c1.getCarDetails();
		
		//System.out.println(Car.roadTax);
		Ex17_Car.getRoadTax();
		
		Ex17_Car c2 = new Ex17_Car();
		c2.carBrand="Hyundai";
		c2.carModel="i10";
		c2.color="red";
		//System.out.println("CarBrand: " + c2.carBrand);
		System.out.println("CarColor: " + c2.color);
		c2.getCarDetails();
	}
}
