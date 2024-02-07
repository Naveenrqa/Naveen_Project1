package Inernship_Project_1;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Inernship_Project_1_POM {

	WebDriver driver;
	Logintest_ddexcel cm = new Logintest_ddexcel(driver);
	
	 
	@Test (priority=1)
	void login() throws IOException, InterruptedException
	{
		cm.login_cases();
	}
	
	@Test (priority=2)
	void shop() throws InterruptedException
	{
	   cm.browser_launch();
	   cm.login_page("standard_user", "secret_sauce");
	   cm.shopping_cart();
	   cm.checkingout("SDET","QA Engineer","900009");
	}
  
}