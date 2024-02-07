package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class A_HP {

	@FindBy(id = "searchDropdownBox")
	private WebElement searchDropdownBox;
	
	public A_HP(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public void Drop_down_select(String product) {
	
		Select select = new Select(searchDropdownBox);
		select.selectByVisibleText(product);
		
	}


	

}
