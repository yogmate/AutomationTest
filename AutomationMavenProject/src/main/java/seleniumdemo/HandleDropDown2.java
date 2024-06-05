package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class HandleDropDown2 {
	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		
		WebElement languageDD= driver.findElement(By.id("dropdown"));
		Select select= new Select(languageDD);
		//select.selectByIndex(2);
		select.selectByVisibleText("Option 2");
		
		//driver.close();
		
		
		
		
		
	}

	
    
}
