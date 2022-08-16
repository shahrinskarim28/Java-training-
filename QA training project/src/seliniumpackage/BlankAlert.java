package seliniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlankAlert {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver browserDriver;
		
	        System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");
	        browserDriver = new ChromeDriver();
	        
	       browserDriver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	        
	       browserDriver.findElement(By.name("proceed")).click();
	       Alert alert = browserDriver.switchTo().alert();
	       Thread.sleep(6000);
	       
	       System.out.println(alert.getText());
	        alert.accept();
	        browserDriver.close();
	}

}
