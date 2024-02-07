package Datadriven_Assignment_9;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	String FilePath = "C:\\Users\\user\\Desktop\\Project-1\\Login.xlsx";
	FileInputStream fis = new FileInputStream(FilePath);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet("Test");
	int rows = sheet.getLastRowNum();
	for(int i=1;i<rows;i++) 
	{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(sheet.getRow(i).getCell(0).toString());
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sheet.getRow(i).getCell(1).toString());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		System.out.println("Username: "+sheet.getRow(i).getCell(0).toString()+" Password: "+sheet.getRow(i).getCell(1).toString());
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(5000);
		WebElement mainMenu = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")); 
		mainMenu.click();
	}

	wb.close();
	fis.close();
	}

	
}
