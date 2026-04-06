package jac_Result;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class_XII_2025 {
	public static void main(String[] args) throws AWTException, InterruptedException  {
//		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jacresults.com/");
		
		int y =2;
		for (int i = 0; i <1000; i++) {
			String code = XII_Rollcode_generic.read_ddt("science", y, 0); // (row,cell)
			String no = XII_Rollcode_generic.read_ddt("science", y, 1); 
			String Stream= XII_Rollcode_generic.read_ddt("science", y, 2); 			
            System.out.println(code);
            System.out.println(no);

			driver.findElement(By.xpath("//a[href='enter-class-xii-arts-2025-student-details']")).click();
//			driver.findElement(By.xpath("//a[@href='enter-class-xii-2025-student-details']")).click();

			driver.findElement(By.id("ContentPlaceHolder1_txt_code")).sendKeys("11001");
			driver.findElement(By.id("ContentPlaceHolder1_txt_no")).sendKeys("40001" );
			Thread.sleep(2000);
//			WebElement textElement = driver.findElement(By.id("captcha_display")); 
//            String copiedText = textElement.getText();
//            driver.findElement(By.id("txt_captcha_input")).sendKeys(copiedText);
//			Thread.sleep(2000);
			WebElement STREAM = driver.findElement(By.id("ContentPlaceHolder1_ddl_stream"));
			 Select S= new Select(STREAM);
		        S.selectByValue("SCI");

			WebElement submit = driver.findElement(By.id("ContentPlaceHolder1_btn_submit"));
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", submit);;
			 Thread.sleep(2000);
//			driver.findElement(By.xpath(""));
			driver.findElement(By.xpath("Falt")).sendKeys("Add");
				
				driver.findElement(By.xpath("//a[text()='Home']")).click();
//				System.out.println(webData2);
			   
			y++;

		}
		driver.quit();
		}}