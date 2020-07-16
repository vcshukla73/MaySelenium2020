package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		
//	WebDriverManager.firefoxdriver().setup();
//	FirefoxDriver driver=new FirefoxDriver();
		
		
   driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
    
   //Thread.sleep(4000);
   WebElement sourceElement=driver.findElement(By.id("draggable"));
   WebElement targetElement=driver.findElement(By.id("droppable"));
   
   Actions ac=new Actions(driver);
   
   ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
  // ac.dragAndDrop(sourceElement, targetElement).perform();;
   
   
   
   Thread.sleep(4000);
   
   driver.close();
   
   
   
   
   
		
		
		
		
		
		
		
		

	}

}
