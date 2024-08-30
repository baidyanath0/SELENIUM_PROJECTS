package scroll_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        WebElement ele = driver.findElement(By.xpath("//a[@href='https://amazon.jobs']"));
        Point loc = ele.getLocation();
        //System.out.println(loc.getY());
        int a = loc.getY();        
        Thread.sleep(2000);
       
        JavascriptExecutor j=(JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0," + a + ");");
        Thread.sleep(2000);
        
        
        

        //driver.quit();
	}
}
