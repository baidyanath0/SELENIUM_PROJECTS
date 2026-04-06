package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/koushik%20das/Desktop/Findelements.html");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
        List<WebElement>all_link=driver.findElements(By.tagName("a"));
        int size=all_link.size();
        System.out.println(size);
}
}