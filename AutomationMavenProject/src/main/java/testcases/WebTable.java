package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
	@Test
	public void fbmessagetest()
	
	{
		
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get("https://www.dezlearn.com/webtable-example");
			
		List<WebElement> headers=	driver.findElements(By.xpath("//table//tbody//tr//th"));
		
		System.out.println("no of headers are: "+headers.size());
			
			for(WebElement header:headers)
			{
				
				System.out.println(headers.get(4));
			}
			
		Object rows= 	driver.findElement(By.xpath("//table/tbody/tr")).getSize();
		System.out.println("no of rows: "+rows);
		
	List<WebElement> data= 	(List<WebElement>) driver.findElement(By.xpath("//table/tbody/tr[2]/td"));
		
			
			
			
			
			
}
	
	
	
}
