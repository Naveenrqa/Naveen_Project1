package Datadriven_Assignment_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class Module_4_Assignment2_1 
{
	public WebDriver driver;
	
	public void browser(WebDriver driver)
	{
		this.driver=driver;
	}
	

@FindBy(xpath = "//ul[@class='navigation-menu nav-right ']/li")
private List<WebElement> headerElements;

@FindBy(xpath = "//img[@alt='products-itechnotion']")
private WebElement product;

@FindBy(xpath = "//img[@alt='Technologies-itechnotion']")
private WebElement technologies;

@FindBy(xpath = "//div[text()='Get a Quote']")
private WebElement GetQuote;

@FindBy(id = "FIRSTNAME") private WebElement Name;
@FindBy(id = "EMAIL") private WebElement Email;
@FindBy(id = "PHONE") private WebElement contactNumber;
@FindBy(id = "IT_INTEREST") private WebElement Interest;
@FindBy(id = "IT_BUDGET") private WebElement Budget;
@FindBy(id = "IT_REQUIREMENT") private WebElement Requirement;
@FindBy(id = "MESSAGE") private WebElement AboutProject;

@FindBy(xpath = "//button[text()='Submit']") 
private WebElement Submit;



public void RetrieveHeaderElements() {
	
	for(int i=0;i<headerElements.size();i++) {
		System.out.println(headerElements.get(i).getText());
	}
}

public void clickOnProduct() throws InterruptedException {
	for(int i=0;i<headerElements.size();i++) {
		if(headerElements.get(i).getText().equals("Work")) {
			Actions act = new Actions(driver);
			act.moveToElement(headerElements.get(i)).click().perform();
			Thread.sleep(1000);
			product.click();
			System.out.println("Clicked on Products");
		}
	}
}

public void clickOnTechnologies() throws InterruptedException {
	for(int i=0;i<headerElements.size();i++) {
		if(headerElements.get(i).getText().equals("Work")) {
			Actions act = new Actions(driver);
			act.moveToElement(headerElements.get(i)).click().perform();
			Thread.sleep(1000);
			technologies.click();
			System.out.println("Clicked on Technologies");
		}
	}
}

public void clickOnGetQuote() {
	GetQuote.click();
	System.out.println("Clicked on Get a Quote");
}

public void fillForm() throws IOException {
	String FilePath = "D:\\SELENIUM\\Logindata.xlsx";
	FileInputStream fis = new FileInputStream(FilePath);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Form");
	
	Name.sendKeys(sheet.getRow(1).getCell(0).toString());
	Email.sendKeys(sheet.getRow(1).getCell(1).toString());
	contactNumber.sendKeys(sheet.getRow(1).getCell(2).getRawValue());
	Interest.sendKeys(sheet.getRow(1).getCell(3).toString());
	Budget.sendKeys(sheet.getRow(1).getCell(4).toString());
	Requirement.sendKeys(sheet.getRow(1).getCell(5).toString());
	AboutProject.sendKeys(sheet.getRow(1).getCell(6).toString());
	workbook.close();
	fis.close();
}

public void clickOnSubmit() {
	Submit.click();
}
}




