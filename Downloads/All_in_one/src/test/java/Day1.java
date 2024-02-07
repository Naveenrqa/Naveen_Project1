import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

   static  WebDriver driver ;
   static String project_path = "D:/All_in_one"; 
	
   @BeforeTest
	void open_broswer() {
		System.setProperty("webdriver.chrome.driver",project_path+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@Test
	void Test1() {
	
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abc@gsmil.com");
	    driver.findElement(By.id("Password")).sendKeys("123456879");
	    driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	    
	
	}
	@AfterTest
	void close_browser()
	{
		driver.close();
	}
}

