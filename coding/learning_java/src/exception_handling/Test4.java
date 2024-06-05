package exception_handling;

public class Test4 {
	
	public static void read() throws Exception
	{
		
		System.out.println("read method callled");
		
		int num= 100;
		if (num!=100)
		{
			
			throw new Exception("data ws not satisfied");
			
		}
		
		
	}

	
	public static void main(String[] args) 
	
	
	{
		
		try {
			read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
