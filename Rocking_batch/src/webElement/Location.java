package webElement;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		Thread.sleep(2000);
	 WebDriver driver =new ChromeDriver();
	 driver.get("file:///C:/Users/koushik%20das/Desktop/project.html");
	  WebElement ele= driver.findElement(By.xpath("//input[@type='checkbox']"));
	    Point
	    loc = ele.getLocation();
	    System.out.println(loc);
	    System.out.println(loc.getX());
	    System.out.println(loc.getY());
}
}
