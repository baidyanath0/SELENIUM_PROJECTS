package Blood_bank;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Grouping {
	public static void main(String[] args) throws AWTException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://optima-cnci-test.cludocloud.com/login.aspx\r\n");

//		driver.findElement(By.id("details-button")).click();
//		driver.findElement(By.id("proceed-link")).click();
//		
		 
		// login
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("8420000394");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("asd-123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Grouping
		driver.findElement(By.xpath("//span[.='Dashboard']")).click();
		driver.findElement(By.xpath("//a[@href='blood-donation-dashboard.aspx']")).click();
		driver.findElement(By.xpath("//span[@id='ContentPlaceHolder1_lblgroupingpending']")).click();
        
        for (int i = 0; i <20; i++) {
        driver.findElement(By.id("ContentPlaceHolder1_lst_Details_chkSelect_0")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("(//b[@role='presentation'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='A-']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Remarks'])[1]")).sendKeys("OK");
		driver.findElement(By.id("ContentPlaceHolder1_btnSave")).click();
		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		Thread.sleep(2000);
        }
        driver.quit();
	}}
