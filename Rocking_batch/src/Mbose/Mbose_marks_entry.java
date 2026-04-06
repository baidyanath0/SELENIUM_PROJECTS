package Mbose;

import java.awt.AWTException;
import java.util.List;
import java.util.NoSuchElementException;
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

public class Mbose_marks_entry {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://mbose-hsslc.cludocloud.com/login.aspx");
		driver.findElement(By.id("txtusercode")).sendKeys("NKSS0076"); // change ID
		driver.findElement(By.id("txtpassword")).sendKeys("8A98QMEYE3"); // change Password
		Thread.sleep(4000);
		driver.findElement(By.id("btn_next")).click();
	
		int y = 0;
		String expectedOptionCountStr = CenterID_generic.ddt("Garo (MIL)", y, 0);
		double expectedOptionCountDouble = Double.parseDouble(expectedOptionCountStr);
//		int expectedOptionCount = (int) Math.round(expectedOptionCountDouble);
	    int Count = (int) expectedOptionCountDouble;
	    
		for (int r = 0; r < Count; r++) {
			String Center_code = CenterID_generic.ddt("Garo (MIL)", y, 3); // change sheet name
			System.out.println(Center_code);
			driver.findElement(By.xpath("//div[text()='Add Marks']")).click();
			driver.findElement(By.id("txt_centerCode")).sendKeys(Center_code +Keys.BACK_SPACE+ Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.id("ContentPlaceHolder1_btn_procede")).click();
			Thread.sleep(1000);
			WebElement rol = driver.findElement(By.id("ContentPlaceHolder1_ddl_rollNo"));
			Select dropdown = new Select(rol);
			List<WebElement> options = dropdown.getOptions();
			if (options.size() > 1) {
				dropdown.selectByIndex(1);
//			Select S1 = new Select(rol);
//			S1.selectByIndex(1);
				driver.findElement(By.id("ContentPlaceHolder1_lnkaddMarks")).click();
				Thread.sleep(1000);
				Alert a = driver.switchTo().alert();
				a.accept();
				Thread.sleep(2000);
				WebElement table = driver.findElement(By.id("tbl_marks"));
				// for pass marks value
				int x = 1;
				for (int i = 0; i < 25; i++) {
					WebElement inputField = table.findElement(By.xpath("//tr[" + (i + 1) + "]/td[4]/input"));
					if (inputField.isEnabled()) {
						WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
						WebElement input = wait.until(ExpectedConditions.elementToBeClickable(inputField));
//					input.sendKeys(String.valueOf(valueFromExcel));
						input.sendKeys("68");
						x++;
					} else {
						break;
					}
				}
//			// for uncheck
//			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//			jsExecutor.executeScript("window.scrollTo(0, 0);");
//			for (int i = 0; i < 25; i += 3) {
//				WebElement inputField = table.findElement(By.xpath("//tr[" + (i + 1) + "]/td[2]/span/input"));
//				if (inputField.isSelected()) {
//					WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
//					WebElement input = wait.until(ExpectedConditions.elementToBeClickable(inputField));
//					JavascriptExecutor js1 = (JavascriptExecutor) driver;
//					js1.executeScript("arguments[0].click();", input);
//				} else {
//					break;
//				}
//			}
//			System.out.println(1);			
//			// for selection dropdown
//			JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
//			jsExecutor1.executeScript("window.scrollTo(0, 0);");
//			for (int i = 0; i < 25; i +=2) {
//				WebElement inputField = table.findElement(By.xpath("//tr[" + (i + 2) + "]/td[3]/select"));
//				if (inputField.isEnabled()) {
//					WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
//					WebElement input = wait.until(ExpectedConditions.elementToBeClickable(inputField));
//					Select s3 = new Select(inputField);
//					s3.selectByVisibleText("Expelled");
//				} else {
//					break;
//				}
//			}
//			System.out.println(2);
				WebElement ele = driver.findElement(By.id("ContentPlaceHolder1_lnk_draft"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", ele);
				Thread.sleep(1000);
				ele.click();

				Alert p = driver.switchTo().alert();
				p.accept();
				driver.findElement(By.xpath("//button[text()='OK']")).click();
				Thread.sleep(2000);
				WebElement ele2 = driver.findElement(By.id("ContentPlaceHolder1_a_finaleSubmit"));
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("arguments[0].click();", ele2);
				driver.findElement(By.id("txt_password")).sendKeys("8A98QMEYE3"); // change password
				driver.findElement(By.id("ContentPlaceHolder1_btn_finalSubmit")).click();
				Alert e = driver.switchTo().alert();
				e.accept();
				driver.findElement(By.xpath("//button[text()='OK']")).click();
			} else {
				
				System.out.println("Add");
				driver.findElement(By.xpath("//button[text()='OK']")).click();
				driver.findElement(By.id("ContentPlaceHolder1_lnk_refresh")).click();
			}
		}	y++;
	}
}

//driver.findElement(By.id("btn_logout")).click();
//Alert a = driver.switchTo().alert();
//a.accept();
