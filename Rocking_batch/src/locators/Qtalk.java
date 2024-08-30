package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qtalk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://chat.qspiders.com/auth/login");
		Thread.sleep(1000);
		 WebElement username=driver.findElement(By.name("username"));
		 username.sendKeys("7362984146");
		 Thread.sleep(1000);
		 WebElement password=driver.findElement(By.name("password"));
		 password.sendKeys("Badu#321");
		 Thread.sleep(1000);
		 WebElement login=driver.findElement(By.className("rs-ripple-pond"));
		 login.click();
	}

}
