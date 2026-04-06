package practice_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Load2 {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			
	        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");      // username and password value inherit from base class
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	        driver.findElement(By.xpath("//button[.=' Login ']")).click();
	        driver.findElement(By.xpath("//span[.='Recruitment']")).click();
	        WebElement Add=driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
	       if(Add.isDisplayed()) {
	        // Number of times to run the Fillup process
	        int numIterations = 5;

	        for (int i = 0; i < numIterations; i++) {
	            driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
	            driver.findElement(By.name("firstName")).sendKeys("Rahul");
	            driver.findElement(By.name("middleName")).sendKeys("Kumar");
	            driver.findElement(By.name("lastName")).sendKeys("Das");
	            driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active' and @placeholder='Type here'])[1]")).sendKeys("asd@gmail.com");
	            //driver.findElement(By.xpath("//div[@class='oxd-file-button']")).sendKeys("C:\\Users\\koushik das\\Downloads\\blank.pdf");
//	            JavascriptExecutor js=(JavascriptExecutor)driver;
//	            js.executeScript("window.scrollBy(0,200)");
	           driver.findElement(By.xpath("//button[@type='submit']")).click();
	           driver.findElement(By.xpath("//a[.='Candidates']")).click();		
	            System.out.println("hii");


	            // Optional: Add a delay between iterations if needed
	            try {
	                Thread.sleep(2000); // Sleep for 2 seconds (adjust as needed)
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        driver.quit();
	    }
	}
}
