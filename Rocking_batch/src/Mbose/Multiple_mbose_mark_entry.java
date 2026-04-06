package Mbose;



import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multiple_mbose_mark_entry {

    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://mbose.cludocloud.com/login.aspx");
        driver.findElement(By.id("txtusercode")).sendKeys("SGST0002");
        driver.findElement(By.id("txtpassword")).sendKeys("asd-123");
        Thread.sleep(4000);
        driver.findElement(By.id("btn_next")).click();

        // Open multiple tabs
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        for (int i = 0; i < 1; i++) {
            jsExecutor.executeScript("window.open('about:blank', '_blank');");
            Thread.sleep(1000);
        }
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        for (int i = 0; i < windowHandles.size(); i++) {
            driver.switchTo().window(windowHandles.get(i));
            
            driver.get("https://mbose.cludocloud.com/login.aspx");
            driver.findElement(By.id("txtusercode")).sendKeys("SGST0002");
            driver.findElement(By.id("txtpassword")).sendKeys("asd-123");
            Thread.sleep(4000);
            driver.findElement(By.id("btn_next")).click();

            for (int r = 0; r < 100; r++) {
                driver.findElement(By.xpath("//div[text()='Add Marks']")).click();
                driver.findElement(By.id("txt_centerCode")).sendKeys("422" + Keys.ENTER);
                Thread.sleep(1000);
                WebElement sub = driver.findElement(By.id("ContentPlaceHolder1_ddl_subject"));
                Select S = new Select(sub);
                S.selectByIndex(1);
                driver.findElement(By.id("ContentPlaceHolder1_btn_procede")).click();
                Thread.sleep(1000);
                WebElement rol = driver.findElement(By.id("ContentPlaceHolder1_ddl_rollNo"));
                Select S1 = new Select(rol);
                S1.selectByIndex(1);
                driver.findElement(By.id("ContentPlaceHolder1_lnkaddMarks")).click();
                Thread.sleep(1000);
                Alert a = driver.switchTo().alert();
                a.accept();
                Thread.sleep(2000);

                WebElement table = driver.findElement(By.id("tbl_marks"));
                for (int i2 = 0; i2 < 25; i2++) {
                    WebElement inputField = table.findElement(By.xpath("//tr[" + (i2 + 1) + "]/td[4]/input"));
                    if (inputField.isEnabled()) {
                        WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
                        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(inputField));
                        input.sendKeys("68");
                    } else {
                        break;
                    }
                }

                // for uncheck
                JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
                jsExecutor1.executeScript("window.scrollTo(0, 0);");
                for (int i2 = 0; i2 < 25; i2 += 3) {
                    WebElement inputField = table.findElement(By.xpath("//tr[" + (i2 + 1) + "]/td[2]/span/input"));
                    if (inputField.isSelected()) {
                        WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
                        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(inputField));
                        JavascriptExecutor js2 = (JavascriptExecutor) driver;
                        js2.executeScript("arguments[0].click();", input);
                    } else {
                        break;
                    }
                }

                // for selection dropdown
                jsExecutor1.executeScript("window.scrollTo(0, 0);");
                for (int i2 = 0; i2 < 25; i2 += 2) {
                    WebElement inputField = table.findElement(By.xpath("//tr[" + (i2 + 2) + "]/td[3]/select"));
                    if (inputField.isEnabled()) {
                        WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
                        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(inputField));
                        Select s3 = new Select(inputField);
                        s3.selectByVisibleText("Expelled");
                    } else {
                        break;
                    }
                }

                WebElement ele = driver.findElement(By.id("ContentPlaceHolder1_lnk_draft"));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", ele);
                Thread.sleep(2000);
                ele.click();
                Alert p = driver.switchTo().alert();
                p.accept();
                driver.findElement(By.xpath("//button[text()='OK']")).click();
            }
        }

        driver.quit();  // Close the browser after all tabs are done
    }
}

