package seliniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceloginclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Browsedriver;
System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");

Browsedriver = new ChromeDriver();
Browsedriver.get("https://admin-demo.nopcommerce.com/login");
	}

}
