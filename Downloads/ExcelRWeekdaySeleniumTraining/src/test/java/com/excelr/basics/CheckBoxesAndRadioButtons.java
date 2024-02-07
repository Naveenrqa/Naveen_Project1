package com.excelr.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesAndRadioButtons {

	/*
	 * isDisplayed: isEnabled isSelected
	 */

	public static void main(String[] args) throws InterruptedException {
		checkBoxes();
		// radioButton();
	}

	public static void checkBoxes() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		Thread.sleep(3000);
		System.out.println("Checking Is Displayed: "
				+ driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isDisplayed());
		System.out.println(
				"Checking Is Enabled: " + driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isEnabled());
		System.out.println("Checking Is Selected: "
				+ driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected());
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
		System.out.println("Checking Is Selected after selecting: "
				+ driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
		driver.close();

	}

	public static void radioButton() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-radio/");
		Thread.sleep(3000);
		// *[@id="post-200"]/div/div[3]/form/input[4]
		// input[@value='PHP']
		// HTMLTAG[@att_name = 'attr_value']

		driver.findElement(By.xpath("//input[@value='PHP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='JS']")).click();
		driver.close();

	}
}
