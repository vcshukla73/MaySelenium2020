package SeleniumProject.SeleniumProject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSendKeysAndClick {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		By userName=By.id("username");
		By passWord=By.id("password");
		By loginBtn=By.id("loginButton");
		Actions ac=new Actions(driver);
		
		
		
		//ac.sendKeys(driver.findElement(By.id("username")),"aaaaa").perform();
		//ac.sendKeys(getElement(userName),"aaaaa");
		//ac.sendKeys(getElement(userName), "aaa");
		doActionsSendKeys(userName, "aaa");
		doActionsSendKeys(passWord, "bbb");
		doActions(loginBtn);
		
		
	}
	
	public static WebElement  getElement(By locator)
	{
		WebElement element=driver.findElement(locator);
	     return element;
	   
	}
	public static void doActionsSendKeys(By locator,String Values) {
		   Actions ac=new Actions(driver);
		   ac.sendKeys(getElement(locator),Values).perform();
	}	   
		
	public static void doActions (By locator) {
		Actions ac=new Actions(driver);
		ac.click(getElement(locator)).perform();
	}
	
	

}
