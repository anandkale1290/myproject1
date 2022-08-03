package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static String getStringData(String sheet,int Row,int cell) throws Exception {
		String path="C:\\Users\\Anand\\eclipse-workspace\\Demo_Project\\Exceldata\\loginsheet.xlsx";
		FileInputStream file=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(file);
	
	return wb.getSheet(sheet).getRow(Row).getCell(cell).getStringCellValue();
	}
}
