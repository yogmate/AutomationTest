package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
	   String heading= driver.findElement(By.xpath("/html/body/div[2]/div/h2")).getText();
	    System.out.println(heading);
	    
	    Thread.sleep(5000);
	    
	    driver.close();
	    
	    
     
	}

}
