package seliniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver" );
		
		// Create the object of the chromedriver browser 
	        ChromeDriver browserdriver = new ChromeDriver();
	        
		// pass the link of website in get method 
	        browserdriver.get("http://www.amazon.com/");
	}

}
