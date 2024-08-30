package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindActiveElement;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Myantra_shoes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAjwqre1BhAqEiwA7g9QhtOyb711SnibocqGkJu05dw1YjiKJn4J1diuUVo65_M09JGOAeYx6xoCV1kQAvD_BwE");
//	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Hrx Shoes");
	    driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	    String text=driver.findElement(By.xpath("//a[@href='sports-shoes/hrx+by+hrithik+roshan/hrx-by-hrithik-roshan-women-white--pink-lace-up-running-shoes/23976344/buy' and @target='_blank']/div[2]/div[1]/span/span[@class='product-discountedPrice']")).getText();
	    String y=text.replace("Rs.","");
	    System.out.println(y);
	}

}
// here we fetch the price of hrx shoes in amazon