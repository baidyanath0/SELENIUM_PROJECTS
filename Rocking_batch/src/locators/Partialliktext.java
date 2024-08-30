package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partialliktext {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
         ChromeDriver driver=new ChromeDriver();
         driver.get("file:///C:/Users/koushik%20das/Desktop/linktext.html");
         driver.findElement(By.partialLinkText("FACEBOOK")).click();
	}

}
