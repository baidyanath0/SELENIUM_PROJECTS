package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		Thread.sleep(2000);
	 WebDriver driver =new ChromeDriver();
	 driver.get("file:///C:/Users/koushik%20das/Desktop/project.html");
	  WebElement ele= driver.findElement(By.xpath("//input[@type='checkbox']"));
	  boolean slc =ele.isSelected();
	  if(slc) {
		  System.out.println("element is selected");
	  }
	  else
	  {
		  System.out.println("element is not selected");
		  ele.click();
	  }
}
}
