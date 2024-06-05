package seleniumdemo;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueDemo2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/eclipse-workspace/SleniumProject/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//Dimension dim= driver.findElement(By.name("login")).getSize();
		 //System.out.println(dim);
		 //System.out.println(dim.height);
		 //System.out.println(dim.width);
		 
	org.openqa.selenium.Point point= driver.findElement(By.name("login")).getLocation();
		System.out.println(point);
		 System.out.println(point.x);
		 System.out.println(point.y);
		driver.close();
		
		
	}
	

}
