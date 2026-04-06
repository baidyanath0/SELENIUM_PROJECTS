package Mbose;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mbose {
	public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://mbose.cludocloud.com/login.aspx");
        driver.findElement(By.id("txtusercode")).sendKeys("SGST0002");
        driver.findElement(By.id("txtpassword")).sendKeys("asd-123");
        Thread.sleep(4000);
        driver.findElement(By.id("btn_next")).click();
        
        for(int i=0; i<50; i++) {
        driver.findElement(By.xpath("//div[text()='Dashboard']")).click();
        driver.findElement(By.xpath("//*[@id=\"main_body\"]/div/div/div/div[1]/a/div/div/div/div[1]/p")).click();
        driver.findElement(By.xpath("//div[text()='Dashboard']")).click();
        driver.findElement(By.xpath("//*[@id=\"main_body\"]/div/div/div/div[2]/a/div/div/div/div[1]/p")).click();
        driver.findElement(By.xpath("//div[text()='Dashboard']")).click();

        driver.findElement(By.xpath("//*[@id=\"main_body\"]/div/div/div/div[3]/a/div/div/div/div[1]/p")).click();
        driver.findElement(By.xpath("//div[text()='Dashboard']")).click();

        driver.findElement(By.xpath("//*[@id=\"main_body\"]/div/div/div/div[4]/a/div/div/div/div[1]/p")).click();
        driver.findElement(By.xpath("//div[text()='Dashboard']")).click();

        driver.findElement(By.xpath("//*[@id=\"main_body\"]/div/div/div/div[5]/a/div/div/div/div[1]/p")).click();
        driver.findElement(By.xpath("//div[text()='Dashboard']")).click();

       
        }
	}
	
}
