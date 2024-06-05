package org.openqa.selenium.chrome;

import org.openqa.selenium.WebDriver;

public class ChromeDriver implements WebDriver

{

	@Override
	public void close() {
		System.out.println("chrome browser close");
		
	}

	@Override
	public void get(String url) {
		System.out.println("chrome browser launched");
	}

	@Override
	public String getCurrentUrl() {
		System.out.println("chrome browser url captured");
		return "www.google.com";
	}
	
	

}
