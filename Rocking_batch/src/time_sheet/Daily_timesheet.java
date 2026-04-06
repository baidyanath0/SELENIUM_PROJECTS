package time_sheet;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Daily_timesheet {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://cludo.stridehrms.com");
		driver.findElement(By.id("tblogin")).sendKeys("7362984146");
		driver.findElement(By.id("pass")).sendKeys("Cludo@baidya4146");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
		driver.findElement(By.xpath("(//span[@class='pull-right-container'])[4]")).click();
		driver.findElement(By.xpath("//a[@href='https://cludo.stridehrms.com/TimeSheet/TimeSheetView']")).click();
		driver.findElement(By.xpath("//button[@class='btnndec btn btn-warning']")).click();

}}
