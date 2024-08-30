package frame;

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
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("a1"));
        username.sendKeys("Baidyanath");
        driver.switchTo().frame(0);
        Thread.sleep(2000);

        driver.findElement(By.id("a2")).sendKeys("Abc@123");
        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        username.clear();
        
       
   
	}

}
