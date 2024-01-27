package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C://selenium web drivers/geckodriver.exe");

		// Navigate to the specified URL
		String baseUrl = "http://www.facebook.com";
		driver.get(baseUrl);
		
		WebElement myElement = driver.findElement(By.id("email"));
		
		myElement.sendKeys("Jannat");
		
		System.out.println(myElement);
		driver.close();
		System.exit(0);
		

	}

}
