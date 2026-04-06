package Mbose;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
// Import from the right package for Excel
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  // Used for .xlsx files
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class IA_ix {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException  {

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://iaportal9.cludocloud.com/login");
		driver.findElement(By.id("txt_userID")).sendKeys("11087");
		driver.findElement(By.id("txt_pwd")).sendKeys("S7BYdgSFvb");
		Thread.sleep(4000);
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.xpath("//p[.='Draft Completed']")).click();
		Thread.sleep(3000);
//		----------------------------------------------------------------------------------------------------
//		// Wait for the table to be visible
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='studentTable1']"))); // Locate the table
//
//        // Find all rows of the table
//        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
//
//        // Traverse through the rows
//        for (int i = 1; i < rows.size(); i++) {  // Start from 1 to skip header row
//            WebElement row = rows.get(i);
//
//            // Find all cells in the row (columns)
//           java.util.List<WebElement> cells = row.findElements(By.tagName("td"));
//
//            // Example: Fill data in the first empty cell (or specific column)
//            if (cells.size() > 2) {  // Ensure there are enough columns
//                WebElement targetCell = cells.get(4); // Assuming you want to fill in the 3rd column (index 2)
//                WebElement inputField = targetCell.findElement(By.tagName("input")); // Assume the cell contains an input field
//                inputField.clear(); // Clear any existing text
//                inputField.sendKeys("12"); // Pass your desired data
//            }
//        }
        
//       ------------------------------------------------------------------------------------------------------------------ 
		  // Wait for the table to be visible
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='studentTable1']"))); // Locate the table
        // Read data from Excel file
        String excelFilePath = "C:\\Users\\koushik das\\Desktop\\IA_Marks.xlsx"; // Replace with your Excel file path
        FileInputStream fis = new FileInputStream(new File(excelFilePath));
        Workbook workbook = new XSSFWorkbook(fis); // For .xlsx files
        Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

        // Specify the column indices for which you want to pass values
        int[] inputColumns = {4, 6, 8, 10, 12};  // Array of column indices for multiple columns
        
        // Get the row iterator
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next(); // Skip header row

        int rowIndex = 1; // To keep track of row in the table
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            System.out.println("Processing row: " + rowIndex);

            // Traverse each column in the inputColumns array and fill data
            for (int colIndex : inputColumns) {
                if (colIndex < row.getPhysicalNumberOfCells()) {
                    Cell cell = row.getCell(colIndex);
                    String cellValue = "";  // String value to hold the result

                    // Check if the cell is numeric
                    if (cell != null && cell.getCellType() == CellType.NUMERIC) {
                        double numericValue = cell.getNumericCellValue();
                        cellValue = String.valueOf((int) Math.round(numericValue)); // Round and cast to int
                    } else if (cell != null && cell.getCellType() == CellType.STRING) {
                        cellValue = cell.getStringCellValue();
                    } else {
                        cellValue = "0"; // Default fallback for empty or invalid data
                    }

                    // Debugging: Log value and column being processed
                    System.out.println("Row: " + rowIndex + " Column: " + colIndex + " Value: " + cellValue);

                    // Now use the fetched numeric value for the corresponding table input field
                    List<WebElement> rowsInTable = table.findElements(By.tagName("tr"));
                    if (rowIndex < rowsInTable.size()) {
                        WebElement tableRow = rowsInTable.get(rowIndex); // Get the corresponding table row
                        List<WebElement> cells = tableRow.findElements(By.tagName("td"));

                        if (colIndex < cells.size()) {
                            WebElement cellElement = cells.get(colIndex);
                            try {
                                // Check if the cell contains an input field (text input)
                                List<WebElement> inputFields = cellElement.findElements(By.tagName("input"));
                                if (inputFields.size() > 0) {
                                    WebElement inputField = inputFields.get(0); // Assumes there is one input field in the cell

                                    // Only interact with input fields that are enabled
                                    if (inputField.isEnabled()) {
                                        // Wait for the input field to be clickable
                                        WebDriverWait inputFieldWait = new WebDriverWait(driver, 10);
                                        inputFieldWait.until(ExpectedConditions.elementToBeClickable(inputField));

                                        // Scroll the input field into view if necessary
                                        JavascriptExecutor js = (JavascriptExecutor) driver;
                                        js.executeScript("arguments[0].scrollIntoView(true);", inputField);

                                        // Clear any existing text and pass the new data from Excel (numeric value)
                                        inputField.clear();
                                        inputField.sendKeys(cellValue); // Send the integer/string data from Excel
                                        System.out.println("Filled input field at row " + rowIndex + ", column " + colIndex);
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println("Error interacting with cell in row " + rowIndex + ", column " + colIndex + ": " + e.getMessage());
                            }
                        }
                    }
                }
            }
            rowIndex++; // Increment row index for the next row
        }
//       ----------------------------------------------------------------------------------------------------------------------
//        // Wait for the table to be visible
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='studentTable1']"))); // Locate the table
//        
//
//        // Find all rows of the table
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//
//        // Specify the column indices for which you want to pass values
//        // Example: Column indices 1, 3, and 4 (2nd, 4th, and 5th columns)
//        int[] inputColumns = {4, 6, 4, 8, 10, 12};  // Array of column indices
//
//        // Traverse through the rows (start from 1 to skip header)
//        for (int i = 1; i < rows.size(); i++) {
//            WebElement row = rows.get(i);
//
//            // Find all cells in the row (columns)
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//
//            // Fill data in the specified columns for each row
//            for (int colIndex : inputColumns) {
//                if (colIndex < cells.size()) {
//                    WebElement cell = cells.get(colIndex);
//
//                    try {
//                        // Check if the cell contains an input field (text input)
//                        List<WebElement> inputFields = cell.findElements(By.tagName("input"));
//                        if (inputFields.size() > 0) {
//                            WebElement inputField = inputFields.get(0); // Assumes there is one input field in the cell
//                            
//                            // Only interact with input fields that are enabled
//                            if (inputField.isEnabled()) {
//                                // Wait for the input field to be clickable
//                                WebDriverWait inputFieldWait = new WebDriverWait(driver, 10);
//                                inputFieldWait.until(ExpectedConditions.elementToBeClickable(inputField));
//
//                                // Scroll the input field into view if necessary
//                                JavascriptExecutor js = (JavascriptExecutor) driver;
//                                js.executeScript("arguments[0].scrollIntoView(true);", inputField);
//
//                                // Clear any existing text and pass new data
//                                inputField.clear();
//                                inputField.sendKeys("5"); // Fill data dynamically
//                            }
//                        }
//                    } catch (Exception e) {
//                        System.out.println("Error interacting with cell in row " + i + ", column " + colIndex + ": " + e.getMessage());
//                    }
//                }
//            }
//        }
        
}}
