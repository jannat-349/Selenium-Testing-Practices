package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.gecko.driver", "C://selenium web drivers/geckodriver.exe");

		// Navigate to the specified URL
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);

		// Get the actual title from the web page
		String actualTitle = driver.getTitle();

		// Define the expected title
		String expectedTitle = "Welcome: Mercury Tours";

		// Compare actual and expected titles
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}

		driver.quit();

	}

}
