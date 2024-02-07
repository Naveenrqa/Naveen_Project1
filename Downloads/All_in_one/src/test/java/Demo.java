import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import POM.HomePage;
import POM.Login_Page;

public class Demo {

	static  WebDriver driver ;
	static String project_path = "D:/All_in_one" ;
	
	@Test(dataProvider = "data")
	public void test1(String user_name, String pwd) {
		
		System.setProperty("webdriver.chrome.driver",project_path+"/Driver/chromedriver.exe");
				
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		HomePage hp = new HomePage(driver);
		hp.Login_link();
		
		Login_Page lp = new Login_Page(driver);
		lp.Email_tb(user_name);
		lp.Password_tb(pwd);
	}
	
	@DataProvider(name = "data")
	Object[][] Data_given() throws IOException {
		Object[][] Excel_data = data("/Excel/Data.xlsx","sheet1");
		return Excel_data;
	}
	
	public static Object[][] data(String exl_path,String Sheet_name) throws IOException {
	String project_path = System.getProperty("user.dir");
	String path = project_path + exl_path;
	XSSFWorkbook wb = new XSSFWorkbook(path);
	XSSFSheet sheet = wb.getSheet(Sheet_name);
	
	int rows = sheet.getPhysicalNumberOfRows();
	int col = sheet.getRow(0).getPhysicalNumberOfCells();
	Object data[][] = new Object[rows-1][col];
	
	for(int i = 1 ; i < rows ; i++) {
		for(int j = 0 ; j < col ; j ++) {
	     
			String data1 = sheet.getRow(i).getCell(j).getStringCellValue();
		    data[i-1][j] = data1;
			System.out.println(data1);
		}
		
	}
	return data;
	}
	
	
}
