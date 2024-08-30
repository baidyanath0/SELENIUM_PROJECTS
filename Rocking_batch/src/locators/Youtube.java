package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(1000);
		 WebElement search=driver.findElement(By.name("search_query"));
		 search.sendKeys("nil rong chilo bhishon priyo");
		 Thread.sleep(1000);
		 WebElement search_button=driver.findElement(By.id("search-icon-legacy"));
		 search_button.click();
		 Thread.sleep(1000);
		 WebElement play=driver.findElement(By.id("video-title"));
		 play.click();
	}

}
