package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverRightClick {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
		  WebElement hot= driver.findElement(By.id("hot-spot"));
		
		Actions act= new Actions(driver);
	  
		act.moveToElement(hot).contextClick().build().perform();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		
}


}
