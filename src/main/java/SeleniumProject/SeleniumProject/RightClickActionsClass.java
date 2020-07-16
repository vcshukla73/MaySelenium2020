package SeleniumProject.SeleniumProject;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub  context-menu-one btn btn-neutral


		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions ac=new Actions(driver);
		
		ac.contextClick(rightClick).perform();
		
		Thread.sleep(3000);
		
		java.util.List<WebElement> rightClick1=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']"
				+ "/li[contains(@class,'context-menu-icon')]"));
		
		System.out.println(rightClick1.size());
		
		for(int i=0;i<rightClick1.size();i++) {
			String text=rightClick1.get(i).getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				rightClick1.get(i).click();
				break;
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
