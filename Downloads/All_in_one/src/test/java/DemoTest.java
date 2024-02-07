import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	
	@Test
	public void google_book(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("book",Keys.ENTER);
		String Exp_result = "book - Google Search";
		String aut_result = driver.getTitle();
//		Assert.assertEquals(aut_result,Exp_result );
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Exp_result,aut_result);
		sa.assertAll();
		
	}
	
	@Test
	public void test_method1() {
		System.out.println("hello  i am from test 1");
		String a = "hello";
		String b = "hello12";
		Assert.assertEquals(a, b);
	}
	
	@Test(priority = 1,invocationCount = 5 )
	public void test_method2() {
//		System.out.println("hello  i am from test 2");
		Reporter.log("Sttings",true);
	}
	
	
	@Test(enabled = false)
	public void test_method3() {
		System.out.println("hello  i am from test 3");
	}
	
	@Test
	public void test_method4() {
		System.out.println("hello  i am from test 4");
	}
	
	@Test
	public void test_method5() {
		System.out.println("hello  i am from test 5");
	}
}
