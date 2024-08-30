package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoshop2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[@href='/login']")).click();
		 
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("kp@srk.com");
	     
	    driver.findElement(By.xpath("//input[@class='password']")).sendKeys("ddlg#321");
		 
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
  
        driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		 Thread.sleep(2000);
		 WebElement text=driver.findElement(By.xpath("//div[@class='order-progress']/../div[2]/div[2]"));;
		 String s=text.getText();
         System.out.println(s);
        boolean b = text.isDisplayed();
         if(b)
         {
        	 driver.findElement(By.xpath("//a[text()='Log out']")).click();
         }
         else
         {
        	 System.out.println("Defect");
         }

}
}
