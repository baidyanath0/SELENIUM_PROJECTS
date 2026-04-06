package Mbose;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IA {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jac-ia-eleven.cludocloud.com/login");
		driver.findElement(By.id("txt_userID")).sendKeys("11050");
		driver.findElement(By.id("txt_pwd")).sendKeys("N7XYfZj9dj");
		Thread.sleep(4000);
		driver.findElement(By.id("btnSubmit")).click();

		driver.findElement(By.xpath("//input[@name='validationCustom01']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='validationCustom02']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='validationCustom03']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@name='validationCustom04']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='validationCustom05']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@name='validationCustom06']")).sendKeys("6");
		driver.findElement(By.id("lnk_smsVerify")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("ContentPlaceHolder1_header_incomplete")).click();
		Thread.sleep(3000);
//		driver.findElement(By.id("ContentPlaceHolder1_lst_cardBlock_btn_card_block_0")).click();
		
//		List<WebElement> foil =findElements(By.xpath("(//input[@type='submit'])"));
//		for (int r = 1; r < foil.size(); r++) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement table = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='studentTable1']")));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int[] inputColumns = { 4, 6, 8, 10, 12 };
		for (int i = 1; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for (int colIndex : inputColumns) {
				if (colIndex < cells.size()) {
					WebElement cell = cells.get(colIndex);
					try {
						List<WebElement> inputFields = cell.findElements(By.tagName("input"));
						if (inputFields.size() > 0) {
							WebElement inputField = inputFields.get(0);
							if (inputField.isEnabled()) {
								WebDriverWait inputFieldWait = new WebDriverWait(driver, 10);
								inputFieldWait.until(ExpectedConditions.elementToBeClickable(inputField));
								JavascriptExecutor js = (JavascriptExecutor) driver;
								js.executeScript("arguments[0].scrollIntoView(true);", inputField);
								inputField.clear();
								inputField.sendKeys("10");
							}
							
						}
						
					} catch (Exception e) {
						System.out.println("Error interacting with cell in row " + i + ", column " + colIndex + ": "
								+ e.getMessage());
					}
				}
			}
			
		}

	}

	private static List<WebElement> findElements(By tagName) {
		// TODO Auto-generated method stub
		return null;
	}
}
