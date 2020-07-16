package SeleniumProject.SeleniumProject;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		java.util.List<WebElement> fooTerList1=driver.findElements(By.cssSelector("ul.footer-nav>li"));
		java.util.List<WebElement> fooTerList=driver.findElements(By.xpath("//ul[@class='footer-nav']/li/a"));
		
		for(int i=0;i<fooTerList.size();i++) {
			
			System.out.println(i+"  Xpath   "+fooTerList.get(i).getText());
			System.out.println(i+"  CSS   "+fooTerList.get(i).getText());
		}
		
		
		
		
		

	}

}
