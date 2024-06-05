package inheritance;

public class Parent {
	
	public void dadproperty()
	
	{
		
		System.out.println("dad property");
		
	}
	
}
	 class child extends Parent
	
	{
		
		public static void main(String[] args)
		
		{
		
			child c= new child();
			c.dadproperty();
			
		}
	}
	


