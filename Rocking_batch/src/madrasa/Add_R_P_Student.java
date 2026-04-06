package madrasa;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_R_P_Student {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jacmadrasa.cludocloud.com/PopupInfo");
//        String parentWindowHandle = driver.getWindowHandle();
//        driver.findElement(By.xpath("(//a[text()='Registration'])[1]")).click();
		driver.findElement(By.name("txt_userID")).sendKeys("21001");
//		
       
//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String handle : windowHandles) {
//            if (!handle.equals(parentWindowHandle)) {
//                // Switch to the new window that is opened
//                driver.switchTo().window(handle);
//                String currentUrl = driver.getCurrentUrl();
//                System.out.println(currentUrl);
//                // Try to find the element in this window and if found, it means this is the pop-up window
//                try {     
//                    WebElement userIDField = driver.findElement(By.name("txt_userID"));
//                    if (userIDField.isDisplayed()) {
//                    	userIDField.sendKeys("11001");
//                    	System.out.println("hii");
//                        // If the element is found, then we are in the correct pop-up window
//                        break;
//                    }
//                } catch (Exception e) {
//                    // If the element is not found, continue with the next window handle
//                    continue;
//                }
//            }
//        }
//        // Wait until the login elements are visible
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        WebElement userIDField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("txt_userID")));
//     // Use JavascriptExecutor to set the user ID and password
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        
//        // Passing the user ID and password via JavaScript
//        js.executeScript("arguments[0].value='11001';", userIDField);
//        js.executeScript("document.getElementById('txt_pwd').value='sddfed';");
//        WebElement loginButton = driver.findElement(By.id("loginbtn"));
//        js.executeScript("arguments[0].click();", loginButton);

      
    

       
		
       
		
		
	}	
}
