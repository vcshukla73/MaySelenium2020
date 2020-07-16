package SeleniumProject.SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		if(text.equals("Please enter a valid user name")) {
			  System.out.println("correct alert message");
			 
		}else
		{
			  System.out.println("incorrect alert message");
		}
	  alert.accept();
	driver.switchTo().defaultContent();
	
	  
		
		
		
		
		
		
		
		
	}

}
