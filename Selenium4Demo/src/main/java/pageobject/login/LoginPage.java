package pageobject.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		
		this.driver= driver;
	}
	
	
	
	
	@FindBy(id="user-name")
	WebElement username;
	
	
	@FindBy(id="password")
	WebElement password;

	@FindBy(id="login-button")
	WebElement loginbutton;
	
	
	
	public void dologin(String uname,String pwd)
	
	{
		
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
	}
	
}
