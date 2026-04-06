package Blood_bank;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Vrification {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://10.100.10.10/login.aspx");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://10.100.10.10:8080/optima_hms/index.php/login");

		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("7980421041");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("asd-123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath(
				"//a[@href='http://10.100.10.10:8080/optima_hms/verification-stock-register' and @class='small-box-footer']"))
				.click();
		for (int i = 0; i < 20; i++) {
			driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-sm dropdown-toggle'])[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[@class='btn primary'])[1]")).click();
			Thread.sleep(4000);
			
       driver.findElement(By.xpath("(//span[.='*'])[1]/../../textarea")).sendKeys("OK");

		
			driver.findElement(By.xpath("(//button[@class='btn btn-success btn-sm'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='confirm']")).click();
			driver.findElement(By.xpath("//button[.='OK']")).click();

		}

	}
}
