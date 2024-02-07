package Test_cases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.Reg_page;

public class DataDrivernTesting {
	static String path = "D:\\All_in_one\\Excel\\Data.xlsx";
	static XSSFWorkbook wb;

	
	public static Object[][] acces_data(String path,String Sheet_name) throws IOException {
		//loading the Excel File 
		 wb  = new XSSFWorkbook(path);
		//loading the sheet 
		XSSFSheet sheet = wb.getSheet(Sheet_name);
		//how many numbers of rows
		int rows = sheet.getPhysicalNumberOfRows();
		//ho many numbers of col
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		Object data[][] = new Object[rows-1][cols]; 
		for(int i = 1 ; i < rows ;i ++) {
			for(int j = 0 ;j < cols ; j ++ ) {
				String cell_data = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j] = cell_data;
			}
			
		}
		return data;
	} 

	
//		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(3).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(4).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(5).getStringCellValue());
		/*
		//string data
		sheet.getRow(0).getCell(0).getStringCellValue();
		//numeric data
		sheet.getRow(1).getCell(1).getNumericCellValue();
		*/
		

	

}
