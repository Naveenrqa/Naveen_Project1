package Test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.HomePage;
import POM.Reg_page;

public class TestCase_Reg {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		HomePage hp = new HomePage(driver);
		hp.Register_link();
		
		Reg_page rp = new Reg_page(driver);
		rp.genderfemale_button();
		rp.FirstName("Ashwini");
		rp.LastName("K");
		rp.Email("Abc@gamil.com");
		rp.Password("12346546");
		rp.ConfirmPassword("123456798");
		rp.register();
		

	}

}
