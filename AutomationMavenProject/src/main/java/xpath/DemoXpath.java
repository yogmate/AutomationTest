package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoXpath {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//*[@id=\'search\']/input")).sendKeys("Tshirts");
		

		//xpath with multiple attributes
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirts");
		
		//xpath with And operator
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirts");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Tshirts");
		
		
		//xpath with text method
		driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		
		//xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'sea'")).sendKeys("Tshirts");
		
		//xpath with starts-with
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
	
	}

}
