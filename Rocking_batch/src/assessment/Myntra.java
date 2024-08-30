package assessment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
     
        driver.get("https://www.myntra.com/");
        Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("hrx shose"+Keys.ENTER);
        WebElement ele = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
        Thread.sleep(2000);
        
        Actions act=new Actions(driver);
        act.moveToElement(ele).build().perform();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@value='new']")).click();
        
        
        
        
	}
}
