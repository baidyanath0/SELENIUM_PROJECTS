package print_in_Excel;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_all_link_print {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	    static String path="";
	    FileInputStream fis=new FileInputStream(path);
	    Workbook book= WorkbookFactory.create(fis);
	    Sheet s=book.createSheet("amazon_link");
	    System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.amazon.in/s?k=shoes&crid=3RLGXJF0S3KTR&sprefix=aho%2Caps%2C291&ref=nb_sb_ss_w_hit-vc-lth_shoes_k2_3_3");
	    driver.fin


}
