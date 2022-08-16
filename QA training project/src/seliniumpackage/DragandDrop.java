package seliniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/tukashasgoldie/Downloads/chromedriver");
		ChromeDriver browserDriver = new ChromeDriver();
		
	browserDriver.get("http://jqueryui.com/droppable/");
	browserDriver.switchTo().frame(0);
	WebElement source = browserDriver.findElement(By.xpath("//div[@id='draggable']"));
    WebElement target = browserDriver.findElement(By.xpath("//div[@id='droppable']"));
    
    System.out.println("opening page...perform drag and drop");
    Thread.sleep(3000);
    
    Actions act = new Actions(browserDriver);
    act.dragAndDrop(source, target).build().perform();
    System.out.println("drag N drop Done...");
    Thread.sleep(3000);
    browserDriver.close();
   
	}

}
