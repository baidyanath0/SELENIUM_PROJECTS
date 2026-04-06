package Blood_bank;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Counselling {
	public static void main(String[] args) throws AWTException, InterruptedException  {
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.navigate().to("https://10.100.10.10/login.aspx");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://optima-hms-doc.cludocloud.com/");
	
	        driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("9830840840");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("asd-123");
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		    Thread.sleep(3000);
//		    driver.findElement(By.xpath("(//i[@class='fa fa-arrow-circle-right'])[1]")).click();
		    WebElement Ele = driver.findElement(By.xpath("(//i[@class='fa fa-arrow-circle-right'])[1]"));
			JavascriptExecutor executo = (JavascriptExecutor) driver;
			executo.executeScript("arguments[0].click();", Ele);
		    for (int i = 0; i <20; i++) {
		    WebElement start = driver.findElement(By.xpath("(//button[@class='btn btn-success btn-sm dropdown-toggle'])[1]"));
		  

		    JavascriptExecutor execute = (JavascriptExecutor) driver;
			execute.executeScript("arguments[0].click();",start);
			
			  WebElement counselling = driver.findElement(By.xpath("(//a[.=' Start Counselling'])[1]"));
			  
			  JavascriptExecutor Start = (JavascriptExecutor) driver;
				Start.executeScript("arguments[0].click();",counselling);
//		    //Answer all the question
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("//input[@class='radio-scale first_tab answerQ1' and @value='No']")).click();
//		     driver.findElement(By.xpath("//input[@class='radio-scale first_tab answerdzlIVGJIS3RaakJZckYvZlFmT1hrUT09' and @value='No']")).click();
//		     driver.findElement(By.xpath("//input[@class='radio-scale first_tab answerZGU5VVFRdy9iVThLaFhsSXdBV1l3QT09' and @value='No']")).click();
//		     driver.findElement(By.xpath("//input[@class='radio-scale first_tab answerdTNEbUN2TWhrSklyM2dQRWVjd1BuQT09' and @value='No']")).click();

//		    driver.findElement(By.xpath("//input[@name='answercW1XYnprOGl2V2xDRkk3VHhRODJiZz09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answeraVp2dWZvQ0NybkQ1S0Fqd3dTWXVJQT09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerYmR3amtURTJQbFNTRXM3UXlKU3dhZz09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerdmdKOTF4V1ZIOEt6eUlqcEpOeTN2UT09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answeraHFIclRhT1FLSGgvYVE3dnRIMnNRQT09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@class='radio-scale answerL0FlaldYMERpLy9aaW5jd3RDVXlTUT09' and @value='No']")).click();
//
//		    driver.findElement(By.xpath("//input[@name='answerZWlYV0Q4QTYxRFk1TUFQakgzNE1pUT09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerZytXTE96bG9DMXZjK3BDZS9XVTA3dz09[]' and @value='None of these']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerSEsxdUZJYi9zWUxYeXFQQTZ1MXJxZz09[]' and @value='None of these']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerbmVsMi9yRC9pT1gvOFNDbzRWSVllUT09[]' and @value='None of these']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerNGJrNDRPd2JkWFphWURldEZXL3VvUT09[]' and @value='None of these']")).click();
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollTo(0, 500);");
		    WebElement fifteen = driver.findElement(By.xpath("(//input[@value='None of these'])[2]"));    //15
//		    JavascriptExecutor js = (JavascriptExecutor) driver;
//		    js.executeScript("arguments[0].scrollIntoView(true);", fifteen);
		    fifteen.click();
//		    driver.findElement(By.xpath("//input[@name='answerc0xwZHVaWklkWC9pMmptbkJIb2VsZz09[]' and @value='None of these']")).click();
		    driver.findElement(By.xpath("//input[@name='answerM0NPMHVKSTRNRmcyUEM5N3BiOGlUdz09[]' and @value='None of these']")).click();    //17
		    
//		    driver.findElement(By.xpath("//input[@name='answeraG9iaGNTQzB4MWhwbjY2ZFFaT1JRZz09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerMXFnMHNQc1Vnem9qb0p1L1l5UHBIZz09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerUW0zYVlJcFoyaTQ2dDBmblFNTlBmdz09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerdEpJdk0wcURDUzhPYTY4RFVCNUl4dz09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerRnZsU1h5NktoRWFVWXIrcDUrTDZ0QT09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerZWx0QlMzanNRa3JLeHVtYUxiSjJaZz09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerTHpUdStNTm5ZSUk0NFRjUE1ESjZTUT09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerVVl0ZDhKREYzWEdXSmpWaGQrK3U3UT09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerS2h0QTNPSmp4QUJiYnV0d2szcGRDUT09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerQU0ralBkSTI4dXphbGhrV1MzQlNCQT09' and @value='No']")).click();
//		    driver.findElement(By.xpath("//input[@name='answerMXZwM0Rpb1ZiVEdUZ0ZHT0FIa0g3UT09' and @value='No']")).click();
		    driver.findElement(By.xpath("//button[text()='Next ']")).click();
		    
		    driver.findElement(By.id("emr_weight")).sendKeys("62");
		    driver.findElement(By.id("hb_id")).sendKeys("16");
		    driver.findElement(By.id("temparature")).sendKeys("98.4");
		    driver.findElement(By.id("pulse")).sendKeys("71");
		    driver.findElement(By.xpath("//input[@placeholder='SBP']")).sendKeys("120");
		    driver.findElement(By.xpath("//input[@placeholder='DBP']")).sendKeys("80");
		    driver.findElement(By.id("select2-blood_group-container")).click();
		    driver.findElement(By.xpath("//li[text()='UNKNOWN']")).click();
		    driver.findElement(By.id("counseling_fit")).click();
		    driver.findElement(By.id("select2-reason_differ-container")).click();
		    //driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("ok");
		    driver.findElement(By.xpath("//li[.='ok']")).click();

		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='confirm']")).click();
		    
		    //		    Alert alert = driver.switchTo().alert();
//		    System.out.println("Alert Text: " + alert.getText());
//		    alert.accept();
			   

//		     driver.switchTo();
//			    WebElement a=driver.findElement(By.xpath("//button[text()='Yes, I am sure!']"));

		    
		    }
	       driver.quit();

		    


		   
		    
	}

}
