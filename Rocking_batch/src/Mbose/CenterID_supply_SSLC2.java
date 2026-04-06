package Mbose;

	import java.awt.AWTException;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	public class CenterID_supply_SSLC2 {
		public static void main(String[] args) throws AWTException, InterruptedException {
			
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
//			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://mbose-sslc-supple.cludocloud.com/login.aspx");

			driver.findElement(By.id("txtusercode")).sendKeys("DMSS0105");
			driver.findElement(By.id("txtpassword")).sendKeys("3VAA65BM44");
			Thread.sleep(4000);
			driver.findElement(By.id("btn_next")).click();

			int y = 1;
//			String expectedOptionCount = CenterID_generic.ddt("Sheet1", y, 0);
//	        int expectedOptionCount = Integer.parseInt(CenterID_generic.ddt("HSSLC", y, 0));
			
			for (int r = 0; r <16; r++) {
				String expectedOptionCountStr = CenterID_Supply_generic.ddt("MATHEMATICS2", y, 0);
				double expectedOptionCountDouble = Double.parseDouble(expectedOptionCountStr);
//				int expectedOptionCount = (int) Math.round(expectedOptionCountDouble);
			    int expectedOptionCount = (int) expectedOptionCountDouble;
			    
				String Center_code = CenterID_Supply_generic.ddt("MATHEMATICS2", y, 1);
//				System.out.println(Center_code);
				Thread.sleep(1000);
				WebElement add_marks = driver.findElement(By.xpath("//div[text()='Add Marks']"));
				JavascriptExecutor js9 = (JavascriptExecutor) driver;
		        js9.executeScript("arguments[0].click();", add_marks);
		        Thread.sleep(2000);
				driver.findElement(By.id("txt_centerCode")).sendKeys(Center_code  +Keys.BACK_SPACE+Keys.BACK_SPACE+ Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.id("ContentPlaceHolder1_btn_procede")).click();
				WebElement dropdownElement = driver.findElement(By.id("ContentPlaceHolder1_ddl_rollNo"));
				Select dropdown = new Select(dropdownElement);
				List<WebElement> options = dropdown.getOptions();
				int totalOptions = options.size()-1;
//				System.out.println(totalOptions);
				if (totalOptions == expectedOptionCount) {
					System.out.println("MATCHED - "+Center_code +"  "+expectedOptionCount+"="+ totalOptions);
				} else {
					System.out.println("not-------------match"+Center_code+"  " +expectedOptionCount+"=" + totalOptions);
//	                driver.close();
				}
				y++;
			}
			driver.quit();
		}
	}

	//driver.findElement(By.id("btn_logout")).click();

