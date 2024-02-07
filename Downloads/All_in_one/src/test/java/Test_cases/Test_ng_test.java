package Test_cases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_ng_test {

	WebDriver driver;
	
	@BeforeTest
	void open_browser() {
		System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	void Test1() {
	driver.get("https://demowebshop.tricentis.com/");
	String exp  = "Demo Web Shop";		
	String act = driver.getTitle();
	Assert.assertEquals(exp,act);
}
	@Test
	void Test2() {
		driver.get("https://www.facebook.com/");
		String exp = "Facebook – log in or sign up";	
		String act = driver.getTitle();
		Assert.assertEquals(exp,act);
		
	}
	@Test
	void Test3() {
		driver.get("https://www.amazon.in/");
		String exp = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";		
		String act = driver.getTitle();
		Assert.assertEquals(exp,act);
		
	}

	@AfterTest
	
	void close_browser() {
		driver.close();
	}
	@Test
	void demo() {
		driver.get("https://mvnrepository.com/search?q=cucumber+junit");
        String exp = "Maven Repository: cucumber junit";
        String act = driver.getTitle();
        Assert.assertEquals(exp,act);

		
	}
}
