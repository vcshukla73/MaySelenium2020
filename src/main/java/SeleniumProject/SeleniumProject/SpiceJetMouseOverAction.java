package SeleniumProject.SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetMouseOverAction {

	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver =new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		WebElement loingLink=driver.findElement(By.className("link"));
		WebElement memberLink=driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[15]/ul/li[2]/a"));
		//WebElement memberLink=driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[15]/ul/li[2]/ul/li[1]/a"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(loingLink).perform();
		ac.moveToElement(memberLink).perform();
		
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
	}

}
