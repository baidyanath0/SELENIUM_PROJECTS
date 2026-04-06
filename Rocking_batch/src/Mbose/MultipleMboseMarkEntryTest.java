package Mbose;
import java.util.concurrent.TimeUnit;
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

	public class MultipleMboseMarkEntryTest {

	    WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }

	    @Test(dataProvider = "getCenterCodes", threadPoolSize = 2)
	    public void loginAndEnterMarks(String centerCode) throws InterruptedException {
//	        driver.get("https://mbose.cludocloud.com/login.aspx");
	    	driver.get("http://10.100.10.10:85/dashboard.aspx");
	        driver.findElement(By.id("txtusercode")).sendKeys("BMST0013");
	        driver.findElement(By.id("txtpassword")).sendKeys("HHXT5X94MS");
	        Thread.sleep(4000);
	        driver.findElement(By.id("btn_next")).click();

	        for (int r = 0; r < 5; r++) {
	            driver.findElement(By.xpath("//div[text()='Add Marks']")).click();
	            driver.findElement(By.id("txt_centerCode")).sendKeys(centerCode + Keys.ENTER);  // Use dynamic center code
	            Thread.sleep(1000);
	            WebElement sub = driver.findElement(By.id("ContentPlaceHolder1_ddl_subject"));
	            Select S = new Select(sub);
	            S.selectByIndex(1);
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

	    @DataProvider(name = "getCenterCodes")
	    public Object[][] getCenterCodes() {
	        return new Object[][]{
	        	{"422"}, {"296"},
//	            {"20801"}, {"20802"}, {"20803"}, {"20804"}, {"20805"},
//	            {"20806"}, {"20807"}, {"20808"}, {"20809"}, {"20810"}
	        };
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();  // Close the browser after all tests are done
	    }
	}


