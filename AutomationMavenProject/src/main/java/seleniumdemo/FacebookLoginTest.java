package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahes\\eclipse-workspace\\SleniumProject\\chromedriver.exe");
		
		        System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				WebElement email = driver.findElement(By.cssSelector("#email"));
				email.sendKeys("shubhangi.kulkarni92@gmail.com");
				driver.findElement(By.cssSelector("#pass")).sendKeys("Krrish@231288");
				driver.findElement(By.name("pass")).submit();
				//driver.findElement(By.name("login")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				driver.close();
				
				
	}

}
