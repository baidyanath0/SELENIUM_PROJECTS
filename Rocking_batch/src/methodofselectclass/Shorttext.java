package methodofselectclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shorttext {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
     ChromeDriver driver= new ChromeDriver();
     Thread.sleep(2000);

     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);

     driver.findElement(By.xpath("//a[.='Create new account']")).click();
     Thread.sleep(2000);
     WebElement dp=driver.findElement(By.id("month"));
     Thread.sleep(2000);

     Select s= new Select(dp);
     List<WebElement> all_opt= s.getOptions();
     ArrayList<String> l= new ArrayList<>();
     for(WebElement opt: all_opt)
     {
    	 String text=opt.getText();
    	 l.add(text);  	
     }
     Collections.sort(l);
     for (String l1  : l) {
		System.out.println(l1);
	}
	}

}
