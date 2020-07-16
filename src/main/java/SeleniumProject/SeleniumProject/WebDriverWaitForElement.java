package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/");
		
		By email=By.id("username");
		By password=By.id("password");
		By loginBtn=By.id("loginBtn");
		waitForElementtoPrescence(driver,10,email).sendKeys("vcshukla");
		
		
		
		//driver.findElement(email).sendKeys("vcshukla");
		driver.findElement(password).sendKeys("shukla");
		waitForElementtoPrescence(driver,5,loginBtn).click();
				  
	}

public static WebElement waitForElementtoPrescence(WebDriver driver,int timeUnit,By locator) {
	WebDriverWait wait=new WebDriverWait(driver,timeUnit);
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
	
	
}


}





