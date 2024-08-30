package methods_of_Webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		Thread.sleep(2000);
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.youtube.com");
//		

//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.paribahan.com");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freejobalert.com");
		
		
	}

}
