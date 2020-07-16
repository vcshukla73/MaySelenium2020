package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassLocators  {
	 public static  WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		//driver.get("https://app.hubspot.com/login");
	    driver.get("https://login.yahoo.com/");
		
		driver.findElement(By.id("login-username")).sendKeys("vcshukla");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
		driver.findElement(By.id("login-signin")).click();
		
		
		
		
//      WebDriverLibrary Yah = new WebDriverLibrary();
//		
//		Yah.launchBrowser("chrome");
//		
//		Yah.launchUrl("https://app.hubspot.com/login");
		//Thread.sleep(9000);
		
//		WebElement email = driver.findElement(By.id("username"));
//		WebElement password=driver.findElement(By.id("password"));
//		WebElement loginBtn=driver.findElement(By.id("loginBtn"));
//		
//		
//		
//		
//		email.sendKeys("vcshukla@yahoo.com");
//		password.sendKeys("Vaibhav");
//		loginBtn.click();
//		Thread.sleep(3000);
//		
		
		//By email=By.id("username");
		//By password=By.id("password");
		//By loingButton=By.id("loginBtn");
		
//		By email=By.className("login-email");
//		By password=By.xpath("//*[@id=\'password\']");
//		By loginButton=By.cssSelector("#loginBtn");
//		
//				
//				
//		
		
//		driver.findElement(email).sendKeys("vcshukla@yahoo");
//		driver.findElement(password).sendKeys("vaibhav");
//		driver.findElement(loingButton).click();
			
//		getElement(email).sendKeys("vcshukla@yahoo.com");
//		getElement(password).sendKeys("vaibhav");
//		getElement(loingButton).click();
//				
		
		//Thread.sleep(5000);
		
//		doSendKeys(email, "vcshukla@yahoo");
//		doSendKeys(password, "vaohav");
//		doClick(loginButton);		
//		

	}
	
	public static WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
		
	}
	
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
		
	}
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	
	

}
