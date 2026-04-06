package my_project;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Multiple_from_fill {

	    public static void main(String[] args) throws IOException, InterruptedException {
	        // Load Excel file
	        FileInputStream fis = new FileInputStream("C:\\Users\\koushik das\\Desktop\\Baidya\\MY_Project\\user data.xlsx");
	        Workbook workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheetAt(0);

	        // Set up Selenium WebDriver
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	        // Loop through each row in the Excel file
	        for (int i = 1; i <= sheet.getLastRowNum(); i++) { // Skip header row
	            Row row = sheet.getRow(i);

	            String firstName = getCellValue(row.getCell(0));
	            String lastName = getCellValue(row.getCell(1));
	            String dob = getDateCellValue(row.getCell(2)); // Use helper method for date
	            String gender = getCellValue(row.getCell(3));
	            String state = getCellValue(row.getCell(4));
	            String district = getCellValue(row.getCell(5));
	            String block = getCellValue(row.getCell(6));
	            String filePath = getCellValue(row.getCell(7)); // Adjust according to your needs

	            // Open the URL
	            driver.get("file:///C:/Users/koushik%20das/Desktop/Baidya/MY_Project/web.html");

	            // Fill the form
	            driver.findElement(By.id("first-name")).sendKeys(firstName);
	            driver.findElement(By.id("last-name")).sendKeys(lastName);
	            driver.findElement(By.id("dob")).sendKeys(dob);
	            driver.findElement(By.id("gender")).sendKeys(gender);
	            driver.findElement(By.id("state")).sendKeys(state);
	            driver.findElement(By.id("district")).sendKeys(district);
	            driver.findElement(By.id("block")).sendKeys(block);
	            driver.findElement(By.id("file-upload")).sendKeys(filePath);

	            // Click save button
	            driver.findElement(By.xpath("//button[text()='Save']")).click();

	            // Optional: Wait for success message
	            Thread.sleep(2000); // Wait for 2 seconds
	        }

	        // Clean up
	        workbook.close();
	        fis.close();
	        driver.close();
	    }

	    private static String getCellValue(Cell cell) {
	        if (cell == null) {
	            return "";
	        }
	        switch (cell.getCellType()) {
	            case STRING:
	                return cell.getStringCellValue();
	            case NUMERIC:
	                return String.valueOf(cell.getNumericCellValue());
	            case BOOLEAN:
	                return String.valueOf(cell.getBooleanCellValue());
	            case FORMULA:
	                return cell.getCellFormula();
	            default:
	                return "";
	        }
	    }

	    private static String getDateCellValue(Cell cell) {
	        if (cell == null) {
	            return "";
	        }
	        if (cell.getCellType() == CellType.NUMERIC) {
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	            return dateFormat.format(cell.getDateCellValue());
	        }
	        return cell.getStringCellValue();
	        
	    }
	    
	}
