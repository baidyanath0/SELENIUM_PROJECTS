package practice_Selenium;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class User_Regisrtation {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int a=1;
		for(int i=0; i<10; i++ ) {
		String firstname = User_Registration_Generic.read_ddt("Sheet1", a, 0); // (row,cell)
		String Lastname = User_Registration_Generic.read_ddt("Sheet1", a, 1); // (row,cell)
		String User_email = User_Registration_Generic.read_ddt("Sheet1", a, 2); // (row,cell)
		String Website = User_Registration_Generic.read_ddt("Sheet1", a, 3); // (row,cell)
		String pass = User_Registration_Generic.read_ddt("Sheet1", a, 4); // (row,cell)
		String Confrim_pass = User_Registration_Generic.read_ddt("Sheet1", a, 5); // (row,cell)
		String Check_box = User_Registration_Generic.read_ddt("Sheet1", a, 6); // (row,cell)
		String Radio = User_Registration_Generic.read_ddt("Sheet1", a, 7); // (row,cell)
		String Country = User_Registration_Generic.read_ddt("Sheet1", a, 8); // (row,cell)
		String Textareafield = User_Registration_Generic.read_ddt("Sheet1", a, 9); // (row,cell)
		String Number = User_Registration_Generic.read_ddt("Sheet1", a, 10); // (row,cell)
		String dropdown = User_Registration_Generic.read_ddt("Sheet1", a, 11); // (row,cell)
		String input = User_Registration_Generic.read_ddt("Sheet1", a, 12); // (row,cell)
		
//System.out.println(firstname +Lastname + User_email+Website+pass+Confrim_pass+Check_box+Radio+Country+Textareafield+Number+dropdown+input);;
		
		driver.get("https://demo.wpeverest.com/user-registration/form-3/");
        driver.findElement(By.id("first_name")).sendKeys(firstname);
        driver.findElement(By.id("last_name")).sendKeys(Lastname);
        driver.findElement(By.id("user_email")).sendKeys(User_email);
        driver.findElement(By.id("user_url")).sendKeys(Website);
        driver.findElement(By.id("user_pass")).sendKeys(pass);
        driver.findElement(By.id("user_confirm_password")).sendKeys(Confrim_pass);
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        driver.findElement(By.xpath("//label[.='Male']")).click();
        WebElement country = driver.findElement(By.xpath("//select[@data-label='Country']"));
        Select S1 = new Select(country);
		S1.selectByVisibleText(Country);
        driver.findElement(By.xpath("//textarea[@class='input-text ur-frontend-field  ']")).sendKeys(Textareafield);
        driver.findElement(By.xpath("//input[@class='input-text without_icon input-number ur-frontend-field  ']")).sendKeys(Number);
        WebElement op = driver.findElement(By.xpath("//select[@data-label='Select']"));
        Select S2= new Select(op);
        S2.selectByIndex(1);
        driver.findElement(By.id("input_box_1507714764")).sendKeys(input);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement success = driver.findElement(By.id("ur-submit-message-node"));
        if(success.isDisplayed()) {
        	JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, 0)");
        }
        a++;
	}}
	
}
