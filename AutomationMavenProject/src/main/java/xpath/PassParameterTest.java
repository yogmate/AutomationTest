package xpath;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassParameterTest {
	
	
	@Parameters("num")
	@Test
	public void getdata(int num1, int num2)
	
	{
		
		System.out.println("test get data " +num1);
		
	}

}
