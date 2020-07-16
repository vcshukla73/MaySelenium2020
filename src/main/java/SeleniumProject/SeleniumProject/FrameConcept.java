package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept {

	//http://londonfreelance.org/courses/frames/index.html
		
		
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver =new  ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://londonfreelance.org/courses/frames/index.html");
			//driver.switchTo().frame("main");
			//driver.switchTo().frame(2);
			driver.switchTo().frame(driver.findElement(By.name("main")));
			
			WebElement header=driver.findElement(By.cssSelector("body > h2"));
			System.out.println(header.getText());
			
		
		
		
		
		
	}

}
