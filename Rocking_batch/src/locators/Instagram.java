package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {  
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Log In']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("theluxurylifesty666@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("das@2001");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("niranjan_ka_18");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='niranjan_ka_18']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Follow']")).click();
		driver.findElement(By.xpath("//div[text()='Message']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@aria-label='Message']")).click();
		driver.findElement(By.xpath("//div[@aria-describedby='Message']")).sendKeys("hi sir. This side Baidyanath. this message is genereted by automation script");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	}
}



