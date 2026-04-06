package practice_Selenium;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counseling_ans {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.100.10.10:8080/optima_hms/index.php/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	

    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("7980421041");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("asd-123");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    driver.findElement(By.xpath("//a[@href='http://10.100.10.10:8080/optima_hms/pending-counselling-register/Yy9qNGFsZktiQTQ2YWplSWYrU3JMQT09']")).click();
    driver.findElement(By.xpath("(//button[@class='btn btn-success btn-sm dropdown-toggle'])[1]")).click();
    driver.findElement(By.xpath("(//a[.=' Start Counseling'])[1]")).click();
      
    //Answer all the question
    driver.findElement(By.xpath("//ul[@class='div-ul']/li[2]/label/input[@name='answerdzlIVGJIS3RaakJZckYvZlFmT1hrUT09' and @value='No']")).click();
    driver.findElement(By.xpath("driver.findElement(By.xpath(\"\")).click();")).click();
    driver.findElement(By.xpath("driver.findElement(By.xpath(\"\")).click();")).click();
    driver.findElement(By.xpath("//input[@name='answercW1XYnprOGl2V2xDRkk3VHhRODJiZz09' and @value='No']")).click();
    driver.findElement(By.xpath("driver.findElement(By.xpath(\"\")).click();")).click();
    driver.findElement(By.xpath("//input[@name='answeraVp2dWZvQ0NybkQ1S0Fqd3dTWXVJQT09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerYmR3amtURTJQbFNTRXM3UXlKU3dhZz09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerdmdKOTF4V1ZIOEt6eUlqcEpOeTN2UT09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answeraHFIclRhT1FLSGgvYVE3dnRIMnNRQT09' and @value='No']")).click();
    driver.findElement(By.xpath("driver.findElement(By.xpath(\"\")).click();")).click();
    driver.findElement(By.xpath("//input[@name='answerZWlYV0Q4QTYxRFk1TUFQakgzNE1pUT09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerZytXTE96bG9DMXZjK3BDZS9XVTA3dz09[]' and @value='None of these']")).click();
    driver.findElement(By.xpath("//input[@name='answerSEsxdUZJYi9zWUxYeXFQQTZ1MXJxZz09[]' and @value='None of these']")).click();
    driver.findElement(By.xpath("//input[@name='answerbmVsMi9yRC9pT1gvOFNDbzRWSVllUT09[]' and @value='None of these']")).click();
    driver.findElement(By.xpath("//input[@name='answerNGJrNDRPd2JkWFphWURldEZXL3VvUT09[]' and @value='None of these']")).click();
    driver.findElement(By.xpath("//input[@name='answerOWxpU1k4b1A1T1JwZjducnZsYjB6QT09[]' and @value='None of these']")).click();
    driver.findElement(By.xpath("//input[@name='answerc0xwZHVaWklkWC9pMmptbkJIb2VsZz09[]' and @value='None of these']")).click();
    driver.findElement(By.xpath("//input[@name='answerNkFUT1htNzNTM3ZiNTVsT09NZEo5Zz09[]' and @value='None of these']")).click();
    driver.findElement(By.xpath("//input[@name='answeraG9iaGNTQzB4MWhwbjY2ZFFaT1JRZz09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerMXFnMHNQc1Vnem9qb0p1L1l5UHBIZz09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerUW0zYVlJcFoyaTQ2dDBmblFNTlBmdz09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerdEpJdk0wcURDUzhPYTY4RFVCNUl4dz09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerRnZsU1h5NktoRWFVWXIrcDUrTDZ0QT09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerZWx0QlMzanNRa3JLeHVtYUxiSjJaZz09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerTHpUdStNTm5ZSUk0NFRjUE1ESjZTUT09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerVVl0ZDhKREYzWEdXSmpWaGQrK3U3UT09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerS2h0QTNPSmp4QUJiYnV0d2szcGRDUT09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerQU0ralBkSTI4dXphbGhrV1MzQlNCQT09' and @value='No']")).click();
    driver.findElement(By.xpath("//input[@name='answerMXZwM0Rpb1ZiVEdUZ0ZHT0FIa0g3UT09' and @value='No']")).click();

    
	}
    
}
