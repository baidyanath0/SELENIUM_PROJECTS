package scroll_Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        for(int i=0; i<=6; i++)
        {
        	if(i%2==0)
        	{
        	js.executeScript("window.scrollBy(0,500)");
            }
        	else
        	{
            js.executeScript("window.scrollBy(0,-500)");
			}
            Thread.sleep(2000);
            driver.quit();
        }
	}
	
}
