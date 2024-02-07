package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HP {
	
	@FindBy(linkText = "Register")
	private WebElement Register_tb;
	
	@FindBy(linkText = "Log in")
	private WebElement Login_tb;
	
	@FindBy(id = "small-searchterms")
	private WebElement search_box;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement sumit_button;
	
	public HP(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void Register() {
		Register_tb.click();
	}

	public void Login() {
		Login_tb.click();
	}


	

	
	
}
