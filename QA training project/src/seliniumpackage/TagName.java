package seliniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webDriver.chromedriver", "/Users/tukashasgoldie/Downloads/chromedriver");
ChromeDriver browserdriver= new ChromeDriver();
browserdriver.get("https://www.itlearn360.com/");
int count = 0;

// FindElements is used to get multiple elements 
List<WebElement> allLinks = browserdriver.findElements(By.tagName("a"));
for (WebElement link : allLinks) {
    // print the each url 
    System.out.println(link.getAttribute("href"));
    count ++;
    
}
// Print the total numbers of links
System.out.println("total number of links present: "+count);

// close the driver
browserdriver.close();
	}

}
