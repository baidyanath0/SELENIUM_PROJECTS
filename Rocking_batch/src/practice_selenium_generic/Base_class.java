package practice_selenium_generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import generic.Generic_ddt;

public class Base_class implements Base_contains {
	public WebDriver driver;
	public String username;
	public String password;
	
	@BeforeClass
	public void fetch_data() {
		 username = "Admin";
		 password = "admin123";
	}

	@BeforeMethod
	public void open_app()
	{
	//open the application
			System.setProperty(chrome_key, chrome_value);
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);	
			
    }
	
	@AfterMethod
	public void close_app() {
		driver.close();
	}

}



