package OrangeHRm_runnerclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Generic_ddt;
import generic_TestNG.Base_class;

public class Add_leave extends Base_class {
	@Test
	public void leave() {
		//open the browser using generic code
		//login into the application	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		//assign the leave applictraion
			driver.findElement(By.xpath("//span[.='Leave']")).click();
			driver.findElement(By.xpath("//a[.='Apply']")).click();
			driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();
		}
		

	}

