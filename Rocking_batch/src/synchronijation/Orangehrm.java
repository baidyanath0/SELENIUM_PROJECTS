package synchronijation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Generic_ddt;

public class Orangehrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1721393199309']")));

		String username = Generic_ddt.read_ddt("Sheet1", 1, 0);
		String password = Generic_ddt.read_ddt("Sheet1", 1, 1);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();

		WebElement ele = driver.findElement(By.className("oxd-brand-banner"));
		if (ele.isDisplayed()) {
			driver.findElement(By.xpath("//span[.='Leave']")).click();
		}
			driver.findElement(By.xpath("//a[.='Apply']")).click();
			WebElement ele2 = driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']"));
			System.out.println("hii");
		    Select s=new Select(ele2);
		    s.selectByVisibleText("CAN - FMLA");
		

	}
}
