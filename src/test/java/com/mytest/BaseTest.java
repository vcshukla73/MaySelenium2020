package com.mytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	String browsername="chrome";
	
    @org.testng.annotations.Parameters("browser")
    @BeforeMethod
	public void setup(String browsername) {
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		
		}else if(browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		} else
		{
		   System.out.println("please pass correct browser....");
		}
		driver.get("https://classic.crmpro.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	

}
