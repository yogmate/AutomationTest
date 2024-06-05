package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		 WebElement fashion=  driver.findElement(By.xpath("//span[contains(text(), 'Fashion')]"));
		
		Actions action= new Actions(driver);
		action.moveToElement(fashion).build().perform();
		driver.findElement(By.partialLinkText("Men's T-shirts")).click();
		
		
		
		
		
		
	}
	
	
	
	

}
