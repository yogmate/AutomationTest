package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\Downloads\\chromedriver-win64_new\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		//driver.navigate().to("https://www.facebook.com/");

	}

}
