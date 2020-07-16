package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrmProHW {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.cssSelector("#navmenu > ul > li:nth-child(4) > a")).click();	
		driver.findElement(By.cssSelector("body > table:nth-child(3) > tbody > tr:nth-child(2) > td:nth-child(1) > div > table > tbody > tr > td:nth-child(4) > a")).click();
		driver.close();
		
		
		
		
		
		
	}

}
