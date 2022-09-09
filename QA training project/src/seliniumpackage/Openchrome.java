package seliniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {

	public static void main(String[] args) {
		
		 WebDriver browserDriver;
		
		    System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");
	
		    browserDriver = new ChromeDriver();
		
		    browserDriver.get("http://www.amazon.com");
	
	}

}
