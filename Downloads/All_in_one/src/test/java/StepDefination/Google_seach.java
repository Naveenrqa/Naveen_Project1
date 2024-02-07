package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Google_seach {

	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		driver =  new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
		driver.manage().window().maximize();
		System.out.println("browser is opend ");
		
	   
	}

	@And("user in serach page")
	public void user_in_serach_page() {
	
		driver.get("https://www.google.com/");
		System.out.println("user in serach page");
	}

	@When("user enter the a serach item in serch box")
	public void user_enter_the_a_serach_item_in_serch_box() {
	   driver.findElement(By.name("q")).sendKeys("book");
	   System.out.println("user is enter the seach item");
	}

	@And("clcik on the enter")
	public void clcik_on_the_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user able to navigate to  serach result page")
	public void user_able_to_navigate_to_serach_result_page() {
	   String title = driver.getTitle();
	   System.out.println("user in the serach result page" +" "+ title);
	}
}
