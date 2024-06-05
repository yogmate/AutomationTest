package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		
		
		System.out.println("no of links are : "+tags.size());
		for(WebElement tag:tags)
		{
			System.out.println(tag.getAttribute("href"));
		}
		
		driver.close();
	}

}
