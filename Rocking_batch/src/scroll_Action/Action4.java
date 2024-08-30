package scroll_Action;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Action4 {
    public static void main(String[] args) {
        // Set up ChromeDriver
        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("https://www.amazon.in/");

            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement ele = null;
            boolean elementFound = false;

            // Attempt to find the element and take action
            for (int i = 0; i < 3; i++) { // Retry up to 3 times
                try {
                    ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[.='Amazon Fresh | Great prices | Fruits & vegetables']")));
                    elementFound = true;
                    break; // Exit the loop if the element is found
                } catch (Exception e) {
                    // Element not found, refresh the page and retry
                    driver.navigate().refresh();
                    Thread.sleep(2000); // Wait for the page to reload
                }
            }

            if (elementFound) {
                // Scroll to the element and take a screenshot
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", ele);
                takeScreenshot(driver, "element_found.png");
                System.out.println("Element found and screenshot taken.");
            } else {
                System.out.println("Element not found after multiple attempts.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up and close the browser
            driver.quit();
        }
    }

    // Method to take a screenshot
    private static void takeScreenshot(WebDriver driver, String fileName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File destination = new File("./screenshots/" + fileName);
            Files.copy(source, destination);
            System.out.println("Screenshot saved as: " + destination.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
