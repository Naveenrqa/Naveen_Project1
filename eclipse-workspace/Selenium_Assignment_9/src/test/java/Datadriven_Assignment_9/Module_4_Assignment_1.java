package Datadriven_Assignment_9;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module_4_Assignment_1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(20);;
		driver.get("http://demo.guru99.com/V4/");
		String FilePath = "D:\\SELENIUM\\APF.xlsx";
		FileInputStream fis = new FileInputStream(FilePath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Logindata");
		int rows = sheet.getLastRowNum();
		for(int i=1;i<rows;i++) {
			driver.findElement(By.name("uid")).sendKeys(sheet.getRow(i).getCell(0).toString());
			driver.findElement(By.name("password")).sendKeys(sheet.getRow(i).getCell(1).toString());
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(3000);
			Alert a = driver.switchTo().alert();
			Thread.sleep(2000);
			System.out.println("Username: "+sheet.getRow(i).getCell(0).toString()+" Password: "+sheet.getRow(i).getCell(1).toString());
			System.out.println("Alert Message: "+a.getText());
			a.accept();
		}
		wb.close();
		fis.close();
	}


}








