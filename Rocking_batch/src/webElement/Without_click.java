package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_click {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    Thread.sleep(2000);
    driver.get("https://www.facebook.com");
    Thread.sleep(2000);
    WebElement box = driver.findElement(By.xpath("//button[@type='submit']"));
    box.sendKeys(Keys.ENTER);   
}
}
