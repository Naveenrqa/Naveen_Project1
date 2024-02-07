package com.excelr.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {

	/*
	 * Test FB Login Feature:
	 * Steps:
	 * 1. Open Browser
	 * 2. Launch the application
	 * 3. Enter the username
	 * 4. Enter the password
	 * 5. Click on Login Button
	 * 6. Close the browser
	 */
	
	public static void main(String[] args) {
		//configuring the browser
		WebDriverManager.chromedriver().setup();
		
		// Step1: Open Browser
		WebDriver driver = new ChromeDriver();
		
		// Step2: Launch the application
		driver.get("https://www.facebook.com/");
		
		// Step3: Enter username value
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("TestUserName");
		
		// Step4: Enter Password value
		driver.findElement(By.id("pass")).sendKeys("TestPassword");
		
		// STep5: Click on Login Button
		driver.findElement(By.name("login")).click();
		
		// Step6: Close the browser
		driver.close();
	
	}
}
