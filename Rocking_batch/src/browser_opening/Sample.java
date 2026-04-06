package browser_opening;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) 
	{
//      String key="Webdriver.chrome.driver";
//      String value="./softwares/chromedriver.exe";
//      System.setProperty(key,value);
//      ChromeDriver driver=new ChromeDriver();
      
      String key="webdriver.gecko.driver";
      String value="./softwares/geckodriver.exe";
      System.setProperty(key,value);
      FirefoxDriver driver=new FirefoxDriver();
      
	}
}
