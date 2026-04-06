package my_project;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp_dp_change {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	
	        try {
	            // Open WhatsApp Web
	            driver.get("https://web.whatsapp.com/");

	            // Wait for the user to scan the QR code manually
	            System.out.println("Please scan the QR code to log in.");
	            TimeUnit.SECONDS.sleep(20);  // Adjust time based on your speed to scan the QR code

	            // Click the profile icon (menu button in WhatsApp Web)
	            WebElement profileIcon = driver.findElement(By.xpath("//span[@data-icon='menu']"));
	            profileIcon.click();

	            // Click on "Profile" option
	            WebElement profileOption = driver.findElement(By.xpath("//div[@title='Profile']"));
	            profileOption.click();

	            // Wait for the profile page to load
	            TimeUnit.SECONDS.sleep(2);

	            // Click on the profile picture (camera icon) to change it
	            WebElement changeDPButton = driver.findElement(By.xpath("//span[@data-icon='camera']"));
	            changeDPButton.click();

	            // Upload a new image (send the path of the image to the file input)
	            WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
	            String newProfilePicPath = "C:\\path_to_your_image\\your_image.jpg";  // Update this with your image file path
	            uploadInput.sendKeys(newProfilePicPath);

	            // Wait a few seconds for the image to be uploaded
	            TimeUnit.SECONDS.sleep(5);

	            // Optionally, click the "Save" button (if there's one to confirm the upload)
	            // WebElement saveButton = driver.findElement(By.xpath("//button[@title='Save']"));
	            // saveButton.click();

	            System.out.println("Profile picture updated successfully!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}


