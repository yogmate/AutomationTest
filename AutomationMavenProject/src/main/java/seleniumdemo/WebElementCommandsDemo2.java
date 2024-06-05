package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsDemo2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//clear method
				driver.findElement(By.id("email")).sendKeys("testuser");
				
				boolean displayed= driver.findElement(By.xpath("//h2")).isDisplayed();
				System.out.println(displayed);
				
				boolean displayed2= driver.findElement(By.id("email")).isEnabled();
				System.out.println(displayed2);
				
				
				driver.close();
				
				
		
	}

}
