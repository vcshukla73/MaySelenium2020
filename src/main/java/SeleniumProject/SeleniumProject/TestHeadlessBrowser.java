package SeleniumProject.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHeadlessBrowser {

	public static void main(String[] args) {
		
		//FireFox Browser Setup
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver=new FirefoxDriver(fo);
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		System.out.println("Current Page Title "+driver.getTitle());
		System.out.println("Current page urt "+driver.getCurrentUrl());
		
		
		
		
		// Chrome Browser Setup
//			WebDriverManager.chromedriver().setup();
//			ChromeOptions co=new ChromeOptions();
//			co.addArguments("--headless");
//			WebDriver driver =new  ChromeDriver(co);
			
			
			
			
	}

}
