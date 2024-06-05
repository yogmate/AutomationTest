package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootStrapDropdown {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		
		List<WebElement> menus = (List<WebElement>) driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a"));
		
		for(WebElement menu : menus)
		{
			
			if(menu.getText().equalsIgnoreCase("Another action"))
			{
				menu.click();
				System.out.println("I have clicked another action dd");
				break;
			}
		}
		
		
		
	}
	
	

}
