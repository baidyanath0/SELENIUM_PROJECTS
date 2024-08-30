package practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qtalk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chat.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Number / Email']")).sendKeys("7362984146");
		driver.findElement(By.xpath("//input[@class='rs-input rs-input-lg' and @id='password']")).sendKeys("Badu#321");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='search' and @type='search' and @placeholder='Search']")).click();
		driver.findElement(By.xpath("//span[text()='NIRANJAN KUMAR T R',' - ','trainer']")).click();
		
		
	}
}
