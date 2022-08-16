package testNG;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependancyClass {
	WebDriver browserDriver;
	@Test
   	 public void openingAmazonSite() throws InterruptedException {
        // 2. setup the property of WebDriver to set the dependency of method through chrome web browser
        System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");
	// 3. Initialize WebDriver object through ChromeDriver class.
        browserDriver = new ChromeDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
	// 4. Open the web page http://www.amazon.com/ in first test case 
        browserDriver.get("http://www.amazon.com/");
	// 5. Thread.sleep is used to hold the part of code for given time limit.
        Thread.sleep(2000);
        browserDriver.close();
        
     // 7. In next method to set the dependency use dependOMethods and pass the method name depended to.
        
        @Test(dependsOnMethods ="openingAmazonSite")
      
        public void openingCNBCSite() throws InterruptedException {
    	// 2. setup the property of WebDriver to set the dependency of method through chrome web browser
            System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");
    	// 3. Initialize WebDriver object through ChromeDriver class.
            browerObject = new ChromeDriver();
            System.out.println("Open /close  cnn.com in chrome browser");
    	// 4. Open the web page http://www.cnn.com/ in first test case 
            browerObject.get("https://www.cnbc.com/");
    	// 5. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
            Thread.sleep(2000);
    	 // 6. close the browser
            browerObject.close();
            
            
        }
}
}