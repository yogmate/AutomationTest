package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommandsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//clear method
		driver.findElement(By.id("email")).sendKeys("testuser");
		
		Thread.sleep(5000);
		
	    driver.findElement(By.id("email")).clear();
	    System.out.println("clear the email text box");
	    driver.findElement(By.id("email")).sendKeys("testuser");
	    System.out.println("entered testuser");
	    
	    
	    
	    
		
		driver.close();
		
		
		
	}

}
