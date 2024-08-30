package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    Thread.sleep(2000);
	    driver.get("file:///C:/Users/koushik%20das/Desktop/project.html");
	    Thread.sleep(2000);
	    WebElement ele = driver.findElement(By.xpath("//input[@type='textfield']"));
	    ele.sendKeys(Keys.CONTROL+"a");
	    Thread.sleep(2000);
	    ele.sendKeys(Keys.DELETE);
	}
	}

