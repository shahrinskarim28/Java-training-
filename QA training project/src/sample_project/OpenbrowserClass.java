package sample_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenbrowserClass {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver" );
		
		// Create the object of the chromedriver browser 
	      WebDriver driver = new ChromeDriver();
	        
		// pass the link of website in get method 
	      driver.get("https://practice.automationtesting.in/");
	      
	      // testing Shop link and Home link:
	      driver. findElement(By.linkText("Shop")).click();
	      driver.findElement(By.linkText("Home")).click();
	      
	       
	      //testing there's 3 sliders or not
	      //driver . findElement( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();
	     
	   

          //testing all images of arrivals working or not
	      driver . findElement( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
	      driver . findElement( By . xpath("//*[@id=\"site-logo\"]/a/img")).click();	     
	      
	      
	      //slide 2
	      //driver . findElement( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img")).click();
	      //driver.navigate().back();
	      //System.out.println("this is " + driver.getTitle() + " website");
	      //System.out.println("url is: " + driver.getCurrentUrl());
	      //slide 3
	      //driver . findElement( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/h3")).click();
	      //driver.navigate().back();
	      //System.out.println("this is " + driver.getTitle() + " website");
	      //System.out.println("url is: " + driver.getCurrentUrl());
	    //*[@id="themify_builder_content-22"]/div[2]/div/div/div/div/div[1]
	      
	   
	      
	      
	    
	   

	
	        
	   
	  
	    
	}

}
