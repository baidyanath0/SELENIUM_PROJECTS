package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoshop1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        Thread.sleep(2000);
        
        WebElement apparel=driver.findElement(By.xpath("//a[@href='/apparel-shoes']"));
        apparel.click();
		Thread.sleep(2000);
		 
		 WebElement addcart=driver.findElement(By.xpath("//h2[@class='product-title']/a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']/../../div[3]/div[2]/input"));
		 addcart.click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@value='Add to cart'and@id='add-to-cart-button-5']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		 Thread.sleep(2000);
		 driver. findElement(By.xpath("//input[@name='removefromcart']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		 Thread.sleep(2000);
	}

}
