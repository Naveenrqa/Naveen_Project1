package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	@FindBy(id = "Email")
	private WebElement Email_tb; 


	@FindBy(id = "Password")
	private WebElement Password_tb; 

	public Login_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void Email_tb(String emailid) {
    	Email_tb.sendKeys(emailid);
    }

    public void Password_tb(String pwd) {
    	Password_tb.sendKeys(pwd);
    }

	
}
