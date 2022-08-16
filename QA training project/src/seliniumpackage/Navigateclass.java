package seliniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webrdriver, chromedriver","/Users/tukashasgoldie/Downloads/chromedriver");
WebDriver browserdriver = new ChromeDriver ();
browserdriver.get("https://www.facebook.com/");
browserdriver.navigate().to("http://www.instagram.com/");
System.out.println("this is " + browserdriver.getTitle() + " website");
System.out.println("url is: " + browserdriver.getCurrentUrl());
// navigating to another site
browserdriver.navigate().to("http://www.twitter.com/");
System.out.println("this is " + browserdriver.getTitle() + " website");
System.out.println("url is: " + browserdriver.getCurrentUrl());
// navigating back to gmail .com
browserdriver.navigate().back();
System.out.println("this is " + browserdriver.getTitle() + " website");
System.out.println("url is: " + browserdriver.getCurrentUrl());
// navigating back to google .com
browserdriver.navigate().back();
browserdriver.navigate().forward();
System.out.println("this is " + browserdriver.getTitle() + " website");
System.out.println("url is: " + browserdriver.getCurrentUrl());
browserdriver.close();
	}
}
// dont understand from the line #17
