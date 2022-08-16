package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");
		
		// Intialize value to the chromeDriver browser
        	WebDriver browserDriver = new ChromeDriver();
		// pass the link of website
	        browserDriver.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        Select countrySelect = new Select(browserDriver.findElement(By.name("country")));
	        countrySelect.selectByVisibleText("USA");
	        countrySelect.selectByVisibleText("France");
	        Select skillSelect = new Select(browserDriver.findElement(By.name("skill")));
	        skillSelect.selectByVisibleText("Programming");
	        System.out.println("selectByVisibleText(\"Programming");
	        skillSelect.selectByVisibleText("Database");
	        System.out.println("selectByVisibleText(\"Database");
	        browserDriver.findElement(By.name("submit")).click();
	        System.out.println("Form Fill-up Succesfull");
	        browserDriver.quit();
		
	}

}
