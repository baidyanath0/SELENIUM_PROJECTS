package Mbose;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Logout {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for (int i = 0; i < 10; i++) {
		driver.get("http://10.100.10.10:8080/ci4-projects/ticket-management-system/sign-in");

		
			driver.findElement(By.name("userid")).sendKeys("8420000394");
			driver.findElement(By.name("password")).sendKeys("asd-123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("(//a[@class='menu-link px-5'])[2]")).click();
			
			WebElement Logo=driver.findElement(By.xpath("//a[.='Logout']"));

			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].click();", Logo);// Replace with the correct locator
			// Create an instance of Actions class
			//Actions actions = new Actions(driver);
			// Perform the mouse hover action
			//actions.moveToElement(elementToHover).perform();

		}
		driver.quit();
	}
}
