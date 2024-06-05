package seleniumdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		
		
		WebElement languageDD= driver.findElement(By.id("searchLanguage"));
        
	    Select select= new Select(languageDD);
	    
	   // select.selectByIndex(0);
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   // select.selectByValue("cy");
	
		select.selectByVisibleText("Asturianu");
	     
	    
		
		
		
		
	
		driver.close();
	}

}
