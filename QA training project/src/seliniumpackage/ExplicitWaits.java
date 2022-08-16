package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// 1. setup the property of WebDriver to perform "Explicit Wait" through chrome web browser.
			System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");
			// 2. Initialize WebDriver object through ChromeDriver class.
		        WebDriver browserObject = new ChromeDriver();
		        
		     // Explicit Wait is applied to element in the webpage
		        WebDriverWait Wait = new WebDriverWait (browserObject, 10);
		        
		        browserObject.get("http://google.com" );
		        // mximizes the browser window
		        
		        WebElement gmailLink;
		        gmailLink= Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Gmaileeee')]")));
		        gmailLink.click();
		        browserObject.quit();
	}

}
