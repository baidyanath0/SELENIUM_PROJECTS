package mouse_acion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//performe mose honvering
		WebElement ele = driver.findElement(By.xpath("//section[.='Button']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		//perform drag and drop
		WebElement ele2 = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement target = driver.findElement(By.xpath("//div[.='Mobile Accessories']"));
		act.dragAndDrop(ele2, target).build().perform();
		
		//perform clik and hold action
		driver.navigate().to("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		WebElement ele3 = driver.findElement(By.id("circle"));
		act.clickAndHold(ele3).build().perform();
		driver.navigate().back();
	}
}
