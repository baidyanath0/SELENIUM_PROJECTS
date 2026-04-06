package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Kolkata");
		driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[2]")).sendKeys("Chikmagalur, Karnataka");
		driver.findElement(By.xpath("//span[text()='Karnataka']")).click();
}
}

//here we SEARCH LOCATION IN GOOGKLE MAP KOLKATA TO KARNATAK. HERE I USE (GROUP BY INDEX)
