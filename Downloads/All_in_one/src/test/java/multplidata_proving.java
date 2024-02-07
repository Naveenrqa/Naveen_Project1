import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.Login_Page;
import POM.Reg_page;

public class multplidata_proving {

	Demo demo = new  Demo();
	WebDriver driver;
	
	@Test(dataProvider = "data")
	public void test1(String first_name,String last_name,String email,String pwd, String cpwd) {
		
		System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://demowebshop.tricentis.com/");
		HomePage hp = new HomePage(driver);
		hp.Register_link();
		
		Reg_page rp = new Reg_page(driver);
		rp.genderfemale_button();
		rp.FirstName(first_name);
		rp.LastName(last_name);
		rp.Email(email);
		rp.Password(pwd);
		rp.ConfirmPassword(cpwd);
		rp.register();
	}
	
	
	@DataProvider(name = "data")
	Object[][] Data_given() throws IOException {
		Object[][] Excel_data = demo.data("/Excel/Data.xlsx","sheet2");
		return Excel_data;
	}
}
