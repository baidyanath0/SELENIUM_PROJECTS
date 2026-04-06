package Blood_bank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Room_booking {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://10.100.10.10:8080/parbon_erp/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("8420000394");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("asd-123");
	    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	    
	    driver.findElement(By.xpath("//i[@class='fa fa-gears']")).click();
	    driver.findElement(By.xpath("//a[@href='hotel-room-booking']")).click();
	    driver.findElement(By.name("no_of_adults")).sendKeys("2");
	    driver.findElement(By.name("no_of_childs")).sendKeys("0");
	    
	    driver.findElement(By.name("check_in_date")).click();
	    WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	    Select s1= new Select(year);
	    s1.selectByValue("2024");
	    WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    Select s2 =new Select(month);
	    s2.selectByValue("4");
	    driver.findElement(By.xpath("//a[.='12']")).click();
	    
	    
	    driver.findElement(By.name("check_out_date")).click();
	    WebElement year1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	    Select s3= new Select(year1);
	    s3.selectByValue("2024");
	    WebElement month1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    Select s4 =new Select(month1);
	    s4.selectByValue("10");
	    driver.findElement(By.xpath("//a[.='30']")).click();
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    
}}
