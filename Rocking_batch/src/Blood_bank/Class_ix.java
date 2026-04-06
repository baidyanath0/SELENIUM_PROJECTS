package Blood_bank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Class_ix {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.100.10.10:8080/p4_projects/secondary/landing-page");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[.='Class 9 Registration Portal']")).click();
		driver.findElement(By.name("school_id")).sendKeys("20130101611");
		driver.findElement(By.name("password")).sendKeys("358Z6NYQ9G");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[.='Login']")).click();

		driver.findElement(By.xpath("//a[@href='http://10.100.10.10:8080/p4_projects/secondary/add-student-9']"))
				.click();

		// --------------------------Student Details--------------------------------

		// fill candidate name,father name, mother name
		driver.findElement(By.name("candidate_name")).sendKeys("Amit Das");
		driver.findElement(By.name("father_name")).sendKeys("Sagar Das");
		driver.findElement(By.name("mother_name")).sendKeys("Rima Das");
		// fill gender
		WebElement Religion = driver.findElement(By.name("religion"));
		Select s1 = new Select(Religion);
		s1.selectByValue("UXArcm9RaC82M1V6V1VwTnF0N3ExZz09");
		// fill religion
		WebElement Gender = driver.findElement(By.name("gender"));
		Select s2 = new Select(Gender);
		s2.selectByValue("Male");
		// fill date of birth
		driver.findElement(By.name("birth_date")).sendKeys("05042008");
		// enter Aadhar number
		driver.findElement(By.name("aadhaar_no")).sendKeys("877222985647");
		// choose disability
		WebElement Divyang = driver.findElement(By.id("disability"));
		Select s3 = new Select(Divyang);
		s3.selectByVisibleText("BLIND");
		// choose caste
		WebElement Caste = driver.findElement(By.id("caste"));
		Select s4 = new Select(Caste);
		s4.selectByValue("elZjVkFEcWJOTHZGM2dSQmpWVnVoZz09");
		// enter roll number
		driver.findElement(By.id("roll_no")).sendKeys("562365");

		// scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		// -----------------------Communication Details---------------------------------

		// choose area
		WebElement Area = driver.findElement(By.name("area"));
		Select s5 = new Select(Area);
		s5.selectByValue("Rural");
		// choose State
		WebElement State = driver.findElement(By.id("state_val"));
		Select s6 = new Select(State);
		s6.selectByValue("WnNDaU4xWWdnV1MvNnE1REcrK2tjZz09");
		// choose District
		Thread.sleep(1000);
		WebElement District = driver.findElement(By.name("district"));
		Select s7 = new Select(District);
		WebElement first_option = s7.getFirstSelectedOption();
		String text = first_option.getText();
		if (text.equals("Choose District")) {
			Select se = new Select(District);
			se.selectByValue("czJIalBmalZoR0JNNzNzV1d3ODJrdz09");
		} else {
		}
		Thread.sleep(1000);
		// choose block
		WebElement Block = driver.findElement(By.name("block"));
		Select s8 = new Select(Block);
		s8.selectByVisibleText("BARKATHA");
		// ENTER ADDRESS
		driver.findElement(By.name("address")).sendKeys("DOBRA");
		// ENTER PIN
		driver.findElement(By.name("pin_no")).sendKeys("854652");
		// ENTERCONTACT NO
		driver.findElement(By.name("mobile_no")).sendKeys("9653286495");
		// ENTER EMAIL ID
		driver.findElement(By.name("email_id")).sendKeys("acb@gmai.com");

		// scroll
		js.executeScript("window.scrollBy(0,500)");

		// -------------------------------Educational Details---------------
		// CHOOSE CATEGORY
		WebElement Category = driver.findElement(By.id("Category-Choice"));
		Select s9 = new Select(Category);
		s9.selectByValue("Qkd0R2h0a1JtK3NCNFlZKzZ4NUFnUT09");
		// CHOOSE BOARD
		WebElement Board = driver.findElement(By.id("board_name"));
		Select s10 = new Select(Board);
		s10.selectByValue("JAC");
		// Choose Medium of Examination
		WebElement Medium = driver.findElement(By.name("examination_medium"));
		Select s11 = new Select(Medium);
		s11.selectByValue("RkM4SmhubXpwWFYrUTZuZ213SjBiZz09");
		// Choose Language
		WebElement Language1 = driver.findElement(By.id("language_one"));
		Select s12 = new Select(Language1);
		s12.selectByValue("cjZ3cGJZYkkvaXJlNGNFa3cyMDRNZz09");
		// Choose Language
		WebElement Language2 = driver.findElement(By.id("language_two"));
		Select s13 = new Select(Language2);
		s13.selectByValue("NzNHczZsL0tnZlNUMDF2bEhhSXRTdz09");
		// choose additional sub
		WebElement add_sub = driver.findElement(By.id("additional_subject"));
		Select s14 = new Select(add_sub);
		s14.selectByValue("UXB6b0FacDF0cmVRdmN1VXJQVHdQdz09");

		// ---------------------------Document Upload Section-------------------
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='profileimg form-control'])[1]"))
				.sendKeys("C:\\Users\\koushik das\\Downloads\\student.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='profileimg form-control'])[2]"))
				.sendKeys("C:\\Users\\koushik das\\Downloads\\signature-523237_1280.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();

		// scroll and click on preview
		WebElement ele = driver.findElement(By.id("preview_btn"));
		Actions act = new Actions(driver);
		act.doubleClick(ele).build().perform();
		Thread.sleep(5000);
		
        //scroll and final submit
		WebElement button = driver.findElement(By.id("save_btn"));
		js.executeScript("arguments[0].scrollIntoView();", button);
		Thread.sleep(2000);
		button.click();
        
	}
}
