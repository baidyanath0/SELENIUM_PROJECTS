package mbose_suplli;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Student_Registration {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mbose-compart-app.cludocloud.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("562");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Jup1ter14@");
//		Thread.sleep(50000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(4000);

		WebElement E = driver.findElement(By.xpath("//span[text()='Eligible Candidates']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", E);
		int y = 2;
		for (int i = 0; i <639; i++) {
			String roll = Roll_Generic.ddt("Sheet4", y, 1);
			driver.findElement(By.xpath("//input[@placeholder='Enter Roll No.']")).sendKeys(roll);
			driver.findElement(By.xpath("//button[@type='button']")).click();
//		Thread.sleep(2000);
			WebElement Submit = driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Submit);
			JavascriptExecutor execut = (JavascriptExecutor) driver;
//		Thread.sleep(2000);
			execut.executeScript("arguments[0].click();", Submit);
//		Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Yes, submit it!']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			y++;
		}

		WebElement Ele = driver.findElement(By.xpath("//span[text()='Challan Generation Pending']"));
		JavascriptExecutor executo = (JavascriptExecutor) driver;
		executo.executeScript("arguments[0].click();", Ele);
		driver.findElement(By.xpath("//button[text()=' Generate Challan']")).click();
		driver.findElement(By.xpath("//button[text()='Yes, Generate!']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();

		WebElement Generated = driver.findElement(By.xpath("//span[text()='Challan Generated']"));
		JavascriptExecutor execut = (JavascriptExecutor) driver;
		execut.executeScript("arguments[0].click();", Generated);

		WebElement upload = driver.findElement(By.xpath("(//a[text()=' Upload Details'])[1]"));
		JavascriptExecutor execu = (JavascriptExecutor) driver;
		execu.executeScript("arguments[0].click();", upload);
		Thread.sleep(2000);
		driver.findElement(By.name("utrNumber")).sendKeys("5484815656");
		
		Actions actions = new Actions(driver);
		WebElement calendarIcon = driver.findElement(By.name("paymentDate"));
		actions.moveToElement(calendarIcon).click().perform();
		
		driver.findElement(By.name("bankName")).sendKeys("Allahabad Central Bank");
		driver.findElement(By.name("document")).sendKeys("C:\\Users\\koushik das\\Downloads\\270320251753105331470.jpg");
		driver.findElement(By.xpath("//button[text()=' Submit']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();



	}
}
