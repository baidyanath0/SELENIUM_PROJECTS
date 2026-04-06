package NMMSS_Cludo;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.yaml.snakeyaml.events.Event.ID;

public class NMMSS_Application {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int count=0;
		int y = 16;
		int x =581580;
		for (int i = 0; i < 1000; i++) {
			driver.get("nmms-2026.jacexamonline.com/User/register_user");
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Phone Number']")).sendKeys("8420"+x);
//			driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']")).sendKeys("test@gmail.com");
			driver.findElement(By.id("toggleIcon")).click();
			
			driver.findElement(By.id("aadhaar")).sendKeys("98653271"+ x);
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
//			driver.findElement(By.xpath("//button[.='OK']")).click();
			// String username = Generic_NMMSS.read_ddt("Sheet1", 1, 0); // (row,cell)
//		String aadhaar = Generic_NMMSS.read_ddt("Sheet1", 1, 1);
//		String password = Generic_NMMSS.read_ddt("Sheet1", 1, 2);
//		driver.get("http://10.100.10.10:8080/nmms_uat/merit_portal/");
//
//			driver.findElement(By.xpath("//input[@placeholder='Enter Login Id']")).sendKeys("8420000394");
//			driver.findElement(By.xpath("//input[@placeholder='Enter Aadhaar Number']")).sendKeys("98653271" + x);
//			driver.findElement(By.id("password")).sendKeys("Abcd@1234");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='Apply Now']")).click();
			// fetch data from execel
			String name = IGNTR_Generic.read_ddt("Sheet1", y, 0); // (row,cell)
			String father_name = IGNTR_Generic.read_ddt("Sheet1", y, 1);
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
			String religion = IGNTR_Generic.read_ddt("Sheet1", y, 17);
			String IFSC = IGNTR_Generic.read_ddt("Sheet1", y, 18);
			String AC = IGNTR_Generic.read_ddt("Sheet1", y, 19);
//Student Details
			driver.findElement(By.id("candidate_name")).sendKeys(name);
			driver.findElement(By.id("father_name")).sendKeys(father_name);
			driver.findElement(By.id("mother_name")).sendKeys(mother_name);
			WebElement Gender = driver.findElement(By.id("gender"));
			WebElement Caste = driver.findElement(By.id("caste"));
			WebElement Disability = driver.findElement(By.id("disability"));
			WebElement Religion = driver.findElement(By.id("religion"));
			Select S = new Select(Gender);
			S.selectByValue(gender);
			Select S1 = new Select(Caste);
			S1.selectByVisibleText(cast);
			Select S2 = new Select(Disability);
			S2.selectByVisibleText(disability);
			Select S3 = new Select(Religion);
			S3.selectByVisibleText(religion);
			// Thread.sleep(3000);
			driver.findElement(By.id("candidate_resides")).sendKeys(add1);
			driver.findElement(By.id("dob")).click();
			driver.findElement(By.xpath("//a[.='25']")).click();
//Permanent Address			
			WebElement District1 = driver.findElement(By.id("district"));
			WebElement check= driver.findElement(By.id("correspondence_address"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", District1);
			driver.findElement(By.id("p_address_one")).sendKeys(add1);
			driver.findElement(By.id("p_post_office")).sendKeys(post);
			WebElement District = driver.findElement(By.id("p_district"));
			Select S4 = new Select(District);
			S4.selectByVisibleText(dist);
			driver.findElement(By.id("p_pincode")).sendKeys(pin);
			Thread.sleep(2000);	
			JavascriptExecutor js9 = (JavascriptExecutor) driver;
	        js9.executeScript("arguments[0].click();", check);
//Name and Address of the School 	        
//	        WebElement scroll1=driver.findElement(By.id("school_post_office"));
			driver.findElement(By.id("candidate_school")).sendKeys(school);
//			WebElement District1 = driver.findElement(By.id("district"));
			Select S5 = new Select(District1);
			S5.selectByVisibleText(sch_dist);
			Thread.sleep(2000);
			WebElement Block = driver.findElement(By.id("school_block"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Block);
			Select S6 = new Select(Block);
			S6.selectByVisibleText(sch_block);
			driver.findElement(By.id("sub_division")).sendKeys("Chas");
			driver.findElement(By.id("school_post_office")).sendKeys("Chas");
			driver.findElement(By.id("school_located")).sendKeys("Chas");
			WebElement Medium = driver.findElement(By.id("type_institution"));
			Select S7 = new Select(Medium);
			S7.selectByVisibleText(exam_medium);
			driver.findElement(By.id("school_pincode")).sendKeys(pin);
			WebElement EX_Medium=driver.findElement(By.id("exam_medium"));
			Select S9 = new Select(EX_Medium);
			S9.selectByVisibleText("HINDI");
//Bank Details & Marks Obtained 			
			WebElement scroll= driver.findElement(By.id("ifsc_code"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
            driver.findElement(By.id("bank_name")).sendKeys("SBI BANK");
            driver.findElement(By.id("ifsc_code")).sendKeys(IFSC);
            driver.findElement(By.id("bank_account_no")).sendKeys(AC);
            WebElement seed=driver.findElement(By.id("aadhaar_seeded_with_bank"));
            Select S8 = new Select(seed);
			S8.selectByVisibleText("Yes");
			driver.findElement(By.id("full_marks")).sendKeys("100");
			driver.findElement(By.id("obtained_marks")).sendKeys("50");
			driver.findElement(By.id("obtained_grade")).sendKeys("B");
//Parental and Other Family Details	
			driver.findElement(By.id("parental_annual_income")).sendKeys("500000");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
			driver.findElement(By.id("father_education")).sendKeys("Graduate");
			driver.findElement(By.id("father_occupation")).sendKeys("Business");
			driver.findElement(By.id("mother_education")).sendKeys("Graduate");
			driver.findElement(By.id("mother_occupation")).sendKeys("Home Maker");
			driver.findElement(By.id("parental_annual_income")).sendKeys("500000");
			driver.findElement(By.id("no_of_members_living")).sendKeys("4");
			driver.findElement(By.id("no_of_brothers")).sendKeys("1");
			driver.findElement(By.id("no_of_sisters")).sendKeys("1");
			driver.findElement(By.id("candidate_no_of_sisters_brothers")).sendKeys("1");
//Document Upload Section
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			driver.findElement(By.id("upload_photograph")).sendKeys(photo);
			Thread.sleep(3000);
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
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//a[text()=' Logout ']")).click(); // logout
//
//			driver.findElement(By.className("confirm")).click();
			Thread.sleep(3000); 
			driver.findElement(By.xpath("//button[.='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
// payment from menu list menu			
			WebElement element = driver.findElement(By.xpath("//span[.='Pay Fees']"));     
			JavascriptExecutor js8 = (JavascriptExecutor) driver;
			js8.executeScript("arguments[0].click();", element);
	        Thread.sleep(1000);
			driver.findElement(By.xpath("//button[.=' Make Payment']")).click();
			driver.findElement(By.xpath("//label[.='Net Banking ']")).click();
			driver.findElement(By.id("ICIC")).click();
			driver.findElement(By.xpath("//span[.='Pay Now']")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("success")).click();
			Thread.sleep(3000);
			Alert a = driver.switchTo().alert();
			a.accept();
			Thread.sleep(15000);
//		
//		driver.findelement(By.xpath("//span[.='Application Print']")).click(); 
			String originalTab = driver.getWindowHandle();
			driver.findElement(By.xpath("//span[.='Application Print']")).click();
			Thread.sleep(1000);

			// Get all window handles
			Set<String> allHandles = driver.getWindowHandles();

			// Iterate through the handles to identify the new tab and close it
			for (String handle : allHandles) {
				if (!handle.equals(originalTab)) {
					driver.switchTo().window(handle); // Switch to the new tab
					driver.close(); // Close the new tab
					break; // Exit the loop after closing the new tab
				}
			}
			// Switch back to the original tab
			driver.switchTo().window(originalTab);

			driver.findElement(By.xpath("//a[text()=' Logout ']")).click(); // logout
			
			// Step 2: Use JavascriptExecutor to open a new tab
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.open('https://www.google.com', '_blank');");
			// Step 3: Get the list of all opened tabs
			List<String> tabs = new ArrayList<>(driver.getWindowHandles());
			// Step 4: Switch to the new tab (second tab in the list)
			driver.switchTo().window(tabs.get(1));
			// Optionally, perform any actions on the new tab
			//System.out.println("Title of the new tab: " + driver.getTitle());
			// Step 5: Close the old tab (the first tab in the list)
			driver.switchTo().window(tabs.get(0)); // Switch back to the first tab
			driver.close(); // Close the old tab
			// Step 6: Switch to the new tab (the second tab, where we are already)
	
			driver.switchTo().window(tabs.get(1));
			
			x++;
            y++;
            count++;
            System.out.println(count);
		}
		System.out.println(count);
		driver.quit();
	}

}

