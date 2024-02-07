import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_FaildTestcases {
	

	WebDriver driver ;
	@Test
	void test1() {

		System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		String exp = "Demo Web Shop";
		Assert.assertEquals(title, exp);
		
	}

	@Test
	void test2() {
		System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		String exp = "Facebook – log in or sign up";
		Assert.assertEquals(title, exp);

	}

	@Test
	void test3() {

		System.out.println("i am from test3");
	}

	@Test
	void test4() {
		
		System.out.println("i am from test3");

	}
}
