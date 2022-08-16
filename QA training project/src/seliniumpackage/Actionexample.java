package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");
		// Create the object of driver.
		ChromeDriver driver = new ChromeDriver();
		
		// pass the link of website
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions action = new Actions(driver);   
		
		// Locate the button locator 
	    WebElement rightClickElement = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	    action.contextClick(rightClickElement).build().perform();
	}

}
