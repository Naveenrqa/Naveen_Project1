package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.*;

public class Demo_webShop_login {

	WebDriver driver ;

@Test
@Given("open the browser")
public void open_the_browser() {
	driver =  new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
	driver.manage().window().maximize();
	System.out.println("browser is opend ");
}

@Given("navigating the  demoweb shop")
public void navigating_the_demoweb_shop() {
	driver.get("https://demowebshop.tricentis.com/");
	System.out.println("navigating the  demoweb shop");
    
}

@Given("click login link")
public void click_login_link() {
   
	driver.findElement(By.linkText("Log in")).click();
	System.out.println("click login link");
}

@When("Enter the username and pwd")
public void enter_the_username_and_pwd() {
   
	driver.findElement(By.id("Email")).sendKeys("trivenikmb@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456798");
	System.out.println("Enter the username and pwd");
}

@When("clcik on the login button")
public void clcik_on_the_login_button() {
	driver.findElement(By.linkText("(//input[@type='submit'])[2]")).click();
	System.out.println("user click on the login button");
   
}

@Then("user shoulde be login to the website with user email")
public void user_shoulde_be_login_to_the_website_with_user_email() {
    driver.findElement(By.linkText("trivenikmb@gmail.com")).isDisplayed();
    System.out.println("user able to login");
}

}
