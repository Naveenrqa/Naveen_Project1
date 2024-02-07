import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {

		Test1 ts = new Test1("/Excel/Data.xlsx","Sheet1");
		ts.getRow1();
		ts.getCellData_String(0,0);
		ts.getCell_data_numeric(1,1);
	}

}
