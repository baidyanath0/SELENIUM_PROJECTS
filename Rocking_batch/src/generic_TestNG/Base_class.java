package generic_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import generic.Generic_ddt;

public class Base_class  implements Base_contants{
	public WebDriver driver;
	public String username;
	public String password;
	public String firstname;
	public String lastname;
	
	@BeforeClass
	public void fetch_data() {
		 username = Generic_ddt.read_ddt("Sheet1", 1,0);
		 password = Generic_ddt.read_ddt("Sheet1", 1,1);
		firstname = Generic_ddt.read_ddt("Sheet1", 1,2);
	    lastname = Generic_ddt.read_ddt("Sheet1", 1,4);
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
//		driver.close();
	}

}
