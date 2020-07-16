package SeleniumProject.SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaplesLink {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		String accountLink = "//div[@class='login_sec2']//div[1]//a[1]";
		String profileNamePlace = "//*[@id='dLabel']/span";
		
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass");
		driver.findElement(By.xpath("//button[@id='jqLogin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(profileNamePlace)).click();
		driver.findElement(By.xpath(accountLink)).click();
		driver.findElement(By.xpath("//*[@id=\"seller_approval\"]")).click();
		
		
		
		Thread.sleep(5000);
		List<WebElement> linklist=driver.findElements(By.xpath("//div[@class='links_container']//div[@align='left']/a"));
		
		
		  System.out.println("Total no of links "+linklist.size()  );
		  
	  
		  for(int i=0;i<linklist.size();i++ ) {
				

			  System.out.println(linklist.get(i).getText());
			  linklist.get(i).click();
			 // Thread.sleep(9000);
			  driver.navigate().back();
			  linklist=driver.findElements(By.xpath("//div[@class='links_container']//div[@align='left']/a"));
			  System.out.println("Total no of links "+linklist.size()  );
			  
			  
			  

 
			  
		  }
		
		
		
		
		
	}

}
