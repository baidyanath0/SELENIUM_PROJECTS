package my_project;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_username {
	static String value=null;
	static String path="F:\\My Project\\user name.xlsx";
	public static String read_ddt(String sheet_name,int row,int cell ) {
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fis);
			Sheet s = book.getSheet(sheet_name);
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
			value= c.toString();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}

}
