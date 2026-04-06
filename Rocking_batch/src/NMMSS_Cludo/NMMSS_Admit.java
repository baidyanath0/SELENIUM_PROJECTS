package NMMSS_Cludo;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NMMSS_Admit {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int y=572;
		int count=0;
		for (int i = 0; i <100; i++) {
			String ID = Nmmss_login_generic.read_ddt("Sheet1", y, 1);
			String pass = Nmmss_login_generic.read_ddt("Sheet1", y, 2);
			driver.get("https://nmmss.cludocloud.com//login");
			driver.findElement(By.name("login_id")).sendKeys(ID);
			driver.findElement(By.id("password")).sendKeys(pass);
			Thread.sleep(2000);
			System.out.println(ID +" "+ pass);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
 
	        String originalTab = driver.getWindowHandle();
	        WebElement print_admit = driver.findElement(By.xpath("//a[@href='https://nmmss.cludocloud.com\\/dowload-admit-card']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", print_admit);
			
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
//	     			
	     			driver.findElement(By.xpath("//a[text()=' Logout ']")).click();
	     		      
	     		System.out.println(count);
			y++;
			count++;
			
		}
		
		}
		
	}

