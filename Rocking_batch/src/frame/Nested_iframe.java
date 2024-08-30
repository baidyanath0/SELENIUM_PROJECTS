package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
        WebElement un= driver.findElement(By.xpath("//div[@class='form_container'][1]/p[2]"));
        un.sendKeys(Keys.CONTROL+"ac");
        driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"v");
	}

}
