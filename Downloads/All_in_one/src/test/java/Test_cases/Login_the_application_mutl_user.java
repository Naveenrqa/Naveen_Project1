package Test_cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.Login_Page;
import POM.Reg_page;

public class Login_the_application_mutl_user {

	
	@Test(dataProvider = "login_data")
	void login_functionlity(String email,String pwd) {
	System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	HomePage hp = new HomePage(driver);
	hp.Login_link();
	Login_Page lp = new Login_Page(driver);
	lp.Email_tb(email);
	lp.Password_tb(pwd);
}
	
	@DataProvider(name = "login_data")
	Object[][] Collection_data() throws IOException {
		DataDrivernTesting data_d = new DataDrivernTesting();
		Object[][] cell_data = data_d.acces_data("D:\\All_in_one\\Excel\\Data.xlsx", "Sheet1");
	  return cell_data;
	}
}