package Mbose;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Mbose_generic {
	static String path = "F:\\Cludo\\MBOSE\\Marks.xlsx";  // Path to your Excel file

    // Generic method to read data from Excel (string or numeric)
    public static String read_ddt(String sheetName, int row, int cell) throws InvalidFormatException {
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(new File(path));
            Workbook workbook = new XSSFWorkbook(fis);  // Assumes an .xlsx file
            Sheet sheet = workbook.getSheet(sheetName);
            Row excelRow = sheet.getRow(row);
            Cell cellData = excelRow.getCell(cell);

            // Check the cell type and read the value accordingly
            if (cellData != null) {
                switch (cellData.getCellType()) {
                    case NUMERIC:
                        value = String.valueOf(cellData.getNumericCellValue());  // Convert numeric value to string
                        break;
                    case STRING:
                        value = cellData.getStringCellValue();  // Directly get the string value
                        break;
                    case BOOLEAN:
                        value = String.valueOf(cellData.getBooleanCellValue());  // Convert boolean value to string
                        break;
                    default:
                        value = "";  // Handle empty or unsupported types
                        break;
                }
            } else {
                value = "";  // Return empty string if cell is empty
            }

            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }}
