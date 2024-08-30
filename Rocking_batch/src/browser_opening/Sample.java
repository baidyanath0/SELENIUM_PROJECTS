package browser_opening;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) 
	{
      String key="Webdriver.chrome.driver";
      String value="./softwares/chromedriver.exe";
      System.setProperty(key,value);
      ChromeDriver driver=new ChromeDriver();
	}
}
