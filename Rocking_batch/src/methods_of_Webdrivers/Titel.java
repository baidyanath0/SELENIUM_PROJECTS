package methods_of_Webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titel {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		Thread.sleep(2000);
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.youtube.com");
//		Thread.sleep(2000);
//		String title=driver.getTitle();
//		System.out.println(title);
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.paribahan.com");
//		Thread.sleep(2000);
//		String title=driver.getTitle();
//		System.out.println(title);
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/koushik%20das/Desktop/ModakVanchures.html");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
	}

}
