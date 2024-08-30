package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		Thread.sleep(2000);
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	  WebElement ele= driver.findElement(By.xpath("//input[@id='email']"));
	  boolean anb = ele.isEnabled();
	  if(anb)
	  {
		  System.out.println("element is enable");
		  ele.sendKeys("anjnjsnd@nvdnj.cnd");
	  }
	  else
	  {
		  System.out.println("element is  not enable");
	  }
}
	}
