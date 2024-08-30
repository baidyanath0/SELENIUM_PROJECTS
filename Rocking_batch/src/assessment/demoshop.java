package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoshop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        Thread.sleep(2000);
        
        WebElement register=driver.findElement(By.xpath("//a[@href='/register']"));
		 register.click();
		 Thread.sleep(2000);
		 
		 WebElement gender=driver.findElement(By.xpath("//input[@id='gender-male']"));
		 gender.click();
		 Thread.sleep(2000);
		 
		 WebElement firstname=driver.findElement(By.xpath("//input[@class='text-box single-line' and @id='FirstName']"));
		 firstname.sendKeys("SARUKH");
		 Thread.sleep(2000);
		 
		 WebElement lastname=driver.findElement(By.xpath("//input[@class='text-box single-line' and @id='LastName']"));
		 lastname.sendKeys("KHAN");
		 Thread.sleep(2000);
		 
		 WebElement email=driver.findElement(By.xpath("//input[@class='text-box single-line' and @id='Email']"));
	     email.sendKeys("kp9@srk.com");
	     Thread.sleep(2000);
	     
	     WebElement pwd=driver.findElement(By.xpath("//input[@class='text-box single-line password']"));
		 pwd.sendKeys("ddlg#321");
		 Thread.sleep(2000);
		 
	     WebElement confrmpwd=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
	     confrmpwd.sendKeys("ddlg#321");
	     Thread.sleep(2000);
	     
	     WebElement reg=driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
		 reg.click();
		 Thread.sleep(2000);
		 WebElement logout=driver.findElement(By.xpath("//a[@href='/logout']"));
		 logout.click();
		 Thread.sleep(2000);
		 
		 WebElement login=driver.findElement(By.xpath("//a[@href='/login']"));
		 login.click();
		 Thread.sleep(2000);
		 
		 WebElement confrmpwd1=driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
	     confrmpwd1.sendKeys("kp9@srk.com");
	     Thread.sleep(2000);
	     
	     WebElement pwd1=driver.findElement(By.xpath("//input[@class='password']"));
		 pwd1.sendKeys("ddlg#321");
		 Thread.sleep(2000);
		 
		 WebElement login1=driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']"));
		 login1.click();
		 	 
	}

}
