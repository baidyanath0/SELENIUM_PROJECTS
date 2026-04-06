package assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);

		
		WebElement apparel = driver.findElement(By.xpath("//a[@href='/apparel-shoes']"));
		apparel.click();
		

//		 WebElement addcart=driver.findElement(By.xpath("//h2[@class='product-title']/a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']/../../div[3]/div[2]/input"));
//		 addcart.click();
//		 Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[@class='product-title']/a[@href='/blue-jeans']/../../div[3]/div[2]/input"))
				.click();
	

		WebElement conf = driver.findElement(By.xpath("//div[@id='bar-notification']"));
		boolean dis = conf.isDisplayed();
		if (dis) {
			driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
			driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		} else {
			System.out.println("Defect");
		}

		// syso("hi");
	}
}