package assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoshop1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
        
        WebElement apparel=driver.findElement(By.xpath("//a[@href='/apparel-shoes']"));
        apparel.click();
		 
		 WebElement addcart=driver.findElement(By.xpath("//h2[@class='product-title']/a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']/../../div[3]/div[2]/input"));
		 addcart.click();
		 
		 driver.findElement(By.xpath("//input[@value='Add to cart'and@id='add-to-cart-button-5']")).click();
		 driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		 driver. findElement(By.xpath("//input[@name='removefromcart']")).click();
		 driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	}

}
