package jac_load_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fill_from {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.100.10.10:8080/p4_projects/secondary/landing-page");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

}}
