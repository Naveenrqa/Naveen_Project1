package Datadriven_Assignment_9;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


    public class Module_4_Assignment2_2
    
    {
	
	Module_4_Assignment2_1 pg = new Module_4_Assignment2_1();
	
	@Test(priority=1)
	public void browser() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://itechnotion.com/");
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void POM() throws InterruptedException, IOException 
	{
		
		pg.RetrieveHeaderElements();
		pg.clickOnProduct();
		pg.clickOnTechnologies();
		pg.clickOnGetQuote();
		pg.fillForm();
		pg.clickOnSubmit();
	}

    }


