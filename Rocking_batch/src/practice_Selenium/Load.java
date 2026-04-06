package practice_Selenium;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import practice_selenium_generic.Base_class;

public class Load extends Base_class {
	@Test
public void Login() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);      //username and password value inherit from base class
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		driver.findElement(By.xpath("//span[.='Recruitment']")).click();
	}
	@Test
		public void Fillup() {
		int numIterations = 5;

        for (int i = 0; i < numIterations; i++) {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Rahul");
		driver.findElement(By.name("middleName")).sendKeys("Kumar");
		driver.findElement(By.name("lastName")).sendKeys("Das");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here'])[1]")).sendKeys("asd@gmail.com");
		driver.findElement(By.xpath("//div[@class='oxd-file-button']")).sendKeys("C:\\Users\\koushik das\\Downloads\\blank.pdf");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='Candidates']")).click();
		
	}}
	
}
	
		
	


