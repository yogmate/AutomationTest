package annotation_demo;

import org.testng.annotations.Test;

public class AddUserTest {
	
	
	@Test(priority = 0, groups = "sanity")
	public void normaluser()
	{
		
		System.out.println("normaluser");
	}
	@Test(priority = 1, groups = "smoke")
	public void p1user()
	{
		System.out.println("p1user");
		
	}
	@Test(priority = 2, groups = "regression")
	public void p2user()
	{
		System.out.println("p2user");
		
	}
	
	@Test(priority = 3, groups = {"regression","sanity"})
	public void p3user()
	{
		System.out.println("p2user");
		
	}
}
