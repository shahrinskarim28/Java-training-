package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fillform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    WebDriver browserDriver;
	  // Set the path of chromeDriver browser
	    System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");
		
	    // Create the object of the chromeBrowser driver
	    browserDriver = new ChromeDriver();
	    // opening website for form fill up
	    browserDriver.get("http://www.training.qaonlinetraining.com/testPage.php");
	    
	    // sending text to the input box in the web form--------------
	    // Locate the element using name locator  and pass  the value to the name section using sendKeys method
	    browserDriver.findElement(By.name("name")).sendKeys("DemoName");
	 
	    //Locate the element using name locator  and pass  the value to  E mail section using sendKeys method 
	    browserDriver.findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
	    
	    //Locate the element using name locator  and pass  the value to  Website section using sendKeys method
	    browserDriver.findElement(By.name("website")).sendKeys("www.demosite.com");
	    
	    ///Locate the element using name locator  and pass  the value to  Comment section using sendKeys method
	    browserDriver.findElement(By.name("comment")).sendKeys("it is good");
	    
	   ///perform click on submit button
	    browserDriver.findElement(By.name("submit")).click();
	}

}
