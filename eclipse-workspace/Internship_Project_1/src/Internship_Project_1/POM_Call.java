package Internship_Project_1;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class POM_Call {
	
	WebDriver driver = new ChromeDriver();
	Project_1 lp;
	@BeforeClass
	void Setup()
	{
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(priority=2)
	void login_test() throws InterruptedException
	{
		
		lp = new Project_1(driver);
		lp.enter_username("standard_user");
		lp.enter_password("secret_sauce");
		lp.Clickon_login();
			
	}
	@Test(priority=3)
	void basket() throws InterruptedException
	{
		
		lp = new Project_1(driver);
		lp.addtocart1();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		lp.addtocart2();
		js.executeScript("window.scrollBy(0,-500)");
	}
	@Test(priority=4)
	void view_cart()
	{
		lp = new Project_1(driver);
		lp.viewcart();
	}
	@Test(priority=5)
	void check_out()
	{
		
		lp = new Project_1(driver);
		lp.checkingout();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}
	@Test(priority=6)
	void address() throws InterruptedException
	{
		
		lp = new Project_1(driver);
		lp.Firstname("QA Engineer");
		lp.Lastname("SDET Automation");
		lp.Postal_code("900009");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		lp.checksout();
	}
	@Test(priority=7)
	void place_order() throws InterruptedException
	{
		
		lp = new Project_1(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		lp.place_order();
		
	}
	@Test(priority=8)
	void backhome() throws InterruptedException
	{
	
		lp = new Project_1(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		lp.backhome();
		
	}
	@AfterClass
	void closed()
	{
		driver.quit();
	}
	
		
}

	
	

}
