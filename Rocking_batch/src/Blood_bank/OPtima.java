package Blood_bank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPtima {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://10.100.10.10/login.aspx");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("8420000394");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("asd-123");
    driver.findElement(By.xpath("//input[@type='submit']")).click();


    driver.findElement(By.xpath("//span[.='Out Patient']")).click();
    driver.findElement(By.xpath("//a[.='Outpatient Registration']")).click();
    
	
	}
	

}
