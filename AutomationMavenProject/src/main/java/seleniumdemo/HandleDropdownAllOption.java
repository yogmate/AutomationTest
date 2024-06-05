package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownAllOption {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		
		
		WebElement languageDD= driver.findElement(By.id("searchLanguage"));
	    
	    Select select= new Select(languageDD);
	    
	    List<WebElement> allDDoptions=  select.getOptions();
	    System.out.println("no of DD options : "+allDDoptions.size());
	    for(WebElement option: allDDoptions )
	    {
	    	
	    	System.out.println(option.getText());
	    }
	    
		
		
	}
	
	

}
