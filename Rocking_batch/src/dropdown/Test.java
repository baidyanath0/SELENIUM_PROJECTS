package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// verify is it multiple dropdown or not
		WebElement drp = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(drp);
		boolean mlt = s.isMultiple();

		// if it is multiple drop down then get the all options and print in consol
		if (mlt) {
			List<WebElement> opt = s.getOptions();
			
			for (WebElement option : opt) {
				String text = option.getText();
				System.out.println(text);
			}
			System.out.println("--------------");


			// if it is multiple drop down then select multiple options and get
			// First_selected options and print in console.
			s.selectByIndex(0);
			s.selectByValue("United Kingdom");
			s.selectByVisibleText("India");
			WebElement fso = s.getFirstSelectedOption();
			String text = fso.getText();
			System.out.println(text);
			System.out.println("-----------------");

			// deselect by value and print the selected options
			
			s.deselectByValue("United Kingdom");
			List<WebElement> aso = s.getAllSelectedOptions();
			for (WebElement eachoption : aso) {
				String text2 = eachoption.getText();
				System.out.println(text2);
			}
		}

	}

}
