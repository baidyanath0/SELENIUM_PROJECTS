package jac_Result;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_X_2025 {
	public static void main(String[] args) throws AWTException, InterruptedException  {
//		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://10.100.10.11:83/");
		
		int y =2;
		for (int i = 0; i <1000; i++) {
			String code = X_Rollcode_generic.read_ddt("Sheet1", y, 0); // (row,cell)
			String no = X_Rollcode_generic.read_ddt("Sheet1", y, 1); 
			String name = X_Rollcode_generic.read_ddt("Sheet1", y, 9); 			
            System.out.println(code);
            System.out.println(no);

			driver.findElement(By.xpath("//a[@href='enter-class-x-2025-student-details']")).click();
			driver.findElement(By.id("ContentPlaceHolder1_txt_code")).sendKeys(code + Keys.BACK_SPACE );
			driver.findElement(By.id("ContentPlaceHolder1_txt_no")).sendKeys("00"+ no+ Keys.BACK_SPACE );
			Thread.sleep(2000);
			WebElement textElement = driver.findElement(By.id("captcha_display")); 
            String copiedText = textElement.getText();
            driver.findElement(By.id("txt_captcha_input")).sendKeys(copiedText);
			Thread.sleep(2000);

			WebElement submit = driver.findElement(By.id("ContentPlaceHolder1_btn_submit"));
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].click();", submit);;
			 Thread.sleep(2000);
			 WebElement roll = driver.findElement(By.id("ContentPlaceHolder1_lblrollcode"));
				String webData = roll.getText();
			  WebElement student_name = driver.findElement(By.id("ContentPlaceHolder1_lblrollno"));
				String webData2 = student_name.getText();
				
//				System.out.println(webData2);
			if(no.equals(webData)) {
				driver.findElement(By.xpath("//a[text()='Home']")).click();
				System.out.println(no+ " = " + webData+ name+"="+webData2);
			}
			else {
				System.out.println(no+ "-" +webData + "Fail");
				driver.quit();
			} 
			
			y++;

		}
		driver.quit();
		}}

