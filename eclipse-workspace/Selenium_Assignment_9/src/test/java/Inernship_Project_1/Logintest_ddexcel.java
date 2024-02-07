package Inernship_Project_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logintest_ddexcel {
	
	WebDriver driver;
	
	
	public Logintest_ddexcel(WebDriver driver) 
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

	public void login_cases() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String FilePath = "C:\\Users\\user\\eclipse-workspace\\Selenium_Assignment_9\\Test\\Login.xlsx";
		FileInputStream fis = new FileInputStream(FilePath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Test");
		int rows = sheet.getLastRowNum();
		for(int i=1;i<rows;i++) 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(sheet.getRow(i).getCell(0).toString());
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sheet.getRow(i).getCell(1).toString());
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			System.out.println("Username: "+sheet.getRow(i).getCell(0).toString()+" Password: "+sheet.getRow(i).getCell(1).toString());
			driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")); 
			logout.click();
		}

		wb.close();
		fis.close();
		driver.quit();
		}

	     
	public void browser_launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	public void login_page(String user_name,String pass_word)
	{
		
		driver.findElement(UserName).sendKeys(user_name);
		driver.findElement(Password).sendKeys(pass_word);
		driver.findElement(login_btn).click();
	}
	
	
	public void shopping_cart() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		
		driver.findElement(add_cart1).click();
		
		driver.findElement(add_cart2).click();
		
		driver.findElement(order_details).click();
	}
		
	public void checkingout(String First_Name,String Last_Name,String Postalcode) throws InterruptedException 
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.findElement(check_out).click();
		driver.findElement(First_name).sendKeys(First_Name);
		driver.findElement(Last_name).sendKeys(Last_Name);
		driver.findElement(Postal_code).sendKeys(Postalcode);
		driver.findElement(checks_out).click();
		driver.findElement(finish).click();
		driver.findElement(backto_home).click();
	}
	
	
}
