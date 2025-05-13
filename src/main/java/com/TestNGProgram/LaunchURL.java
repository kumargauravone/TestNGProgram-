package com.TestNGProgram;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {
	
	@Test
	public void launchURL() {
		// Launch Chrome Browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}

}
