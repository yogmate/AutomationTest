package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\Downloads\\chromedriver-win64_new\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\Downloads\\chromedriver-win64_new\\chromedriver.exe");
//gecko_driver_path = "C:\Users\mahes\Downloads\geckodriver-v0.34.0-win-aarch64\";

		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Testing@12345");
		

}
}