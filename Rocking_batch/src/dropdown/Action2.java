//write a script to select multiple option and delete multiple option.

package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Action2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.100.10.10:8080/p4_projects/secondary/landing-page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		WebElement add = driver.findElement(By.id("MODAK_ONLINE"));
//		Select s=new Select(add);
//		s.selectByValue("banana");

	}
}
