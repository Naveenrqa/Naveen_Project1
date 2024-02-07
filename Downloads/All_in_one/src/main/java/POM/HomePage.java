package POM;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(linkText = "Register")
	private WebElement Register_link; 


	@FindBy(linkText = "Log in")
	private WebElement Login_link; 

	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

   

	public void Register_link() {
    	Register_link.click();
    }

    public void Login_link() {
    	Login_link.click();
    }

    

}

