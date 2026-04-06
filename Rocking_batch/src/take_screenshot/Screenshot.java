package take_screenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			ts.getScreenshotAs(jpg.file);
	}

}
