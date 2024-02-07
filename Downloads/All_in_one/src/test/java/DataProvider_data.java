import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_data {



	@Test(dataProvider = "data_privider")
	public void test_data1(String user_name, String pass_word) {
		System.out.println(user_name+" " + pass_word);
		
	}
	
	@DataProvider(name = "data_privider" )
	public Object[][] data() throws IOException {
		
		String path = "/Excel/Data.xlsx";
		String Sheet_name = "Sheet1";
		Object data[][] = data_Acces(path,Sheet_name);
		return data;
		
				
	}
	
	
	
	
	public static Object[][] data_Acces(String path ,String  sheet) throws IOException {
	
		Test1 ts = new Test1(path,sheet);
		int rows = ts.getRow1();
		System.out.println(rows);
		int col = ts.getCol_count();

		Object data[][] = new Object[rows-1][col];
		
		System.out.println(col);
		for(int i = 1 ; i < rows ; i++ ) {
			
			for(int j = 0 ; j < col ; j ++) {
				String cell_data = ts.getCellData_String(i, j);
				data[i-1][j] = cell_data;
				
			
//				String data = ts.getCellData_String(i, j);
//			    System.out.println(data);
			
			}
		}
		return data;

	}
}
