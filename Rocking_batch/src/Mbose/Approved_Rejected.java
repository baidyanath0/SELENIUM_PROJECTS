package Mbose;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approved_Rejected {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://10.100.10.10:85/login.aspx");
		driver.findElement(By.id("txtusercode")).sendKeys("HEE001");
		driver.findElement(By.id("txtpassword")).sendKeys("YF9E46YX2B");
		Thread.sleep(4000);
		driver.findElement(By.id("btn_next")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txt_rollNumber")).sendKeys("137186");
		driver.findElement(By.id("ContentPlaceHolder1_btn_rollNoSearch")).click();
		driver.findElement(By.xpath("//a[text()='Start Review']")).click();
		WebElement approve = driver.findElement(By.id("btn_approveAction"));
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].scrollIntoView(true);", approve);
		approve.click();
		 
		
		
		
}}
