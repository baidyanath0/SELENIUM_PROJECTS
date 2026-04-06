package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Manual_data_fetch {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream("C:\\Users\\koushik das\\Desktop\\SELENIUM\\ddt.xlsx");
			Workbook book=WorkbookFactory.create(file);
			Sheet sh = book.getSheet("Sheet1");
//			Row r = sh.getRow(1);
//			Cell c = r.getCell(1);
//			String value = c.toString();
			String value = book.getSheet("Sheet1").getRow(1).getCell(0).toString();
			System.out.println(value);
	

}}
