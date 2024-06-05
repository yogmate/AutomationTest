package tests;

import org.testng.annotations.Test;

import base.TestBase;
import pageobject.login.LoginPage;

public class LoginTest extends TestBase



{
	
	@Test
	public void loginusertest() {
		
		
		LoginPage login= new LoginPage(driver);
		
		login.dologin("standard_user", "secret_sauce");
		
		
	}

}
