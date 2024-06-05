package inheritance;

public class Vehicle {
	
	protected String brand= "Ford";
	
	public void honk()

	{
		
		System.out.println("tuut, tuut!");
		
	}
}

class Car extends Vehicle
{
	
	private String modelname= "Mustang";
	
	public static void main(String[] args) {
		
		Car mycar= new Car();
		mycar.honk();
		
		System.out.println(mycar.brand + "" + mycar.modelname);
	}
	
	
}