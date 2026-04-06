package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/koushik%20das/Desktop/frame/mainpage.html");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
        
        WebElement username = driver.findElement(By.id("a1"));
        username.sendKeys("Baidyanath");
        driver.switchTo().frame(0);

        driver.findElement(By.id("a2")).sendKeys("Abc@123");
        driver.switchTo().defaultContent();

        username.clear();
        
       
   
	}

}
