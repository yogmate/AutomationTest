package javasession;

public class DisplayCars {
	
	public static void main(String[] args) {
		
		String[] cars= {"hyundai", "tata", "mahindra"};
		
		for(String i: cars)
		{
			if(i.equalsIgnoreCase("Tata"))
			{
				System.out.println(i);
			}
			
			System.out.println(i);
			break;
		}
		
		System.out.println("i am end of the statement");
	}

}
