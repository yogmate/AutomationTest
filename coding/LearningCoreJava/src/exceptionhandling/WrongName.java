package exceptionhandling;

public class WrongName extends Exception {
	
	public WrongName(String errorMessage)
	{
		
		super(errorMessage);
	}
	
	

}

class CustomException
{
	
	public static void main(String[] args) throws WrongName {
		
		int a=5;
		if(a<10)
		{
			
			throw new WrongName("data is invalid plz enter valid data");
			
		}
	}
}
