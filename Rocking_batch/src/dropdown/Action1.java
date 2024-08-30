
//Write a script to select the value from the single select dropdown ?

package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
        Thread.sleep(4000);
        
        driver.findElement(By.id("phone")).sendKeys("7362987360");
        Thread.sleep(2000);
        
        WebElement dp = driver.findElement(By.xpath("//select[@id=\"select2\"]"));
        Select s=new Select(dp);
        s.selectByVisibleText("Male");
        Thread.sleep(2000);
        
        WebElement country = driver.findElement(By.id("select3"));
        Select s2=new Select(country);
        s2.selectByIndex(7);
        Thread.sleep(2000);
        
        WebElement state = driver.findElement(By.id("select5"));
        Select s3=new Select(state);
        s3.selectByValue("West Bengal");
        Thread.sleep(2000);
        
        WebElement dist = driver.findElement(By.xpath("//label[.='City']/../select"));
        Select s4=new Select(dist);
        s4.selectByValue("Bankura");
        Thread.sleep(2000);
        
        WebElement quantity = driver.findElement(By.id("select7"));
        Select s5=new Select(quantity);
        s5.selectByIndex(3);
        Thread.sleep(2000);
        
        driver.findElement(By.id("continuebtn")).click();
        
	}

}
