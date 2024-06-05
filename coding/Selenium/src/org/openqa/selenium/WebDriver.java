package org.openqa.selenium;

public interface WebDriver {
	
	public void close();
	public void get(String url);
	public String getCurrentUrl();
	
}
