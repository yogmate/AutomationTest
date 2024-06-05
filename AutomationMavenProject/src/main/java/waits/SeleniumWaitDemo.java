package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		
		seleniumwaits();
		
	}
	
	public static void seleniumwaits()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("automation seteps");
		driver.findElement(By.name("btnK")).click();
		
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.name("sjfjs")));
		
		
		driver.findElement(By.name("abcdd")).click();
		
		
		
		
		//driver.close();
		//driver.quit();
		
		
	}
	
	
	
    

}
