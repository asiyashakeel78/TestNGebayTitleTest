package titleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayVerifyTitle {
	@Test
	public void titleTest() {
	       WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        // Navigate to eBay
	        driver.get("https://www.ebay.com/");

	        // Get the actual title of the page
	        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	        String actualTitle = driver.getTitle();

	        // Assert that the actual title matches the expected title
	        Assert.assertEquals(expectedTitle, actualTitle);

	        // Delay the process for 5 seconds (5000 milliseconds)
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Quit the WebDriver session and close all browser windows
	        driver.quit();
	    }
	}