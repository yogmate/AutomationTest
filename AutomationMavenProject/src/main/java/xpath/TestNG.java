package xpath;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG {
	
	
	@Test(priority = 0)
	public void dologin()
	
	{
		
		System.out.println("do login test");
		
		//Assert.fail("I am failing this test!!");
		
	}
	@Test(priority = 1, dependsOnMethods = "dologin")
	public void addusertest()
	{
		
		System.out.println("add user test");
		
		//throw new SkipException("I am skipping this test");
		
		
	}
	@Test(priority = 2, dependsOnMethods = "addusertest", enabled = false)
	public void deleteusertest()
	{
		
		System.out.println("delete user test");
		
	}
	

}
