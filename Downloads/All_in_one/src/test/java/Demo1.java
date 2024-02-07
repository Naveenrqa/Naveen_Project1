import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","D:/All_in_one/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement Register_link = driver.findElement(By.linkText("Register"));
		
		driver.navigate().refresh();
		
		Register_link.click();
		
		
	}

}
