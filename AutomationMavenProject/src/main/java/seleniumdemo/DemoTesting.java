package seleniumdemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTesting {
	
	public static void main(String[] args) {
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\eclipse-workspace\\SleniumProject\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//driver.close();	
		
		
	}
	
	
	}
	
	
