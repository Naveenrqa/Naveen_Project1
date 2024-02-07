package com.excelr.basics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		// at this point how many windows are there? Only 1
		String parentWindowId = driver.getWindowHandle();

		driver.manage().window().maximize();
		System.out.println(driver.getTitle()); // should print main window
		driver.findElement(By.id("button1")).click();
		// after this line there are 2 windows
		// I need to switch over here to access the child window
		// to identify the id of each window

		Set<String> allIds = driver.getWindowHandles();
		String childWindowId = null;

		for (String abc : allIds) {
			if (abc.equals(parentWindowId)) {

			} else {
				childWindowId = abc;
			}
		}
		System.out.println("Parent Window Id ==>> " + parentWindowId);
		System.out.println("Child Window Id ==>> " + childWindowId);

		driver.switchTo().window(childWindowId);

		System.out.println(driver.getTitle()); // should print child window
		
		//switching again to parent
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		driver.close();// will close the window pointed by the driver currently
		driver.quit(); // will close all the windows

	}
}
