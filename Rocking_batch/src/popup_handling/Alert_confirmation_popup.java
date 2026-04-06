package popup_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_confirmation_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//get the popup text and priint n console and accept the popup 
		driver.findElement(By.id("buttonAlert2")).click();
		Alert a=driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		
		//not accept the popup
		driver.findElement(By.xpath("//a[.='Confirm']")).click();
		driver.findElement(By.xpath("//button[.='Confirm Box']")).click();
		Alert a1=driver.switchTo().alert();
		a1.dismiss();
		
		//pass value in popup
		driver.findElement(By.xpath("//a[.='Prompt']")).click();
		driver.findElement(By.xpath("//button[.='Prompt Alert Box']")).click();
		Alert a2=driver.switchTo().alert();
		a2.sendKeys("yes");
		a2.accept();
		
	}

}
