package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
        driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
        driver.switchTo().frame(0);
        System.out.println("q");

        driver.findElement(By.xpath("//input[@name='username']")). click(); //sendKeys("Baidya@123");
        System.out.println("k");

	}
}
