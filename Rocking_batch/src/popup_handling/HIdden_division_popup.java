package popup_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HIdden_division_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[.='Hidden division']")).click();
		driver.findElement(By.xpath("//input[@class='w-full h-10 px-4 m-2 border-2 border-stone-600 rounded-md']")).sendKeys("Baidya");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bsjh@gmail.com");
		
		WebElement dp=driver.findElement(By.xpath("//select[@class='w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md']"));
        Select s= new Select(dp);
        s.selectByVisibleText("Laptop");
        driver.findElement(By.xpath("//textarea[@class='w-[97%] m-2 h-16 px-4 py-2 border-2 border-stone-600 rounded-md']")).sendKeys("Hii Sir");
        driver.findElement(By.xpath("//button[@type='submit']")).click();	
        }

}
