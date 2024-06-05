package org.openqa.selenium.firefox;

import org.openqa.selenium.WebDriver;

public class FirefoxDriver implements WebDriver


{

	@Override
	public void close() {
		System.out.println("firefox browser close");
		
	}

	@Override
	public void get(String url) {
		System.out.println("firefox browser launched");
	}

	@Override
	public String getCurrentUrl() {
		System.out.println("firefox browser url captured");
		return "www.google.com";
	}
	
	

}
