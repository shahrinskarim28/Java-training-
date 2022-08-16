package seliniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","/Users/tukashasgoldie/Downloads/chromedriver");
		
		
	ChromeDriver browserDriver = new ChromeDriver();
		
	
   browserDriver.get("http://training.qaonlinetraining.com/testPage.php");
   
   browserDriver.findElement(By.id("alert")).click();
   Alert alert = browserDriver.switchTo().alert();
   System.out.println(alert.getText());
   Thread.sleep(6000);
   
   // alert accept
   alert.accept();
   //to dismiss the alert :
   
   browserDriver.findElement(By.id("confirm")).click();
   Alert alert1 = browserDriver.switchTo().alert();
   System.out.println(alert1.getText());
   Thread.sleep(6000);
   alert1.dismiss();
   
   // to send value to the input box inside alert
   browserDriver.findElement(By.id("prompt")).click();
   Alert alert2 = browserDriver.switchTo().alert();
   System.out.println(alert2.getText());
   Thread.sleep(6000);
   alert2.sendKeys("Mr. Bond");
   alert2.accept();
	}

}
