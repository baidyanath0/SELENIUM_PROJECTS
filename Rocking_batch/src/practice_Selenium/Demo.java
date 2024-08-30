package practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/koushik%20das/Desktop/project.html");
		
//		WebElement ele= driver.findElement(By.xpath("//input[@type='textfield']"));
//		String art= ele.getAttribute("value");
//		System.out.println(art);
	

	}

}
