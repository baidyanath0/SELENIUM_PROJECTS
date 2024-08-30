package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		Thread.sleep(2000);
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/koushik%20das/Desktop/project.html");
	 Thread.sleep(2000);
	 WebElement ele=driver.findElement(By.xpath("//input[@type='textfield']"));
	 ele.clear();
}
}