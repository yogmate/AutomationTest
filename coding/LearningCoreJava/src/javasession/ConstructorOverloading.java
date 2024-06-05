package javasession;

public class ConstructorOverloading {
	
	int lenght;
	int breadth;
	int height;
	
	
	
	public ConstructorOverloading(int lenght, int breadth)
	{
		
		
		this.lenght = lenght;
		this.breadth = breadth;
		
	}
	
	public ConstructorOverloading(int lenght, int breadth,  int height)
	{
		
		
		this.lenght = lenght;
		this.breadth = breadth;
		this.height = height;
		
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading col= new ConstructorOverloading(1, 2, 3);
		System.out.println("table lenght is: "+col.breadth);
		System.out.println("table lenght is: "+col.height);
		System.out.println("table lenght is: "+col.lenght);
		
		
	}
	

}
