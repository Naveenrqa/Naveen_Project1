package com.excelr.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {
	
	/*
	 * Frames:
	 * By Default, selenium cannot access the elements inside the frames
	 * we need to first switch and then access
	 * once the job is done, we need to switch to the parent frame
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		//switching to the frame
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Ajay");
		driver.switchTo().parentFrame();
	}
}
