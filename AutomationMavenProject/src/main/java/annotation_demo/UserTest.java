package annotation_demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest {
	
	@BeforeMethod
	public void setup()
	{
		
		System.out.println("setup");
	}

	@Test
	public void verifyhomepage()
	{
		System.out.println("verifyhomepage");
		
	}
	
    @AfterMethod
	public void teardown()
	{
		
    	System.out.println("teardown");
	}
}
