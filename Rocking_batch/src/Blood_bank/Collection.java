package Blood_bank;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Collection {
	public static void main(String[] args) throws AWTException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://optima-cnci-test.cludocloud.com/login.aspx\r\n"
				+ "");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		driver.findElement(By.id("details-button")).click();
//		driver.findElement(By.id("proceed-link")).click();
		
		 
		// login
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("8420000394");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("asd-123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[.='Dashboard']")).click();
		driver.findElement(By.xpath("//a[@href='blood-donation-dashboard.aspx']")).click();
//		driver.findElement(By.xpath("//input[@id='txt_date']")).click();
//		driver.findElement(By.xpath("//a[.='10']")).click();
//	    driver.findElement(By.id("ContentPlaceHolder1_btn_apply")).click();
//		driver.findElement(By.xpath("(//h4[@class='info-box-text info-box-new-text'])[3]")).click();
		 for (int i = 0; i < 3; i++) {
		driver.findElement(By.xpath("(//span[@class='caret'])[1]")).click();	
		driver.findElement(By.id("btn_bloodCollection")).click();
		driver.findElement(By.xpath("//span[@title='--Select--']")).click();
		driver.findElement(By.xpath("//li[.='Success']")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txt_Quantity")).sendKeys("450");
		driver.findElement(By.id("ContentPlaceHolder1_txt_no_paks")).sendKeys("1");
		driver.findElement(By.xpath("//span[@title='--SELECT--']")).click();
		//driver.findElement(By.xpath("//li[.='CPDA/CPDA1']")).click();
		driver.findElement(By.xpath("//li[.='CPD+SAGM']")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txt_segment")).sendKeys("GHA33");
		driver.findElement(By.id("ContentPlaceHolder1_txt_remarks")).sendKeys("ok");
		driver.findElement(By.id("ContentPlaceHolder1_btnSave")).click();
		driver.findElement(By.xpath("//button[.='OK']")).click();
		
		// Component Preparation
					driver.findElement(By.xpath("(//span[@class='caret'])[1]")).click();
					driver.findElement(By.id("ContentPlaceHolder1_lst_Details_btnComponent_0")).click();
					driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[1]")).sendKeys("450");
					driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[2]")).sendKeys("450");
					driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[3]")).sendKeys("450");
					driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[4]")).sendKeys("450");
					driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[5]")).sendKeys("450");
					driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[6]")).sendKeys("450");
					driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[7]")).sendKeys("450");
					driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[8]")).sendKeys("450");

					driver.findElement(By.id("ContentPlaceHolder1_btnsave")).click();
					driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		             //click on menu bar
					driver.findElement(By.xpath("//a[@class='sidebar-toggle']")).click();
//		driver.findElement(By.xpath("//th[@class='sorting sorting_asc']")).click();
//		driver.findElement(By.xpath("(//button[@class='btn btn-success dropdown-toggle'])[1]")).click();
//		driver.findElement(By.xpath("(//a[@title='Prepare Component'])[1]")).click();
		
//		WebElement Whole_Blood=driver.findElement(By.xpath("//span[.='Whole Blood:']"));
//		WebElement PRCB=driver.findElement(By.xpath("//span[.='PRCB:']"));
//		WebElement SDAP=driver.findElement(By.xpath("//span[.='SDAP:']"));

//		
//		if(Whole_Blood.isDisplayed())
//		{
//		driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[1]")).sendKeys("100");	
//		}
//		else
//		{
//			if(PRCB.isDisplayed())
//			{
//			driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[2]")).sendKeys("200");	
//			}
//			else {
//				if(PRCB.isDisplayed())
//				{
//				driver.findElement(By.xpath("(//input[@class='form-control record-textbox'])[3]")).sendKeys("200");	
//				}
//				else {
//					
//				}
//			}
//		}

		
		
		
		

		 }
		 driver.close();





}}
