package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String atr= driver.findElement(By.name("login")).getAttribute("name");
		System.out.println(atr);
		
		
		
		driver.close();
		
		
		
		
}

}
