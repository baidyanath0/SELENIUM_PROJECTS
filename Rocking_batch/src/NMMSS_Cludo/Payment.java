package NMMSS_Cludo;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		int x = 2502;
		for (int i = 0; i < 50; i++) {
		   driver.get("http://10.100.10.10:8080/igntr_uat/merit_portal/");
		    //driver.get("https://nmms.cludocloud.com//");
		    driver.findElement(By.xpath("//input[@placeholder='Enter Login Id']")).sendKeys("9658354693"+ x);
		    driver.findElement(By.xpath("//input[@placeholder='Enter Aadhaar Number']")).sendKeys("98418520" + x);
		    driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']")).sendKeys("asd-123");
		    Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[.='Pay Fees']")).click(); // payment from menu list menu
	        Thread.sleep(1000);
			driver.findElement(By.xpath("//button[.=' Make Payment']")).click();
			driver.findElement(By.xpath("//label[.='Net Banking ']")).click();
			driver.findElement(By.id("ICIC")).click();
			driver.findElement(By.xpath("//span[.='Pay Now']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[.='Success']")).click();
//			driver.findElement(By.className("success")).click();
			Thread.sleep(3000);
			Alert a = driver.switchTo().alert();
			a.accept();
			Thread.sleep(15000);
		
			driver.findElement(By.xpath("//a[text()=' Back to Dashboard']")).click();
			Thread.sleep(4000);
			System.out.println("yes1");
		    driver.findElement(By.xpath("//span[.='Application Print']")).click();
		    Thread.sleep(5000);
		    WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
	        // Wait until the overlay disappears
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='content'])[1]")));
            driver.close();
//        	String originalTab = driver.getWindowHandle();
//		// Get all window handles
//					Set<String> allHandles = driver.getWindowHandles();
//
//					// Iterate through the handles to identify the new tab and close it
//					for (String handle : allHandles) {
//						if (!handle.equals(originalTab)) {
//							driver.switchTo().window(originalTab);
//				            Thread.sleep(3000);
//							
//							driver.close();
//						 // Switch to the new tab
//							
//							
//							 
//					            
//							break; // Exit the loop after closing the new tab
//						}
//					}   
		    WebElement logout = driver.findElement(By.xpath("//a[@class='dropdown-item logout']"));
			logout.click();
//			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//	        jsExecutor.executeScript("arguments[0].click();", logout);
	    	System.out.println("yes2");
//	        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
//	        jsExecutor1.executeScript("arguments[0].click();", logout);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.open();");
////			driver.navigate().refresh();
//		
////			driver.findElement(By.xpath("//a[@href='http://cludocloud.com:8080/igntr_uat/merit_portal/print-student-registration-details']")).click();
////			Thread.sleep(1000);
			
	
			}
	            //driver.findElement(By.xpath("//a[@class='dropdown-item logout']")).click(); // logout

           
			
			x++;

		}
}
