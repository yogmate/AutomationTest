package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSyntax {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shubhangi.kulkarni@gmail.com");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Shubhangi.kulkarni@gmail.com");
		
		//driver.findElement(By.cssSelector("a[href$='games/']")).click();
		//driver.findElement(By.partialLinkText("Voting Information Centre")).click();
		
		//partial linktext
		//driver.findElement(By.partialLinkText("Voting Information Centre")).click();
		
		//link text
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	}

}
