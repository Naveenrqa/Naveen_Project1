package com.excelr.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(3000);
		String expectedMessage = "I am alert, handle me!";
		// at this point, now there is an Alert
		Alert al = driver.switchTo().alert();
		String actualMessage = al.getText();

		al.accept();
		Thread.sleep(3000);

		if (expectedMessage.equals(actualMessage)) {
			System.out.println("TC Passed!!!");
		} else {
			System.out.println("TC Failed!!!");
		}
		
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		//third alert? 
		//first click on button
		//then enter some value
		//get the text and print it
		//accept the alert
		
		driver.findElement(By.id("promptexample")).click();
		driver.switchTo().alert().sendKeys("Ajay");
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		
		driver.close();
		
		
	}
}
