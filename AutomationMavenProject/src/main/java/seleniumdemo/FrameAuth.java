package seleniumdemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAuth {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		//format
		//driver.get("https://<username>:<password>@www.example.com/index.html")
		
		
		
		

}
}
