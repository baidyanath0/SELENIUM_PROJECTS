package practice_Selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class User_Registration_Generic {
	static String value=null;
	static String path="F:\\My Project\\execel for Selenium\\fillfrom.xlsx";
	public static String read_ddt(String sheet_name,int row,int cell ) {
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fis);
//			Sheet s = book.getSheet(sheet_name);
//			Row r = s.getRow(row);
//			Cell c = r.getCell(cell);
//			value= c.toString();
			value = book.getSheet(sheet_name).getRow(row).getCell(cell).toString();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
