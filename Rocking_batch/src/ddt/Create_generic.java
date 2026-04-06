package ddt;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Create_generic {

	static String value = null;
	static String path = "C:\\Users\\koushik das\\Desktop\\SELENIUM\\ddt.xlsx";

	public static String ddt(String sheet, int row, int cell) {
		try {
			FileInputStream fil = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fil);
			value = book.getSheet(sheet).getRow(row).getCell(cell).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
