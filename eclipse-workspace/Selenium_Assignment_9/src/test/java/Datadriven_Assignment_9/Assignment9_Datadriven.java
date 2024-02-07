package Datadriven_Assignment_9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment9_Datadriven {

	WebDriver driver = new ChromeDriver();

 
     @BeforeTest
     public void browseractions() throws InterruptedException
     {
     driver.get("https://demo.guru99.com/test/login.html");	
     driver.manage().window().maximize();
     Thread.sleep(5000);
     }   
     
     @Test
     public void datadriven() throws IOException
     {
        
     String filename = "D:\\Selenium\\Login.xlsx";
     FileInputStream fis = new FileInputStream(filename);
     XSSFWorkbook wb = new XSSFWorkbook(fis);
     XSSFSheet sheet = wb.getSheet("Data");
				 
				 int rows = sheet.getLastRowNum();
				 System.out.println(rows);
				 
				 for(int r=1;r<=rows;r++)
				 {
				XSSFRow row = sheet.getRow(r);
				XSSFCell Username = row.getCell(0);
				XSSFCell Password = row.getCell(1);
				XSSFCell Result = row.createCell(2);
				System.out.println("USERNAME -->"+Username+ "  PASSWORD-->"+Password  + "  RESULT-->"+Result);
				  
					 try
					 {
				WebElement email = driver.findElement(By.name("email"));
				email.sendKeys(Username.toString());
				WebElement password = driver.findElement(By.name("passwd"));
				password.sendKeys(Password.toString());
				Thread.sleep(1000);
				driver.findElement(By.id("SubmitLogin")).click();
				Thread.sleep(4000);
				driver.navigate().back();
				email.clear();
				password.clear();
				System.out.println("Valid");
				Result.setCellValue("Valid");
				
				     }
					 catch(Exception e)
					 {
						 String vmessage = driver.findElement(By.id("SubmitLogin")).getText();
						 System.out.println("InValid");
						 Result.setCellValue(vmessage);
														 
					 }
					 
				 }
				 
     }

     @AfterTest
	 public void finalaction() throws IOException
	 {
		 String filename = "D:\\Selenium\\Login.xlsx";
	     FileInputStream fis = new FileInputStream(filename);
	     XSSFWorkbook wb = new XSSFWorkbook(fis);
		 fis.close();
			 FileOutputStream fos = new FileOutputStream(filename);
			 wb.write(fos);
		 }

     
     
     
}
