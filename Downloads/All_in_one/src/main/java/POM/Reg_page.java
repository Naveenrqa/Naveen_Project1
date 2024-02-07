package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reg_page {
	
	@FindBy(id = "FirstName")
	private WebElement FirstName_tb;

	@FindBy(id = "LastName")
	private WebElement LastName_tb;
	
	@FindBy(id = "Email")
	private WebElement Email_tb;
	
	@FindBy(id = "Password")
	private WebElement Password_tb;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPassword_tb;
	
	@FindBy(id = "gender-male")
	private WebElement gender_male;
	
	@FindBy(id = "gender-female")
	private WebElement gender_female;
	
	@FindBy(id = "register-button")
	private WebElement register_button;
	
	public Reg_page (WebDriver driver){
	PageFactory.initElements(driver, this);
	}
	
	public void FirstName(String first_name) {
		FirstName_tb.sendKeys(first_name);
	}
	
	public void LastName(String lastName) {
		LastName_tb.sendKeys(lastName);
	}
	public void Email(String email) {
		Email_tb.sendKeys(email);
	}
	public void Password(String pwd) {
		Password_tb.sendKeys(pwd);
	}

	public void ConfirmPassword(String cpwd) {
		ConfirmPassword_tb.sendKeys(cpwd);
	}
	public void genderfemale_button() {
		gender_female.click();
	}

	public void gender_male_button() {
		gender_male.click();
	}
	public void register() {
		register_button.click();
	}
}
