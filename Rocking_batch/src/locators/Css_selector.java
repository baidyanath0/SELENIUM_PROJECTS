package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
           ChromeDriver driver=new ChromeDriver();
           driver.get("https://www.facebook.com");
           Thread.sleep(2000);
  		 WebElement username=driver.findElement(By.cssSelector("input[id='email']"));
  		 username.sendKeys("6296233171");
  		 Thread.sleep(2000);
  		 WebElement password=driver.findElement(By.cssSelector("input[id='pass']"));
  		 password.sendKeys("abc@123");
  		 Thread.sleep(2000);
  		 WebElement login=driver.findElement(By.cssSelector("button[type='submit']"));
  		 login.click();
	}

}
