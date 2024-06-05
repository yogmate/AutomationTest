package annotation_demo;

import org.testng.annotations.Test;

public class Demo {
	
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite()
	{
		
		System.out.println("BeforeSuite");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
		
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		
		System.out.println("BeforeMethod");
	}
	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		
		System.out.println("BeforeTest");
	}
	
	@Test
	public void loginTest()
	{
		System.out.println("loginTest");
		
	}
	
	@Test
	public void addusertest()
	{
		System.out.println("addusertest");
		
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
		
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
		
	}
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		
		System.out.println("AfterClass");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
		
	}

}
