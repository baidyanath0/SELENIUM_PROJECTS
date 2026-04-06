package madhyama;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_student_R {

	public static void main(String[] args) throws AWTException, InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jacmadhyama.cludocloud.com/");
//     	driver.findElement(By.xpath("(//a[text()='Registration'])[1] ")).click();
//     	Set<String> windowHandles2 = driver.getWindowHandles();
//     	driver.findElement(By.xpath("(//a[text()='Registration'])[1]")).click();
//     	ArrayList<String>a1=new ArrayList<String>(windowHandles2);
//     	String Child_window = a1.get(2);
//     	driver.switchTo().window(Child_window);
//     	Thread.sleep(2000);
//     	driver.findElement(By.xpath("//input[@name='txt_userID']")).sendKeys("11001");
//      driver.findElement(By.id("txt_pwd")).sendKeys("sddfed");
//      driver.findElement(By.id("loginbtn")).click();

     // Get the initial window handle (parent window)
        String parentWindowHandle = driver.getWindowHandle();

        // Click on the 'Registration' link
        driver.findElement(By.xpath("(//a[text()='Registration'])[1]")).click();

        // Wait for the new tab to open and handle the initial window that opens and closes
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(parentWindowHandle)) {
                // Switch to the new window that is opened
                driver.switchTo().window(handle);

                // Try to find the element in this window and if found, it means this is the pop-up window
                try {
                    WebElement userIDField = driver.findElement(By.name("txt_userID"));
                    if (userIDField.isDisplayed()) {
                        // If the element is found, then we are in the correct pop-up window
                        break; 
                    }
                } catch (Exception e) {
                    // If the element is not found, continue with the next window handle
                    continue; 
                }
            }
        }
        // Wait until the login elements are visible
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement userIDField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("txt_userID")));
     // Use JavascriptExecutor to set the user ID and password
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Passing the user ID and password via JavaScript
        js.executeScript("arguments[0].value='11001';", userIDField);
        js.executeScript("document.getElementById('txt_pwd').value='sddfed';");

        // Click the login button using JavaScriptExecutor
        WebElement loginButton = driver.findElement(By.id("loginbtn"));
        js.executeScript("arguments[0].click();", loginButton);

        // Additional actions after login can go here (if needed)
    driver.findElement(By.xpath(parentWindowHandle))
       
		
       
		
		
	}	
}

