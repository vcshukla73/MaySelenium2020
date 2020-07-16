package SeleniumProject.SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoScriptLink {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		
		driver.get("https://www.staples.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> linklist=driver.findElements(By.xpath("//*[@id=\'footerContainer\']/div[2]/div/div/div[1]/div/div[1]/div[2]//div[@class=\'top-bar__subMenuLink\']/a"));
		
		  System.out.println("Total no of links "+linklist.size()  );
		  
	  
		  for(int i=0;i<linklist.size();i++ ) {
				

			  System.out.println(linklist.get(i).getText());
			  linklist.get(i).click();
			  driver.navigate().back();
			  linklist=driver.findElements(By.xpath("//*[@id=\'footerContainer\']/div[2]/div/div/div[1]/div/div[1]/div[2]//div[@class=\'top-bar__subMenuLink\']/a"));
 
			  
		  }
		  
		
		
		
		
		
		
		
	}

}
