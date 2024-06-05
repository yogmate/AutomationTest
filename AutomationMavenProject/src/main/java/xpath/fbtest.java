package xpath;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class fbtest {
	
	
	

	@org.testng.annotations.Test
	
public void fbmessagetest()
{
	

		String expectedText= "Facebook helps you connect and share with the people in your life.";
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String actualText= driver.findElement(By.cssSelector("._8eso")).getText();
		System.out.println("Actual text is: "+actualText);
		
		
		Assert.assertEquals(actualText, expectedText);
		
	
}

}
