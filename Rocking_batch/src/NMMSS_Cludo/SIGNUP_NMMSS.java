package NMMSS_Cludo;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SIGNUP_NMMSS {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    int a = 8981;
	    for (int i = 0; i <3; i++) {
	    driver.get("http://10.100.10.10:8080/nmms_uat/merit_portal/registration");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Phone Number']")).sendKeys("9658354600");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']")).sendKeys("test@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Your Aadhaar Number']")).sendKeys("76541252" + a );
//	    Thread.sleep(9000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter alphanumeric password (min 6 chars)']")).sendKeys("asd-123");
	    driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("asd-123");
	    driver.findElement(By.xpath("//button[.='Register']")).click();
	    driver.findElement(By.xpath("//input[@name='n1']")).sendKeys("1");
	    driver.findElement(By.xpath("//input[@name='n2']")).sendKeys("2");
	    driver.findElement(By.xpath("//input[@name='n3']")).sendKeys("3");
	    driver.findElement(By.xpath("//input[@name='n4']")).sendKeys("4");
	    driver.findElement(By.xpath("//input[@name='n5']")).sendKeys("5");
	    driver.findElement(By.xpath("//input[@name='n6']")).sendKeys("6");
	    driver.findElement(By.xpath("//button[.='Verify OTP']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[.='OK']")).click();
	 // Step 2: Use JavascriptExecutor to open a new tab
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.open('https://www.google.com', '_blank');");

        // Step 3: Get the list of all opened tabs
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // Step 4: Switch to the new tab (second tab in the list)
        driver.switchTo().window(tabs.get(1));

        // Optionally, perform any actions on the new tab
        System.out.println("Title of the new tab: " + driver.getTitle());

        // Step 5: Close the old tab (the first tab in the list)
        driver.switchTo().window(tabs.get(0));  // Switch back to the first tab
        driver.close(); // Close the old tab

        // Step 6: Switch to the new tab (the second tab, where we are already)
        driver.switchTo().window(tabs.get(1));
        a++;
        //driver.quit();
//	    Thread.sleep(2000);	
}
	   }
	
	}
