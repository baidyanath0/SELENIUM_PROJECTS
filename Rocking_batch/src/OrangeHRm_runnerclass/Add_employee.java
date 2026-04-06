package OrangeHRm_runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic_TestNG.Base_class;

public class Add_employee extends Base_class
{
	@Test(invocationCount = 2)
public void PIM()
	{
		//login into the application
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);      //username and password value inherit from base class
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		
		//check the logo is present or not
		WebElement ele = driver.findElement(By.className("oxd-brand-banner"));	
		if(ele.isDisplayed()) {
			driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a[1]/span[1]")).click();
			
			//add employee by entering valid data
			driver.findElement(By.xpath("//a[.='Add Employee']")).click();
			driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys(firstname);    //firstname and lastname value inherit from base class
			driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys(lastname);
			driver.findElement(By.xpath("//button[.=' Save ']")).click();
			
			//check confirmation message
				try {
				WebElement ele1 = driver.findElement(By.xpath("//div[@id='oxd-toaster_1']"));
				Thread.sleep(3000);
				if(ele1.isDisplayed()) {
					
					//delete the employee details
					driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a[1]/span[1]")).click();
					
					driver.findElement(By.xpath("//a[.='Employee List']")).click();
					
					driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(firstname);
					
					driver.findElement(By.xpath("//button[.=' Search ']")).click();
					
					driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
					

				else {
					System.out.println("defect");
				}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				}
		
		driver.quit();
		}}}
	
