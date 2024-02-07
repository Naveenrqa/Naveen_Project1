package Internship_Project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Project_1 {
		
		WebDriver driver;
		

		Project_1(WebDriver driver)
		{
		
			this.driver = driver;
		}
		
		By UserName = By.id("user-name");
		
		By Password = By.id("password");
		
		By login_btn = By.xpath("//input[@id='login-button']");
		
		By add_cart1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
		
		By add_cart2 = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
		
		By order_details = By.xpath("//a[@class='shopping_cart_link']");
		
		By check_out = By.xpath("//button[@id='checkout']");
		
		By First_name = By.xpath("//input[@id='first-name']");
		
		By Last_name = By.xpath("//input[@id='last-name']");
		
		By Postal_code = By.xpath("//input[@id='postal-code']");
		
		By checks_out = By.xpath("//input[@id='continue']");
		
		By finish = By.xpath("//button[@id='finish']");
		
		By backto_home = By.xpath("//button[@id='back-to-products']");
		
		
		public void enter_username(String user_name) 
		{
			driver.findElement(UserName).sendKeys(user_name);
		}
		public void enter_password(String pass_word)
		{
			driver.findElement(Password).sendKeys(pass_word);
		}
		public void Clickon_login()
		{
			driver.findElement(login_btn).click();
		
		}
		public void addtocart1()
		{
			driver.findElement(add_cart1).click();
		}
		public void addtocart2()
		{
			driver.findElement(add_cart2).click();
		}
		
		public void viewcart() 
		{
			
			driver.findElement(order_details).click();
		}
		
		public void checkingout() 
		{

			driver.findElement(check_out).click();
		}
		
		public void Firstname(String First_Name) 
		{
			driver.findElement(First_name).sendKeys(First_Name);
		}
		public void Lastname(String Last_Name) 
		{
			driver.findElement(Last_name).sendKeys(Last_Name);
		}
		
		public void Postal_code(String Postalcode) 
		{
			driver.findElement(Postal_code).sendKeys(Postalcode);
		}
		public void checksout() 
		{
			driver.findElement(checks_out).click();
		}
		public void place_order() 
		{
			driver.findElement(finish).click();
		}
		public void backhome()
		{
			driver.findElement(backto_home).click();
		}
		
		
	}


