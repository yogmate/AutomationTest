package selenium_demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationOfBrowser {

	
	public static void main(String[] args) {
		
		System.setProperties("C:\\Users\\mahes\\eclipse-workspace\\coding\\SeleniumDemo\\chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
	}
}
