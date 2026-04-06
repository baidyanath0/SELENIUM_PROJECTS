package NMMSS_Cludo;
import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class IGNTR_Application {
		public static void main(String[] args) throws AWTException, InterruptedException  {
//			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
//			WebDriver driver = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			int count=0;
			int y =16;
			int x =976906;
			for (int i = 0; i <1; i++) {
		    driver.get("https://jac-igntr.cludocloud.com");
//		    driver.get("https://jac-igntr.cludocloud.com//registration");
		    driver.findElement(By.xpath("//input[@placeholder='Enter Phone Number']")).sendKeys("8420"+x);
			driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']")).sendKeys("test@gmail.com");
			driver.findElement(By.id("toggleIcon")).click();
			
			driver.findElement(By.id("aadhaar")).sendKeys("987520"+ x);
			driver.findElement(By.id("password")).sendKeys("Abcd@1234");
			driver.findElement(By.id("confirm_password")).sendKeys("Abcd@1234");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[.='Register']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='n1']")).sendKeys("1");
			driver.findElement(By.xpath("//input[@name='n2']")).sendKeys("2");
			driver.findElement(By.xpath("//input[@name='n3']")).sendKeys("3");
			driver.findElement(By.xpath("//input[@name='n4']")).sendKeys("4");
			driver.findElement(By.xpath("//input[@name='n5']")).sendKeys("5");
			driver.findElement(By.xpath("//input[@name='n6']")).sendKeys("6");
			driver.findElement(By.xpath("//button[.='Verify OTP']")).click();
			Thread.sleep(2000);
//		    driver.get("http://10.100.10.10:8080/igntr_uat/merit_portal/");
//		    driver.findElement(By.xpath("//input[@placeholder='Enter Login Id']")).sendKeys("9658354693"+ x);
//		    driver.findElement(By.xpath("//input[@placeholder='Enter Aadhaar Number']")).sendKeys("98418520" + x);
//		    driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']")).sendKeys("asd-123");
//		    Thread.sleep(4000);
//	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//span[.='Apply Now']")).click();
	        Thread.sleep(5000);
	        WebElement sc = driver.findElement(By.xpath("//select[@name='school_apply']"));
	        Select S9= new Select(sc);
	        S9.selectByIndex(1);
	        //fetch data from execel
			String name = IGNTR_Generic.read_ddt("Sheet1", y, 0); // (row,cell)
			String father_name = IGNTR_Generic.read_ddt("Sheet1", y,1); 
			String mother_name = IGNTR_Generic.read_ddt("Sheet1", y, 2); 
			String gender = IGNTR_Generic.read_ddt("Sheet1", y, 3);
			String cast = IGNTR_Generic.read_ddt("Sheet1", y, 4); 
			String disability = IGNTR_Generic.read_ddt("Sheet1", y, 5); 
			String dob = IGNTR_Generic.read_ddt("Sheet1", y, 6); 
			String add1 = IGNTR_Generic.read_ddt("Sheet1", y, 7); 
			String post = IGNTR_Generic.read_ddt("Sheet1", y, 8); 
			String dist = IGNTR_Generic.read_ddt("Sheet1", y, 9); 
			String pin = IGNTR_Generic.read_ddt("Sheet1", y, 10);
			String school = IGNTR_Generic.read_ddt("Sheet1", y, 11); 
			String sch_dist = IGNTR_Generic.read_ddt("Sheet1", y, 12);
			String sch_block = IGNTR_Generic.read_ddt("Sheet1", y, 13);
			String exam_medium = IGNTR_Generic.read_ddt("Sheet1", y, 14); 
			String photo = IGNTR_Generic.read_ddt("Sheet1", y, 15); 
			String sign = IGNTR_Generic.read_ddt("Sheet1", y, 16); 
			System.out.print(name);
	        driver.findElement(By.id("candidate_name")).sendKeys(name);
	        driver.findElement(By.id("father_name")).sendKeys(father_name);
	        driver.findElement(By.id("mother_name")).sendKeys(mother_name);
	        
	        WebElement Gender = driver.findElement(By.id("gender"));
	        WebElement Caste = driver.findElement(By.id("caste"));
	        WebElement Disability = driver.findElement(By.id("disability"));
	        Select S= new Select(Gender);
	        S.selectByValue(gender);
	        Select S1= new Select(Caste);  
	        S1.selectByVisibleText(cast);
	        Select S2= new Select(Disability);
	        S2.selectByVisibleText(disability);
	        Thread.sleep(3000);
//select the DOB	        
	        WebElement dateInput = driver.findElement(By.name("dob"));
	        dateInput.click();
	        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	        Select S55= new Select(year);
	        S55.selectByIndex(1); 
//	        JavascriptExecutor js5 = (JavascriptExecutor) driver;
//	        js5.executeScript("arguments[0].setAttribute('value', '21-01-2001')", dateInput);
	        driver.findElement(By.xpath("//a[text()='21']")).click();
	        
	        driver.findElement(By.id("p_address_one")).sendKeys(add1);
	        driver.findElement(By.id("p_post_office")).sendKeys(post);
	        WebElement District = driver.findElement(By.id("p_district"));
	        Select S4= new Select(District);
	        S4.selectByVisibleText(dist);
	        driver.findElement(By.id("p_pincode")).sendKeys(pin);
	        Thread.sleep(2000);
	        driver.findElement(By.id("correspondence_address")).click();
	        driver.findElement(By.id("candidate_school")).sendKeys(school);
	        WebElement District1 = driver.findElement(By.id("district"));
	        Select S5= new Select(District1);
	        S5.selectByVisibleText(sch_dist);
	        Thread.sleep(2000);
	        WebElement Block = driver.findElement(By.id("school_block"));
	        Select S6= new Select(Block);
	        S6.selectByVisibleText(sch_block);
	        WebElement Medium = driver.findElement(By.id("exam_medium"));
	        Select S7= new Select(Medium);
	        S7.selectByVisibleText(exam_medium);
	        Thread.sleep(1000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			// Scroll to the bottom of the page
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

			driver.findElement(By.id("upload_photograph")).sendKeys(photo);
			Thread.sleep(2000);
			driver.findElement(By.className("confirm")).click();
			driver.findElement(By.id("upload_signature")).sendKeys(sign);
			Thread.sleep(3000);
			driver.findElement(By.className("confirm")).click();
			driver.findElement(By.id("preview_btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("save_btn")).click();
            //driver.findElement(By.className("cancel")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[.='Yes, submit!']")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("confirm")).click();
			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[text()=' Logout ']")).click(); // logout
			   
//			driver.findElement(By.xpath("//a[.=' Edit my Application']")).click(); //edit
//			WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));     //You can proceed for payment
//			 JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		     js2.executeScript("arguments[0].click();", element);;
//			System.out.println("6");
//			
//     		driver.findElement(By.xpath("//span[.='Pay Fees']")).click(); // payment from menu list menu
//     		Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[.=' Make Payment']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//label[.='Net Banking ']")).click();
//			driver.findElement(By.id("ICIC")).click();
//			driver.findElement(By.xpath("//span[.='Pay Now']")).click();
//			driver.findElement(By.className("success")).click();
//			Thread.sleep(2000);
//			Alert a = driver.switchTo().alert();
//			a.accept();
//         	Thread.sleep(15000);
////			String originalTab = driver.getWindowHandle();
//			driver.findElement(By.xpath("//a[text()=' Back to Dashboard']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//span[.='Application Print']")).click();
//			WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10000));
//	        // Wait until the overlay disappears
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='content'])[1]")));
//            driver.close();
//			Thread.sleep(3000);
			
//
//			// Get all window handles
//			Set<String> allHandles = driver.getWindowHandles();
//
//			// Iterate through the handles to identify the new tab and close it
//			for (String handle : allHandles) {
//				if (!handle.equals(originalTab)) {
//					driver.switchTo().window(handle); // Switch to the new tab
//					driver.close(); // Close the new tab
//					break; // Exit the loop after closing the new tab
//				}
//			}
//			// Switch back to the original tab
//			driver.switchTo().window(originalTab);
			
            driver.findElement(By.xpath("//a[@class='dropdown-item logout']")).click(); // logout
		    
//			// Step 2: Use JavascriptExecutor to open a new tab
//			JavascriptExecutor js1 = (JavascriptExecutor) driver;
//			js1.executeScript("window.open('https://www.google.com', '_blank');");
//			// Step 3: Get the list of all opened tabs
//			List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//			// Step 4: Switch to the new tab (second tab in the list)
//			driver.switchTo().window(tabs.get(1));
//			// Optionally, perform any actions on the new tab
//			//System.out.println("Title of the new tab: " + driver.getTitle());
//			// Step 5: Close the old tab (the first tab in the list)
//			driver.switchTo().window(tabs.get(0)); // Switch back to the first tab
//			driver.close(); // Close the old tab
//			// Step 6: Switch to the new tab (the second tab, where we are already)
//			driver.switchTo().window(tabs.get(1));


			x++;
			y++;
			count++;
			System.out.println(count);
			}
			System.out.println(count);
			driver.quit();
			}
		}
		
	


