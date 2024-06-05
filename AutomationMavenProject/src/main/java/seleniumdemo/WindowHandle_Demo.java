package seleniumdemo;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class WindowHandle_Demo {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		//open new child window within the main window
		driver.findElement(By.id("windowButton")).click();
		
		
		//get handles of the window
	String mainwindowhandle= driver.getWindowHandle();
      java.util.Set<String> allwindowhandles= driver.getWindowHandles();
		Iterator<String> iterator= 	allwindowhandles.iterator();
		
	while (iterator.hasNext()) 
	
	{
		String childwindow= iterator.next();
		if (!mainwindowhandle.equalsIgnoreCase(childwindow)) 
		
		{
			driver.switchTo().window(childwindow);
			WebElement text= driver.findElement(By.id("sampleHeading"));
			System.out.println("Heading of child window is " +text.getText());
			
			
		}
		
		
	}
	
	driver.switchTo().window(mainwindowhandle);
	System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Browser windows')]")).getText());
	
	

		
	}

}
