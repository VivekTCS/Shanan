package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A02 {
//numeric type data
	public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Shri\\Documents\\17sept.xlsx");
	double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println(data);
	}
}
