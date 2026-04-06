package my_project;

public class Youtube {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://10.100.10.10:8080/parbon_erp/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	try:
	   // Open YouTube
	    driver.get('https://www.youtube.com')
	    
	    // Wait for the page to load
	    time.sleep(2)

	    //Find the search box element on the page
	    search_box = driver.find_element(By.NAME, 'search_query')
	    
	   // Type the search query into the search box
	    search_box.send_keys('How to see moon face')
	    
	 // Simulate pressing the Enter key to start the search
	    search_box.send_keys(Keys.RETURN)
	 // Wait for the search results to load
	    time.sleep(3)
	    
//	 //  Find the first video in the search results and click it
//	    first_video = driver.find_element(By.XPATH, '//*[@id="video-title"]')
//	    first_video.click()
//
//	 //  Wait for the video to load and play
//	    time.sleep(5)
	    
	 //  Optionally, if you want to wait for the video to finish, you can increase the sleep time
	 // 
	except Exception as e:
	    print(f"An error occurred: {e}")
	finally:
	    # Close the browser after a delay (e.g., 10 seconds)
	    time.sleep(10)
	    driver.quit()
	}
}
