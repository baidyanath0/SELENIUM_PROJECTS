package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification_by_TestNG {
	@Test
	public void a() {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String tittle = driver.getTitle();
		Assert.assertEquals(tittle, "OrangeHRM", "tittle verifying");  //here we use Hardassert to verify the critical defect
		System.out.println("Done");
		
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(tittle, "OrangeHRM", "tittle checking");         //here we use Softassert to verify the minor defect
		System.out.println("ok");
		s.assertAll();
		
		Assert.assertTrue(tittle.contains("OrangeHRM"));
		System.out.println("true");
		
		
		

	}
}
