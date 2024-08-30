package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplay {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		Thread.sleep(2000);
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	  WebElement ele= driver.findElement(By.xpath("//input[@id='email']"));
	  boolean dis= ele.isDisplayed();
	  if(dis)
	  {
		  System.out.println("element is displayed");
		  ele.sendKeys("abc@gmail.com");
	  }
	  else
	  {
		  System.out.println("element is not displayed");
	  }
	 
}
}