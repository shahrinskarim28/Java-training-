package seliniumpackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chromedriver", "/Users/tukashasgoldie/Downloads/chromedriver");
ChromeDriver BrowserDriver = new ChromeDriver();
BrowserDriver.get("https://www.google.com/");




//pass the value to search in search button
BrowserDriver.findElement(By.name("q")).sendKeys("Selenium python");
BrowserDriver.findElement(By.name("btnK")).submit();
	}

}

// why chromedriver instead of driver?
//trouble with pass the value to search