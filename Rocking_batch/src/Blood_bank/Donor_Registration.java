package Blood_bank;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import NMMSS_Cludo.IGNTR_Generic;

public class Donor_Registration {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//		int a=1;
//		for (int i = 0; i < 10; i++) {
		driver.get("https://optima-cnci-test.cludocloud.com/login.aspx");
//		driver.get("http://103.119.241.162:84/hms/donar-registration.aspx");
//		driver.findElement(By.id("details-button")).click();
//		driver.findElement(By.id("proceed-link")).click();
		
		//login
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("8420000394");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("asd-123");        //R@hul2022#$%
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    
//		
//		//generic calling
//		String name = Donor_generic.ddt("Sheet1", 1, a);
//		System.out.println(name);
	    int x =581188;
        int y=2;
	    for (int r = 0; r <20;r++) {  
	    //open registration page
	    driver.findElement(By.xpath("//span[.='Blood Collection & Stock']")).click();
	   // driver.findElement(By.xpath("//a[@href='donar-registration.aspx']")).click();
	    WebElement disabledElement = driver.findElement(By.xpath("//a[@href='donar-registration.aspx']"));

        // Use JavaScript to enable the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('disabled')", disabledElement);
        // Click the element after it has been enabled
        disabledElement.click();
        
	    //select solutation
	    driver.findElement(By.xpath("//span[@id='select2-ddl_salutation-container']")).click();
	    //for (int r = 0; r < 30; r++) {
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Mr.");
	    Robot rb= new Robot();
	    rb.keyPress(KeyEvent.VK_ENTER);
	    //enter donor name
	    String name = IGNTR_Generic.read_ddt("Sheet1", y, 0);
	    driver.findElement(By.xpath("//input[@placeholder='Donor name']")).sendKeys(name);
	    
	    driver.findElement(By.xpath("//span[@id='select2-ddlmaritalstatus-container']")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("SINGLE");
	    Robot rb2= new Robot();
	    rb2.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//span[@id='select2-ddldonation-container']")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("VOLUNTARY");
	    Robot rb3= new Robot();
	    rb3.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//span[@id='select2-ddldonar_blood-container']")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("B-");
	    Robot rb4= new Robot();
	    rb4.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys("8965"+x);
	    
	    driver.findElement(By.xpath("//input[@id='txtDob']")).click();
	    driver.findElement(By.xpath("//a[.='3']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[@id='select2-ddl_gender-container']")).click(); 
		String gender = IGNTR_Generic.read_ddt("Sheet1", y, 3);
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(gender);
	    Robot rb5= new Robot();
	    rb5.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//input[@class='form-control input-sm' and @id='txt_PersntAddress']")).sendKeys("Sundarban");
	    driver.findElement(By.xpath("//input[@id='txt_PersntCityDistrict']")).sendKeys("North 24 Pargana");
	    
	    driver.findElement(By.xpath("//span[@id='select2-ddl_persntCountry-container']")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("INDIA");
	    Robot rb6= new Robot();
	    rb6.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//span[@id='select2-ddl_PersntState-container']")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("WEST BENGAL");
	    Robot rb7= new Robot();
	    rb7.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("(//input[@placeholder='Zip Code'])[1]")).sendKeys("722151");
	    driver.findElement(By.xpath("//input[@id='chksameaddress']")).click();
	    
	    driver.findElement(By.xpath("//a[@id='btnsave']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[.='OK']")).click();
	    driver.findElement(By.xpath("//a[@class='sidebar-toggle']")).click();

	    //driver.close();
	    //a++;
	    x++;
        y++;
	    }
		 
	    //driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
	    driver.close();
	}}
	
        //driver.findElement(By.xpath("//a[@class='sidebar-toggle']")).click();
        
        
        
        
//	    Alert a=driver.switchTo().alert();
//	    a.accept();
//        
//		
	
	   

	   

