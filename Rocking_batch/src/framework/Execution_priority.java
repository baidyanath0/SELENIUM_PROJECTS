package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Generic_ddt;

public class Execution_priority {
	WebDriver driver;

	@Test(priority = 1)
	public void open() {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		drive.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		driver = drive;
	}

	@Test(priority = 2)
	public void login() {
		String username = Generic_ddt.read_ddt("Sheet1", 1, 0);
		String password = Generic_ddt.read_ddt("Sheet1", 1, 1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
	}

	@Test(priority = 3)
	public void leave() {
WebElement ele = driver.findElement(By.className("oxd-brand-banner"));	
		
		if(ele.isDisplayed()) {
			driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a[1]/span[1]")).click();
			
			driver.findElement(By.xpath("//a[.='Add Employee']")).click();
			String firstname = Generic_ddt.read_ddt("Sheet1", 1,2);
			String lastname = Generic_ddt.read_ddt("Sheet1", 1,4);
			
			WebElement fn = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']"));
			fn.click();
			
			fn.sendKeys(firstname);
			
			WebElement ln = driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']"));
			ln.click();
			
			ln.sendKeys(lastname);
			
			driver.findElement(By.xpath("//button[.=' Save ']")).click();
			
				try {
				WebElement ele1 = driver.findElement(By.xpath("//div[@id='oxd-toaster_1']"));
				Thread.sleep(3000);
				if(ele1.isDisplayed()) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a[1]/span[1]")).click();
					
					driver.findElement(By.xpath("//a[.='Employee List']")).click();
					
					driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(firstname);
					
					driver.findElement(By.xpath("//button[.=' Search ']")).click();
					
					driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
					
					driver.findElement(By.xpath("//button[.=' Yes, Delete ']")).click();
					
					WebElement ele2 = driver.findElement(By.xpath("//p[.='Successfully Deleted']"));
					if (ele2.isDisplayed()) {
						
						driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
						
						driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li[4]/a[1]")).click();
					}
					
					} 
				
				else {
					System.out.println("defect");
				}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			
	}
	
	
}}