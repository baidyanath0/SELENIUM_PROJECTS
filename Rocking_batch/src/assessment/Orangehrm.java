package assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Generic_ddt;

public class Orangehrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        //open the login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
        
        //enter valid value from excel and login
        String un = Generic_ddt.read_ddt("Sheet1", 1,0);		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		String pwd = Generic_ddt.read_ddt("Sheet1", 1,1);		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 System.out.println("hii"); 
		//check logo is visible and verify home page
		boolean visible = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		if(visible) {
			driver.findElement(By.xpath("//span[text()='PIM']")).click();
		}
		else
		{
			System.out.println("Home page in not displayed");			
		}
		
		//add employee
        driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
        String fn = Generic_ddt.read_ddt("Sheet1", 1,2);
        driver.findElement(By.name("firstName")).sendKeys(fn);
        String mn = Generic_ddt.read_ddt("Sheet1", 1,3);
        driver.findElement(By.name("middleName")).sendKeys(mn);
        String ln = Generic_ddt.read_ddt("Sheet1", 1,4);
        driver.findElement(By.name("lastName")).sendKeys(ln);
        driver.findElement(By.xpath("//label[.='Employee Id']/../../div[2]/input")).clear();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       
        //open the employee details and remove the currently added employee
        driver.findElement(By.xpath("//a[.='Employee List']")).click();
       
        JavascriptExecutor js=(JavascriptExecutor)driver;
       WebElement ele = driver.findElement(By.xpath("//div[text()='Baidyanath Das']"));
       js.executeScript("arguments[0].scrollIntoView();",ele);
     
        
        
        

	}
	
        }
