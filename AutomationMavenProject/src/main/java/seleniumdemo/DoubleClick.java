package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
		  WebElement id = driver.findElement(By.id("hot-spot"));
		  
		
		  Actions action= new Actions(driver);
		  
		  action.moveToElement(id).doubleClick().build().perform();
		  
		  
	}

}
