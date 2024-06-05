package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import util.ProjctConstant;

public class TestBase {
	
	public WebDriver driver;
	public String browserName= "chrome";
	
	
	@BeforeSuite
	public void setUp()
	{
		
		
		//launching chrome browser
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
			driver= new ChromeDriver();
		}
	
	
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		driver= new FirefoxDriver();
		
	}

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get(ProjctConstant.url);
			
	}
	
	@AfterSuite
	public void tearDown()
	{
		
		if(driver!=null)
		{
			//driver.close();
			driver.quit();
			
		}
		
	}
	
	
	
}




