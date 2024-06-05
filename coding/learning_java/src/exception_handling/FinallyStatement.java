package exception_handling;

public class FinallyStatement 


{

	public static void main(String[] args) 
	
	{
		
		int num= 100;
		
		
		try

		{
			
			
			System.out.println(num/0);
		} 
		
		catch (Exception e)
		
		{
		
		
		}
		
		
		finally
		{
			
			System.out.println("finally block always executed");
			
		}
		
	}
	
	
}
