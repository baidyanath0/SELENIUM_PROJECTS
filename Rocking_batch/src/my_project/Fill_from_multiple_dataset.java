package my_project;

import java.awt.AWTException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fill_from_multiple_dataset {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://10.100.10.10/login.aspx");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	 List<String[]> candidateData = Arrays.asList(
             new String[]{"John Doe", "Robert Doe", "Jane Doe", "Male", "1990-05-15", "\"C:\\Users\\koushik das\\Downloads\\PIC.jpg\""},
             new String[]{"Alice Smith", "James Smith", "Mary Smith", "Female", "1992-08-25", "\"C:\\Users\\koushik das\\Downloads\\PIC.jpg\""},
             new String[]{"Michael Johnson", "David Johnson", "Emily Johnson", "Others", "1988-03-30", "\"C:\\Users\\koushik das\\Downloads\\PIC.jpg\""}
     );

     try {
         // Open the webpage containing the form
         driver.get("file:///F:/My%20Project/application%20From.html");  // Replace with actual URL or local path

         // Loop through each data set and fill the form
         for (String[] data : candidateData) {
             // Fill in the Candidate Name
             WebElement candidateNameField = driver.findElement(By.id("candidateName"));
             candidateNameField.clear();
             candidateNameField.sendKeys(data[0]);

             // Fill in the Father's Name
             WebElement fatherNameField = driver.findElement(By.id("fatherName"));
             fatherNameField.clear();
             fatherNameField.sendKeys(data[1]);

             // Fill in the Mother's Name
             WebElement motherNameField = driver.findElement(By.id("motherName"));
             motherNameField.clear();
             motherNameField.sendKeys(data[2]);

             // Select Gender from Dropdown
             WebElement genderDropdown = driver.findElement(By.id("gender"));
             Select genderSelect = new Select(genderDropdown);
             genderSelect.selectByVisibleText(data[3]);

             // Select Date of Birth (Age) using the calendar input
             WebElement dobField = driver.findElement(By.id("dob"));
             dobField.clear();
             dobField.sendKeys(data[4]);  // Date format: YYYY-MM-DD

             // Upload a Photo/Signature (replace with valid file path)
             WebElement photoUploadField = driver.findElement(By.id("photo"));
             photoUploadField.sendKeys(data[5]);  // Replace with valid file path

             // Submit the form
             WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
             submitButton.click();

             // Print message to indicate form submission for the current data set
             System.out.println("Form submitted for: " + data[0]);

             // Optionally, add some wait time between submissions to avoid issues with rapid submission
             Thread.sleep(2000);  // Wait 2 seconds before next submission
         }

         // Print message to indicate all forms have been submitted
         System.out.println("All forms submitted successfully!");

     } catch (WebDriverException | InterruptedException e) {
         // Handle any exceptions if they occur
         System.out.println("Error occurred: " + e.getMessage());
     } finally {
         // Close the browser after the task is done
         driver.quit();
     }
 }
}

