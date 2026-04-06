package popup_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_popup
{
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[.='File Uploads']")).click();
	driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("C:\\Users\\koushik das\\Downloads\\download (2).jpeg");
			 
	driver.findElement(By.xpath("//a[.='Drag and Drop']")).click();
	
}

}
