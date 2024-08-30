package assessment;

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
        Thread.sleep(4000);
        
        //enter valid value from excel and login
        String un = Generic_ddt.read_ddt("Sheet1", 1,0);		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		String pwd = Generic_ddt.read_ddt("Sheet1", 1,1);		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//check logo is visible and verify home page
		boolean visible = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		if(visible) {
			driver.findElement(By.xpath("//span[text()='PIM']")).click();
		}
		else
		{
			System.out.println("Home page in not displayed");			
		}
		Thread.sleep(4000);
		
		//add employee
        driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstName")).sendKeys("Baidyanath");
        driver.findElement(By.name("middleName")).sendKeys("Das");
        driver.findElement(By.name("lastName")).sendKeys("Modak");
        driver.findElement(By.xpath("//label[.='Employee Id']/../../div[2]/input")).clear();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        
        //open the employee details and remove the currently added employee
        driver.findElement(By.xpath("//a[.='Employee List']")).click();
       
        JavascriptExecutor js=(JavascriptExecutor)driver;
       WebElement ele = driver.findElement(By.xpath("//div[text()='Baidyanath Das']"));
       js.executeScript("arguments[0].scrollIntoView();",ele);
        
        
        
        
        
     
        
        
      

        
        
        
        Thread.sleep(20000);
        driver.quit();
	}
	
        }
