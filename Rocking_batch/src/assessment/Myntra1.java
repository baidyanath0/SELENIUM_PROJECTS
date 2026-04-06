package assessment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Myntra1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hrx shoes",Keys.ENTER);
			
			Actions act = new Actions(driver);
			WebElement ele = driver.findElement(By.xpath("//span[text()='Recommended']"));
			act.moveToElement(ele).build().perform();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement ele2 = driver.findElement(By.xpath("//input[@value='new']"));
			js.executeScript("arguments[0].click();", ele2);
			driver.findElement(By.xpath("//div[@id='desktopSearchResults']/div[2]/section/ul/li[1]")).click();
			
			WebElement size = driver.findElement(By.xpath("//div[@class='size-buttons-size-header']/../div[2]/div/div/button/p[.='6']"));
				boolean enbl = size.isEnabled();
				if(enbl) {
					size.click();
				}
			}
		
			
//			driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
//			driver.findElement(By.xpath("//span[.='Bag']")).click();
//			driver.findElement(By.xpath("//button[.='REMOVE']")).click();
//			//driver.close();
		
		}

	

