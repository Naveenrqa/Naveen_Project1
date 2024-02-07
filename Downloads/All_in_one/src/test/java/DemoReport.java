import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DemoReport {
	static WebDriver driver;
	static String project_path = "D:/All_in_one" ;
	
	@Test
	void demo() {
		
			ExtentHtmlReporter htmlReportor = new ExtentHtmlReporter("extentReports.html");
		    
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(htmlReportor);
		
			ExtentTest test = extent.createTest("My test cases","Demo Report");
			System.setProperty("webdriver.chrome.driver",project_path+"/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
			test.log(Status.INFO,"Satting the browser");
			driver.get("https://demowebshop.tricentis.com/");
			test.pass("pass the test1");
			
			driver.findElement(By.linkText("Register")).click();
			test.pass("pass the test2");
			
			driver.findElement(By.linkText("Log in")).click();
			test.fail("test case faild");
			extent.flush();
			
	}

}
