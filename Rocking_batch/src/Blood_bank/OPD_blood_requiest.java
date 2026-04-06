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

public class OPD_blood_requiest {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://optima-cnci-test.cludocloud.com/login.aspx");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		driver.findElement(By.id("details-button")).click();
//		driver.findElement(By.id("proceed-link")).click();

		// login
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("8420000394");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("asd-123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 for(int i=0; i<10; i++) {
		driver.findElement(By.xpath("//span[.='Blood Bank']")).click();
		WebElement disabledElement = driver.findElement(By.xpath("//a[@href='blood-and-blood-components-request.aspx']"));

        // Use JavaScript to enable the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('disabled')", disabledElement);

        // Click the element after it has been enabled
        disabledElement.click();
        
//        for(int i=0; i<10; i++) {
        driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]")).click();
        driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Mr.");
	    Robot rb= new Robot();
	    rb.keyPress(KeyEvent.VK_ENTER);   
	    
	    driver.findElement(By.id("txt_PtName")).sendKeys("Rajat Dutta");
	    driver.findElement(By.id("txt_UHID")).sendKeys("NS88J");
	    
	    driver.findElement(By.xpath("//span[@id='select2-ddl_gender-container']")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("MALE");
	    Robot rb5= new Robot();
	    rb5.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//input[@id='txtDob']")).click();
	    driver.findElement(By.xpath("//a[.='3']")).click();
	    
	    driver.findElement(By.xpath("//span[@id='select2-ddlbloodgrp-container']")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("UNKNOWN");
	    Robot rb4= new Robot();
	    rb4.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//input[@placeholder='Contact No.']")).sendKeys("9657826547");
	    
	    driver.findElement(By.xpath("//span[@id='select2-ddl_fibrinogen-container']")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Factor VIII");
	    Robot rb51= new Robot();
	    rb51.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.id("txt_Diagnosis")).sendKeys("20");
	    driver.findElement(By.id("txt_hb")).sendKeys("20");
	    driver.findElement(By.id("txt_platelet")).sendKeys("40");
	    driver.findElement(By.id("txt_wbc")).sendKeys("40");
	    driver.findElement(By.id("txt_pcv")).sendKeys("20");
	    
	    driver.findElement(By.id("rbTherapeutic")).click();
	    driver.findElement(By.id("rbInr")).click();
	    driver.findElement(By.id("rbnoTransfusion")).click();
	    driver.findElement(By.id("rbnoPreviousTrans")).click();
	    
	    driver.findElement(By.id("txt_hospitalname")).sendKeys("RG Kar");
	    driver.findElement(By.id("txt_doctorname")).sendKeys("MD Hasim");
	   // driver.findElement(By.id("txtsampleId")).sendKeys("NS322");
	    
	    driver.findElement(By.xpath("(//input[@id='chkcompo'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@id='txtcompo'])[1]")).sendKeys("1");
	    
	    driver.findElement(By.xpath("(//input[@id='chkcompo'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@id='txtcompo'])[2]")).sendKeys("1");
//
//	    driver.findElement(By.xpath("(//input[@id='chkcompo'])[3]")).click();
//	    driver.findElement(By.xpath("(//input[@id='txtcompo'])[3]")).sendKeys("1");
//
//	    driver.findElement(By.xpath("(//input[@id='chkcompo'])[4]")).click();
//	    driver.findElement(By.xpath("(//input[@id='txtcompo'])[4]")).sendKeys("1");
//
//	    driver.findElement(By.xpath("(//input[@id='chkcompo'])[5]")).click();
//	    driver.findElement(By.xpath("(//input[@id='txtcompo'])[5]")).sendKeys("1");
//
	    driver.findElement(By.xpath("(//input[@id='chkcompo'])[6]")).click();
	    driver.findElement(By.xpath("(//input[@id='txtcompo'])[6]")).sendKeys("2");
//
//	    driver.findElement(By.xpath("(//input[@id='chkcompo'])[7]")).click();
//	    driver.findElement(By.xpath("(//input[@id='txtcompo'])[7]")).sendKeys("1");
//
//	    driver.findElement(By.xpath("(//input[@id='chkcompo'])[8]")).click();
//	    driver.findElement(By.xpath("(//input[@id='txtcompo'])[8]")).sendKeys("1");

	    driver.findElement(By.xpath("//span[@id='select2-ddl_sal_relative-container']")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Mr.");
	    Robot rb52= new Robot();
	    rb52.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.id("txt_realtivename")).sendKeys("Bimal Pal");
	    
	    driver.findElement(By.xpath("//span[@id='select2-ddl_relation-container']")).click();
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Friend");
	    Robot rb53= new Robot();
	    rb53.keyPress(KeyEvent.VK_ENTER);

	    driver.findElement(By.id("txt_relativeContact")).sendKeys("8659754632");
	    driver.findElement(By.id("btnsave")).click();
	    
	    driver.findElement(By.xpath("//button[.='OK']")).click();

        }
        driver.quit();
}}
