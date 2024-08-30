package methods_of_Webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_URL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		Thread.sleep(2000);
		
//		 WebDriver driver =new ChromeDriver();
//		 driver.get("https://retail.onlinesbi.sbi");
//		 String url=driver.getCurrentUrl();
//		 System.out.println(url);
		
//		WebDriver driver =new ChromeDriver();
//		 driver.get("https://www.paribahan.com");
//		 String url=driver.getCurrentUrl();
//		 System.out.println(url);
		
//		WebDriver driver =new ChromeDriver();
//		 driver.get("https://netflix.com");
//		 String url=driver.getCurrentUrl();
//		 System.out.println(url);
		
	
		WebDriver driver =new ChromeDriver();
		 driver.get("file:///C:/Users/koushik%20das/Desktop/ModakVanchures.html");
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 
	
	}

}
