import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test1 {


	static XSSFWorkbook wb  ;
	static XSSFSheet sheet;

	Test1(String exl_path ,String Sheet_name) throws IOException{

		String project_path = System.getProperty("user.dir");
		String path = project_path + exl_path;
		XSSFWorkbook wb = new XSSFWorkbook(path);
		sheet = wb.getSheet(Sheet_name);

	}

	public static void main(String[] args) throws IOException {
		Test1 ts = new Test1("/Excel/Data.xlsx","Sheet1");
		ts.getRow1();
		ts.getCellData_String(0,0);
		ts.getCell_data_numeric(1,1);

	}
	
	public static int getRow1() {
	int row_count = 0;
		row_count = sheet.getPhysicalNumberOfRows();

      return row_count;
	}
	



	public static int  getCol_count() 
	{	int col_count = 0;

		col_count = sheet.getRow(0).getPhysicalNumberOfCells();
        return col_count;

	}

	public static String getCellData_String(int row_num,int col_num) {

		String cell_data = sheet.getRow(row_num).getCell(col_num).getStringCellValue();
		return cell_data;

	}

	public static double  getCell_data_numeric(int row_num,int col_num) {
		double cell_data = sheet.getRow(row_num).getCell(col_num).getNumericCellValue();
		return cell_data;

	}

}






