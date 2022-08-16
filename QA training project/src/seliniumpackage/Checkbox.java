package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox { 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chromedriver","/Users/tukashasgoldie/Downloads/chromedriver");

WebDriver browserDriver = new ChromeDriver();
browserDriver.get("http://training.qaonlinetraining.com/testPage.php");

WebElement checkboxBoat = browserDriver.findElement(By.xpath("//input[@value='boat']"));
WebElement checkboxBike = browserDriver.findElement(By.xpath("//input[@value='bike']"));
WebElement checkboxCar = browserDriver.findElement(By.xpath("//input[@value='car']"));
WebElement checkboxHorse = browserDriver.findElement(By.xpath("//input[@value='horse']"));
WebElement submitbutton = browserDriver.findElement(By.xpath("//input[@value='send']"));

checkboxBoat.click();
checkboxBike.click();
checkboxHorse.click();
System.out.println("wait 3 seconds and submit and close");
submitbutton.click();

Thread.sleep(3000);
browserDriver.close();
	}

}
