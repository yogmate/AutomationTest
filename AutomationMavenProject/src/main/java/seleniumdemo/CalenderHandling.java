package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class CalenderHandling {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		String expectedMonthYear= "January 2027";
	String currentMonthYear= driver.findElement(By.className("ui-datepicker-title")).getText();
	System.out.println(currentMonthYear);
	
	while(!currentMonthYear.equals(expectedMonthYear))
	{
	
		driver.findElement(By.xpath("//span[contains(text(),'Next')]\"")).click(); //click on next button
		currentMonthYear= driver.findElement(By.className("ui-datepicker-title")).getText(); //get current month year
		
		driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
		
		
		
		
		
		
		
	}
	
		
		
		
		
		
	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
