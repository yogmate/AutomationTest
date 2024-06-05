package seleniumdemo;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrowserNavigationCommands {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
				
		driver.navigate().to("https://www.google.com");
		
		System.out.println("page title : "+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("page title : "+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("page title : "+driver.getTitle());
		
		//driver.navigate().refresh();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("refreshed browser counter: "+i);
		}

		driver.close();
		
		
	}
}


	
