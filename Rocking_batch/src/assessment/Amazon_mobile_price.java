package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_mobile_price {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_myh38910a_e&adgrpid=155259813513&hvpone=&hvptwo=&hvadid=674893540019&hvpos=&hvnetw=g&hvrand=10839161942605365789&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007828&hvtargid=kwd-362216169274&hydadcr=5620_2359471&gad_source=1");
//	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("s20 fe 5g");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    String text=driver.findElement(By.xpath("//span[.='Samsung Galaxy S20 FE 5G (Cloud Navy, 8GB RAM, 128GB Storage) with No Cost EMI & Additional Exchange Offers']/../../../../div[3]/div/div[1]/div[1]/div/div/a/span/span[2]/span[2]")).getText();
//        String a=text.replace(",","");
	    System.out.println(text);
	    
}
}
