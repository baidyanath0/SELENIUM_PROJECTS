package Mbose;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Scrutinizer {
	public static void main(String[] args) throws AWTException, InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mbose-hsslc.cludocloud.com/admin/login.aspx ");
//		driver.get("http://mbose-hsslc.getmyresult.in/admin/login.aspx");

//		for (int r = 0; r < 100;r++) {
		driver.findElement(By.id("txtusercode")).sendKeys("0000000000");
		driver.findElement(By.id("txtpassword")).sendKeys("abcd");
		Thread.sleep(4000);
		driver.findElement(By.id("btn_next")).click();
		driver.findElement(By.xpath("//div[text()='Scrutinizer']")).click();
		
		int x = 0;
		for (int r = 0; r < 6; r++) {
			String Zone = Create_Scrutinizer_Generic.ddt("Sheet1", x, 0); // (row,cell)
			String sub = Create_Scrutinizer_Generic.ddt("Sheet1", x, 1);
			String F_name = Create_Scrutinizer_Generic.ddt("Sheet1", x, 2);
			String L_name = Create_Scrutinizer_Generic.ddt("Sheet1", x, 3);
			String ph = Create_Scrutinizer_Generic.ddt("Sheet1", x, 4);
			
			driver.findElement(By.xpath("//a[@href='create-user.aspx']")).click();
			driver.findElement(By.xpath("//span[@class='select2-selection__rendered']")).click();
			driver.findElement(By.className("select2-search__field")).sendKeys(Zone, Keys.ENTER);
			driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
			driver.findElement(By.className("select2-search__field")).sendKeys(sub, Keys.ENTER);
			driver.findElement(By.id("ContentPlaceHolder1_txt_UserfName")).sendKeys(F_name);
			driver.findElement(By.id("ContentPlaceHolder1_txt_UserlName")).sendKeys(L_name);
			driver.findElement(By.id("ContentPlaceHolder1_txt_contact")).sendKeys(ph);
			driver.findElement(By.id("ContentPlaceHolder1_lnk_submit")).click();
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			x++;
			
		}
		
//		driver.quit();

	}
}
