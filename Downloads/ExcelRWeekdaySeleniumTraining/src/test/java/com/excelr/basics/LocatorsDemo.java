package com.excelr.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	/*
	 * Locators:
	 * id: 1st preference
	 * name : 2nd preference
	 * xpath: 3rd preference
	 * //*[@id="email"]
	 * 
	 * css: 3rd preference
	 * #pass
	 * 
	 * class-name: not recommended
	 * 
	 * tagName: use to find all the matching elements with the tag
	 * 
	 * for URLS:
	 * linktext: exact Match >> preferred
	 * partiallinktext: partial Match 
	 * 
	 */
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("TestAdmin");
		driver.findElement(By.cssSelector("#pass")).sendKeys("TestPassword");
		//driver.findElement(By.partialLinkText("Forgotten")).click();
	}
}
