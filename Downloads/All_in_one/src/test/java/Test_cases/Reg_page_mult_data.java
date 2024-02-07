package Test_cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.Reg_page;

public class Reg_page_mult_data {

	
	@Test(dataProvider = "data")
	void reg_function(String first_name,String last_name, String email,String pwd,String cpwd) {
		System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
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
	
	@DataProvider(name = "data" )
	Object[][] collecting_data() throws IOException {
	DataDrivernTesting data_d = new DataDrivernTesting();
	
		Object[][] cell = data_d.acces_data("D:\\All_in_one\\Excel\\Data.xlsx","Sheet2");
		return cell;
	}











}

