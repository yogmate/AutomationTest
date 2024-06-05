package exception_handling;

public class Test2 {

	public static void main(String[] args)
	
	{
	
		String str= null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) 
		
		{
			
			System.out.println(" NullPointerException was raised");
			
			str= "Steve";
			
			
			
		}

		System.out.println(str.length());
	}

}
