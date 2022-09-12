package arrival_image_desc;

public class Webtest_id05 {

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
	     
	   
          //testing all images of arrivals working or not
	      
	      //slide 1
	      driver . findElement( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
	      driver . findElement( By . xpath("//*[@id=\"site-logo\"]/a/img")).click();	     
	      
	      //slide 2
	      driver . findElement( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img")).click();
	      driver . findElement( By . xpath("//*[@id=\"site-logo\"]/a/img")).click();
	      
	      //slide 3
	      driver . findElement( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[1]/img")).click();
	      driver . findElement( By . xpath("//*[@id=\"site-logo\"]/a/img")).click();
	      
	     // Testing Click on the "add to basket" button adds or not:
	      driver . findElement ( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[2]")).click();
	      driver . findElement ( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[2]")).click();
	      driver.findElement(By.linkText("Home")).click();
	      driver . findElement ( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[2]")).click();
	      
	      // Clicking on Clicking on Description tab for the book you clicked on works or not.
	      //for slide 1
	      driver . findElement( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
	      driver . findElement( By . xpath("//*[@id=\"product-160\"]/div[3]/ul/li[1]")).click();
	      driver . findElement( By . xpath("//*[@id=\"tab-description\"]")).click();
	      driver.findElement(By.xpath ("//*[@id=\"site-logo\"]/a")).click();
	     
	      //for slide 2
	      driver . findElement( By . xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img")).click();
	      driver . findElement( By . xpath("//*[@id=\"product-163\"]/div[3]/ul/li[1]/a")).click();
	      driver . findElement( By . xpath("//*[@id=\"tab-description\"]/div/div/div/p")).click();
	      driver.findElement(By.xpath ("//*[@id=\"site-logo\"]/a")).click();
	      
	      //for slide 3
	      driver . findElement( By . xpath("//*[@id=\\\"text-22-sub_row_1-0-2-2-0\\\"]/div/ul/li/a[1]/img")).click();
	      driver . findElement( By . xpath("//*[@id=\"product-165\"]/div[3]/ul/li[1]")).click();
	      driver . findElement( By . xpath("//*[@id=\"tab-description\"]/div/div/div/p")).click();
	      driver.findElement(By.xpath ("//*[@id=\"site-logo\"]/a")).click();
	      
	      
	       // menu items wither the price list of books are showing or not
	       driver. findElement(By.linkText("//*[@id=\"wpmenucartli\"]/a/i")).click();
	}

}
