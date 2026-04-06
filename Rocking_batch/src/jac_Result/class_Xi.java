package jac_Result;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_Xi {
	public static void main(String[] args) throws AWTException, InterruptedException {
//				System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
//				WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://10.100.10.11:83/enter-class-xi-2025-student-details");
//		driver.findElement(By.xpath("//a[@href='enter-class-ix-2025-student-details']")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txt_code")).sendKeys("25052");
		driver.findElement(By.id("ContentPlaceHolder1_txt_no")).sendKeys("30027");
		WebElement captcha = driver.findElement(By.id("captcha_display"));
		String value = captcha.getText();
		driver.findElement(By.id("txt_captcha_input")).sendKeys(value);
		WebElement submit = driver.findElement(By.id("ContentPlaceHolder1_btn_submit"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submit);
		

	}
}

//// table[2]/tbody/tr[1]/td[3]/p[1]/strong[1]/span[1]