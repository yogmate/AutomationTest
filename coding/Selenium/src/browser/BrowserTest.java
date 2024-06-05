package browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	
	public static void main(String[] args) {
		
	//Chrome browser
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		System.out.println("======================");
		
		
		//Firefox browser
		FirefoxDriver driver2= new FirefoxDriver();
		driver.get("https://www.google.com");
		
		String url2= driver2.getCurrentUrl();
		System.out.println(url2);
		driver.close();
		
		
	}
}
