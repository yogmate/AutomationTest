package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextDemo2 {
	
	public static void main(String[] args) {
		
		  //System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			String text= driver.findElement(By.xpath("//a[contains](text(), 'Create new account')]")).getText();
		   System.out.println(text);
		
		   driver.close();
	}

}
