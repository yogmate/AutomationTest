package demo;

public class laptop {

	String Companyname= "lenovo";
	String color= "white";
	int size = 5;
	int price = 50000;
	
	//behaviour

		public void watchmovie()
		{
			System.out.println("watch movie");
			
		}
		
		public void coding()
		{
			System.out.println("coding");
			
		}
	public void doofficalwork()
	{
		System.out.println("do offcial work");
	}

	public static void main(String[] args)
	
	{
	
		laptop dell = new laptop();
		System.out.println(dell.Companyname);
		System.out.println(dell.color);
		System.out.println(dell.size);
		System.out.println(dell.price);		
		//behaviour
		dell.watchmovie();
		dell.coding();
		dell.doofficalwork();
		
		
}
}



