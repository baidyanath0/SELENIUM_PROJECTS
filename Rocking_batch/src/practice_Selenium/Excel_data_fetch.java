package practice_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_data_fetch {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://10.100.10.10:8080/p4_projects/secondary/landing-page");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//a[.='Class 9 Registration Portal']")).click();
	driver.findElement(By.name("school_id")).sendKeys("20130101611");
	driver.findElement(By.name("password")).sendKeys("358Z6NYQ9G");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[.='Login']")).click();

	driver.findElement(By.xpath("//a[@href='http://10.100.10.10:8080/p4_projects/secondary/add-student-9']"))
			.click();
	

	// Load the Excel file
	df = pd.read_excel('user_data.xlsx', sheet_name='Sheet1')

	// Initialize the WebDriver
	driver = webdriver.Chrome(executable_path='path/to/chromedriver')

	// Open the web page with the form
	driver.get('https://example.com/form')

	// Iterate over the DataFrame to fill the form for each user
	for index, row in df.iterrows():
	    # Fill the form fields with data from the DataFrame
	    name_field = driver.find_element(By.NAME, 'name') // Adjust the name attribute
	    email_field = driver.find_element(By.NAME, 'email')  // Adjust the name attribute
	    password_field = driver.find_element(By.NAME, 'password') //Adjust the name attribute

	    // Send the data to the form fields
	    name_field.clear()
	    name_field.send_keys(row['Name'])//Adjust column name as needed
	    email_field.clear()
	    email_field.send_keys(row['Email'])  // Adjust column name as needed
	    password_field.clear()
	    password_field.send_keys(row['Password']) // Adjust column name as needed

	    // Submit the form (adjust the button name as needed)
	    submit_button = driver.find_element(By.NAME, 'submit')  // Adjust the name attribute
	    submit_button.click()

	    // Wait for the page to load after submission (adjust time as necessary)
	    time.sleep(2)  //Adjust based on the website's response time

	    // Optionally, navigate back to the form page if necessary
	    driver.get('https://example.com/form')

	// Close the browser
	driver.quit()

}}
