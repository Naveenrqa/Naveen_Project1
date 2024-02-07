package Test_cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.HP;
import POM.HomePage;
import POM.Login_Page;

public class Test1 {

	
	@Test
	public void test1(String user_name, String pwd) {
		
		System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		//testcase for loing 
		
		HomePage homePage = new HomePage(driver);
		homePage.Login_link();
		
		Login_Page lp = new Login_Page(driver);
		lp.Email_tb(user_name);
		lp.Password_tb(pwd);
		
		
	}
	
		
		
		

	}


