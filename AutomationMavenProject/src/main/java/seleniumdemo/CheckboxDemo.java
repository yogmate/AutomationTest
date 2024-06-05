package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		//driver.findElement(By.xpath("//input[@type= 'checkbox']")).click();
		
		
		//driver.findElement(By.xpath("//input[@type= 'checkbox'][1]")).click();
		
		//check status of checkbox
		//dont check already selected
		
	List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type= 'checkbox'][1]"));
	
	//for each loop
	for(WebElement check: checkbox)
	{
		
		if(!check.isSelected())
			
		{
			check.click();
			
		}
	}
	
	//for loop
	for(int i=0; i<checkbox.size(); i++)
	{
		if(!checkbox.get(i).isSelected())
			
		{
			checkbox.get(i).click();
			
			
		}
			
		
	}
		
	}

}
