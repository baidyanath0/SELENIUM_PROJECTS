package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/koushik%20das/Desktop/Findelements.html");
        Thread.sleep(2000);
        List<WebElement>all_link=driver.findElements(By.tagName("a"));
        int size=all_link.size();
        System.out.println(size);
        for(WebElement link:all_link)
        {
        	String url=link.getAttribute("href");
        	System.out.println(url);
        }
        
        
//        for(int i=0; i<=size-1;i++)
//        {
//        	WebElement link= all_link.get(i);
//        	String url=link.getAttribute("href");
//        	System.out.println(url);
//        }
	}	
}
