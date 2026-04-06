package Blood_bank;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bag_Issue {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.navigate().to(" https://optima-cnci-test.cludocloud.com/login.aspx\r\n");
		driver.navigate().to("https://cnci-live-link.cludocloud.com/login.aspx");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		driver.findElement(By.id("details-button")).click();
//		driver.findElement(By.id("proceed-link")).click();

		// login
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("7222222222");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("asd-123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		for (int i = 0; i <30; i++) {
			// open dashboard
			driver.findElement(By.xpath("//span[.='Dashboard']")).click();
			driver.findElement(By.xpath("//a[@href='blood-donation-dashboard.aspx']")).click();
			Thread.sleep(1000);
			// selecte date and search
//			driver.findElement(By.xpath("//input[@id='txt_date']")).click();
//			driver.findElement(By.xpath("//a[.='10']")).click();
//			driver.findElement(By.id("ContentPlaceHolder1_btn_apply")).click();
//			// open Collection pending and issue the bag
			driver.findElement(By.xpath("(//h4[@class='info-box-text info-box-new-text'])[3]")).click();
			driver.findElement(By.xpath("(//span[@class='caret'])[1]")).click();
//-------------------------------------------------------------------------------------------------------------------------------

			driver.findElement(By.xpath("(//a[@id='LinkButton1'])[1]")).click();
			driver.findElement(By.id("select2-ddlbagtype-container")).click();
//
////		driver.findElement(By.xpath("//li[.='DOUBLE BAG - 450 ML']")).click();
////		driver.findElement(By.xpath("//li[.='SINGLE BAG - 350 ML']")).click();
////		driver.findElement(By.xpath("//li[.='SINGLE BAG - 450 ML']")).click();
////		driver.findElement(By.xpath("//li[.='QUADRUPLE BAG - 350 ML']")).click();
			driver.findElement(By.xpath("//li[.='QUADRUPLE BAG - 450 ML']")).click();
//		    x driver.findElement(By.xpath("//li[.='TRIPLE BAG - 350 ML']")).click();
//		    driver.findElement(By.xpath("//li[.='TRIPLE BAG - 450 ML']")).click();
            Thread.sleep(4000);
			driver.findElement(By.xpath("//td[text()='dfbgvn']")).click();
//			JavascriptExecutor execut = (JavascriptExecutor) driver;
//				execut.executeScript("arguments[0].click();", bag);
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//td[.='30-06-2029']")).click();
			driver.findElement(By.xpath("//input[@id='btnsave']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
			// collection
			driver.findElement(By.xpath("(//span[@class='caret'])[1]")).click();
			Thread.sleep(1000);
//---------------------------------------------------------------------------------------------------------------------------------
			String originalTab = driver.getWindowHandle();
			driver.findElement(By.id("btn_barcode")).click();
			Thread.sleep(1000);

			// Get all window handles
			Set<String> allHandles = driver.getWindowHandles();

			// Iterate through the handles to identify the new tab and close it
			for (String handle : allHandles) {
				if (!handle.equals(originalTab)) {
					driver.switchTo().window(handle); // Switch to the new tab
					driver.close(); // Close the new tab
					break; // Exit the loop after closing the new tab
				}
			}
			// Switch back to the original tab
			driver.switchTo().window(originalTab);

			// Blood Collection
			driver.findElement(By.xpath("(//span[@class='caret'])[1]")).click();
			driver.findElement(By.id("btn_bloodCollection")).click();
			driver.findElement(By.xpath("//span[@title='--Select--']")).click();
			driver.findElement(By.xpath("//li[.='Success']")).click();
			driver.findElement(By.id("ContentPlaceHolder1_txt_Quantity")).sendKeys("450");
			driver.findElement(By.id("ContentPlaceHolder1_txt_no_paks")).sendKeys("1");
			driver.findElement(By.xpath("//span[@title='--SELECT--']")).click();
			// driver.findElement(By.xpath("//li[.='CPDA/CPDA1']")).click();
			driver.findElement(By.xpath("//li[.='CPD+SAGM']")).click();
			driver.findElement(By.id("ContentPlaceHolder1_txt_segment")).sendKeys("BDM003");
			driver.findElement(By.id("ContentPlaceHolder1_txt_remarks")).sendKeys("ok");
			driver.findElement(By.id("ContentPlaceHolder1_btnSave")).click();
			driver.findElement(By.xpath("//button[.='OK']")).click();

			// Component Preparation
			driver.findElement(By.xpath("(//span[@class='caret'])[1]")).click();
			driver.findElement(By.id("ContentPlaceHolder1_lst_Details_btnComponent_0")).click();
			driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[1]")).sendKeys("450");
			driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[2]")).sendKeys("350");
			driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[3]")).sendKeys("200");
			driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[4]")).sendKeys("450");
			driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[5]")).sendKeys("300");
			driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[6]")).sendKeys("450");
			driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[7]")).sendKeys("200");
			driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[8]")).sendKeys("450");

			driver.findElement(By.id("ContentPlaceHolder1_btnsave")).click();
			driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
             //click on menu bar
			driver.findElement(By.xpath("//a[@class='sidebar-toggle']")).click();
			

		}
		driver.quit();

	}
}
