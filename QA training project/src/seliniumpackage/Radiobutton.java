package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
			// Set the path of chromeDriver browser
			System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");
			
			// Intialize value to the chromeDriver browser
	       		 WebDriver browserDriver = new ChromeDriver();
			// pass the link of website 
		        browserDriver.get("http://training.qaonlinetraining.com/testPage.php");
		        // now we will save the locator of element in WebElement object .
		        //radio option female
		        WebElement radioButtonFemale = browserDriver.findElement(By.xpath("//input[@value='female']"));
			// radio option male
		        WebElement radioButtonMale = browserDriver.findElement(By.xpath("//input[@value='male']"));
			// radio option Other
		        WebElement radioButtonOther = browserDriver.findElement(By.xpath("//input[@value='Other']"));
		        // submit button
		        WebElement submitButton = browserDriver.findElement(By.xpath("//input[@value='Send']"));
			
			// perform click on the element in webpage
		        radioButtonFemale.click();
		      //Thread is a class in java used to hold a part of code for some given time using sleep method. 
		        Thread.sleep(6000);
		        radioButtonMale.click();
		        submitButton.click();
		       
	}

}
