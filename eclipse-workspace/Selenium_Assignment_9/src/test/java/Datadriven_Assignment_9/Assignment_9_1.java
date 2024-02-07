package Datadriven_Assignment_9;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment_9_1 {
	
	WebDriver driver;
	
	
	    @BeforeSuite
	 	public void browser_actions() throws InterruptedException
	    {
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
	    }

		   @Test (priority = 0)
		   public void form_test() throws InterruptedException
		   {
			   WebElement rform = driver.findElement(By.xpath("//div[@class='category-cards']/child::div[2]"));
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("arguments[0].scrollIntoView()",rform);
			   Thread.sleep(3000);
			   rform.click();
			   Thread.sleep(2000);
		   }   
		   @Test (priority = 1)
		   public void pform_test() throws InterruptedException
		   {
			   WebElement rform1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div"));
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("arguments[0].scrollIntoView()",rform1);
			   Thread.sleep(2000);
			   rform1.click();
			}   
			   
		   @Test (priority=2)
		   public void fillform() throws InterruptedException, AWTException
		   {
			   
			   driver.manage().window().setSize(new org.openqa.selenium.Dimension(500,900));
			   
			   driver.findElement(By.id("firstName")).sendKeys("Naveen");
			   driver.findElement(By.id("lastName")).sendKeys("Rachakonda");
			   driver.findElement(By.id("userEmail")).sendKeys("naveen@gmail.com");
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,1000)");
			   WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
			   radio1.click();
			   driver.findElement(By.id("userNumber")).sendKeys("9848012345");
			   driver.findElement(By.id("dateOfBirthInput")).clear();
			   Select byear = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
			   byear.selectByVisibleText("1990");
			   Select bmonth = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
			   bmonth.selectByVisibleText("January");
			   WebElement bdate = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]"));
			   bdate.click();
			   
			   WebElement subjectText = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
			   subjectText.sendKeys("MATHS");
			   subjectText.sendKeys(Keys.ENTER);

			   
			   WebElement check1 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]"));
			   check1.click();
			   WebElement check3 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]"));
			   check3.click();
			   
			   WebElement uploadfile = driver.findElement(By.id("uploadPicture"));
			   uploadfile.sendKeys("D:\\Selenium\\Test.jpg");
			   
			   driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad, TS");
			   Thread.sleep(1000);
			   			      			   
			   JavascriptExecutor js1 = (JavascriptExecutor) driver;
			   js1.executeScript("window.scrollBy(0,500)");
			   
			   		   
			    WebElement State = driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
				State.sendKeys("Rajasthan");
				State.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				//Select City
				WebElement City = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
				City.sendKeys("Jaipur");
				City.sendKeys(Keys.ENTER);
				Thread.sleep(1000);

			  
			   			   
			   
			   Thread.sleep(2000);
			     
			   JavascriptExecutor js2 = (JavascriptExecutor) driver;
			   js2.executeScript("window.scrollBy(0,-500)");
			   js2.executeScript("window.scrollBy(0,500)");
			   
			 
			   Thread.sleep(2000);
			   
			   WebElement button1 = driver.findElement(By.id("submit"));  
			   button1.click();
		   }
		   
	
}
