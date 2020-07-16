package SeleniumProject.SeleniumProject;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPageSearch {
     public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.name("search_query")).sendKeys("dress");
		
		////div[@class='ac_results']/ul/li
		Thread.sleep(4000);
		By locator=By.xpath("//div[@class='ac_results']/ul//li");
		
		
		//System.out.println("no of element "+searchList.size());
		
		
		getResult(locator,"Summer Dresses > Printed Summer Dress");
		
		
		
		
		
		
		
		Thread.sleep(5000);
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
	}
	
	public static void getResult(By locator,String value) {
		java.util.List<WebElement> searchList=driver.findElements(locator);
		for(int i=0;i<searchList.size();i++)
		{
			System.out.println(searchList.get(i).getText());
			if(searchList.get(i).getText().equals(value)) {
				searchList.get(i).click();
				break;
			}
		}
		
		
		
		
		
		
		
	}
	
	
	
	

}
