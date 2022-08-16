package seliniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver" );
		
		// Create the object of the chromedriver browser 
	        WebDriver browserobject = new ChromeDriver();
	        
		// pass the link of website in get method 
	        browserobject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    	
	        String eTitle = "Google";
	        
	        browserobject.get("https://www.google.com/");
	        
	        // to maximize the briowser window:
	        
	        browserobject.manage().window ().maximize() ; 
	        String etitle = browserobject.getTitle(); 
	        if (eTitle.equals(eTitle))
	    	{
	    	System.out.println( "Test Passed") ;
	    	}
	    	else {
	    	System.out.println( "Test Failed" );
	    	browserobject.close();
	    	}
	}

	
		
	}


