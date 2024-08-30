package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hindi book"+Keys.ENTER);
        Thread.sleep(2000);
        
        List<WebElement> all_price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));     
        for(WebElement Amount:all_price)
        {
        	String amount=Amount.getText();
        	System.out.println(amount);
        }
        

}
}
