package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C://selenium web drivers/geckodriver.exe");

		// Navigate to the specified URL
		String baseUrl = "http://www.facebook.com";
		driver.get(baseUrl);
		
		String tagName = driver.findElement(By.id("email")).getTagName();
		
		System.out.println(tagName);
		driver.close();
		System.exit(0);
		
		
	}

}
