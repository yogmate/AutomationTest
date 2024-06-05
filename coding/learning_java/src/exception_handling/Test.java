package exception_handling;

public class Test {

	public static void main(String[] args)
	
	{
		
		String [] arr= {"test1", "test2", "test3"};
		
		System.out.println(arr[1]);
		
		try 
		
		{
			System.out.println(arr[3]);
			
		} 
		
		catch (ArrayIndexOutOfBoundsException e) 
		
		{
			
			System.out.println("ArrayIndexOutOfBoundsException was raised : check your input");
			
			
		}
		
		System.out.println(" end of the program");
		
		
	}

}
