package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_on_link {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
    driver.get("file:///C:/Users/koushik%20das/Desktop/htmlpage.html");
     WebElement link=driver.findElement(By.name("n2"));
     Thread.sleep(2000);
     link.click();  
	}

}
