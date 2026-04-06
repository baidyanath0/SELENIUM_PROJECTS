package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);

		 WebElement username=driver.findElement(By.name("email"));
		 username.sendKeys("6296233171");
		 
		 WebElement password=driver.findElement(By.id("pass"));
		 password.sendKeys("Anupam@123");
		 
		 WebElement login=driver.findElement(By.name("login"));
		 login.click();
	}

}
