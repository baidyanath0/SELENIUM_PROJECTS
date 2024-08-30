package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Promp_popups {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
        Thread.sleep(2000);
        driver.findElement(By.id("buttonAlert1")).click();
        Thread.sleep(2000);
        Alert a=driver.switchTo().alert();
        Thread.sleep(2000);
        a.sendKeys("yes");
        Thread.sleep(2000);
        a.accept();      
	}

}
