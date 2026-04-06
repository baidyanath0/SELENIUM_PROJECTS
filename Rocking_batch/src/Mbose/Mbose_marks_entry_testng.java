package Mbose;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
	import java.util.concurrent.TimeUnit;

	public class Mbose_marks_entry_testng {

	    WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }

	    @Test(dataProvider = "getCenterCodes", threadPoolSize = 10)
	    public void loginAndEnterMarks(String centerCode) throws InterruptedException {
//	        driver.get("https://mbose.cludocloud.com/login.aspx");
	    	driver.get("http://mbose-hsslc.cludocloud.com");
	        driver.findElement(By.id("txtusercode")).sendKeys("BDSS0135");
	        driver.findElement(By.id("txtpassword")).sendKeys("QX6WDSRUPV");
	        Thread.sleep(4000);
	        driver.findElement(By.id("btn_next")).click();

	        for (int r = 0; r < 500; r++) {
	            driver.findElement(By.xpath("//div[text()='Add Marks']")).click();
	            driver.findElement(By.id("txt_centerCode")).sendKeys(centerCode + Keys.ENTER);
	            Thread.sleep(1000);

	            // Check if the subject dropdown contains the option
	            WebElement sub = driver.findElement(By.id("ContentPlaceHolder1_ddl_subject"));
	            Select select = new Select(sub);
//	            boolean found = false;

	         // List of values you're looking for in the dropdown
	            List<String> valuesToFind = new ArrayList<>();
	            valuesToFind.add("English                  (E)-01");
	            valuesToFind.add("Khasi(MIL)               (K)-03");
	            valuesToFind.add("Political Science        (Ps)-11"); // Add as many as needed
	            valuesToFind.add("Education                (Ed)-14");
	            valuesToFind.add("Elective Khasi           (k)-22");
	            valuesToFind.add("Philosophy               (Pls)-52");
	            valuesToFind.add("Sociology                (Sg)-74");
	            valuesToFind.add("Economics                (Ec)-81");
	            valuesToFind.add("Business Studies         (Bs)-82");
	            valuesToFind.add("Mathematics              (M)-83");
	            valuesToFind.add("Physics                  (Ph)-92");
	            valuesToFind.add("Chemistry                (Ch)-93");
	            valuesToFind.add("Biology                  (Bio)-94");
	            valuesToFind.add("Accountancy              (Ac)-95");
	            valuesToFind.add("Entrepreneurship         (En)-96");


	            // Get all options from the dropdown
	            List<WebElement> options = select.getOptions();
	            boolean founded = false;

	            for (WebElement option : options) {
	                // Check if the option text matches any of the expected values
	                if (valuesToFind.contains(option.getText())) {
	                    founded = true;
	                    break;  // Exit the loop as soon as one of the values is found
	                }
	            }
	            
	            // If the expected subject is not found, change the center code
	            if (!founded) {
	                // Get next center code from the DataProvider
//	                centerCode = getNextCenterCode(centerCode);
//	                driver.findElement(By.id("txt_centerCode")).clear();
	                driver.findElement(By.id("txt_centerCode")).sendKeys(centerCode + Keys.ENTER);
	                Thread.sleep(1000); // wait for the new dropdown to load
	                sub = driver.findElement(By.id("ContentPlaceHolder1_ddl_subject"));
	                select = new Select(sub);	               
	            }

	            // Proceed with the subject selection after verifying the dropdown
	            select.selectByIndex(1);
	            driver.findElement(By.id("ContentPlaceHolder1_btn_procede")).click();
	            Thread.sleep(1000);
	            WebElement rol = driver.findElement(By.id("ContentPlaceHolder1_ddl_rollNo"));
	            Select S1 = new Select(rol);
	            S1.selectByIndex(1);
	            driver.findElement(By.id("ContentPlaceHolder1_lnkaddMarks")).click();
	            Thread.sleep(1000);
	            Alert a = driver.switchTo().alert();
	            a.accept();
	            Thread.sleep(2000);

	            WebElement table = driver.findElement(By.id("tbl_marks"));
	            for (int i2 = 0; i2 < 25; i2++) {
	                WebElement inputField = table.findElement(By.xpath("//tr[" + (i2 + 1) + "]/td[4]/input"));
	                if (inputField.isEnabled()) {
	                    WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
	                    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(inputField));
	                    input.sendKeys("68");
	                } else {
	                    break;
	                }
	            }

	            // for uncheck
	            JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
	            jsExecutor1.executeScript("window.scrollTo(0, 0);");
	            for (int i2 = 0; i2 < 25; i2 += 3) {
	                WebElement inputField = table.findElement(By.xpath("//tr[" + (i2 + 1) + "]/td[2]/span/input"));
	                if (inputField.isSelected()) {
	                    WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
	                    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(inputField));
	                    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	                    js2.executeScript("arguments[0].click();", input);
	                } else {
	                    break;
	                }
	            }

	            // for selection dropdown
	            jsExecutor1.executeScript("window.scrollTo(0, 0);");
	            for (int i2 = 0; i2 < 25; i2 += 2) {
	                WebElement inputField = table.findElement(By.xpath("//tr[" + (i2 + 2) + "]/td[3]/select"));
	                if (inputField.isEnabled()) {
	                    WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
	                    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(inputField));
	                    Select s3 = new Select(inputField);
	                    s3.selectByVisibleText("Expelled");
	                } else {
	                    break;
	                }
	            }

	            WebElement ele = driver.findElement(By.id("ContentPlaceHolder1_lnk_draft"));
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("arguments[0].scrollIntoView(true);", ele);
	            Thread.sleep(1000);
	            ele.click();
	            Alert p = driver.switchTo().alert();
	            p.accept();
	            driver.findElement(By.xpath("//button[text()='OK']")).click();
	        }
	    }
          
//	    // Method to get the next available center code from the DataProvider list
//	    public String getNextCenterCode(String currentCenterCode) {
//	        String[] centerCodes = {"601", };
//	        
//	        // Find the index of the current center code in the array
//	        int currentIndex = -1;
//	        for (int i = 0; i < centerCodes.length; i++) {
//	            if (centerCodes[i].equals(currentCenterCode)) {
//	                currentIndex = i;
//	                break;
//	            }
//	        }
//
//	        // Return the next center code in the array, or loop back to the first code if last
//	        if (currentIndex == -1 || currentIndex == centerCodes.length - 1) {
//	            return centerCodes[0]; // Return the first center code if last code is reached or not found
//	        } else {
//	            return centerCodes[currentIndex + 1]; // Return the next code
//	        }
//	    }

	    @DataProvider(name = "getCenterCodes")
	    public Object[][] getCenterCodes() {
	        return new Object[][]{
	            {"601"}, 
//	            {"20806"}, {"20807"}, {"20808"}, {"20809"}, {"20810"}
	        };
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();  // Close the browser after all tests are done
	    }
	}
