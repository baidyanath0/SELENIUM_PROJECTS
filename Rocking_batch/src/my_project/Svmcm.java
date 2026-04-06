package my_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

public class Svmcm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://svmcm.wb.gov.in");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//p[.='Registration']")).click();
        
        driver.findElement(By.xpath("//a[.='Non-Topper']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//a[@class='btn pop_btn regigtration_btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='close']")).click();
        driver.findElement(By.xpath("(//a[@name='1'])[3]")).click();
        driver.findElement(By.name("name_of_qualifying_exam")).click();
        




        
        
        
	
}}
