package SeleniumProject.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		System.out.println("Page Title" +doGetPageTitleWithContains(driver,10,"Amazon"));
		System.out.println("Page Title" +doGetPageTitleWithIsTitle(driver,10,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));

		
	}

public static String doGetPageTitleWithIsTitle(WebDriver driver,int timeOut,String title) {
		WebDriverWait wait=new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		
		//System.out.println("page title"+driver.getTitle());	
		return driver.getTitle();
		
}
public static String doGetPageTitleWithContains(WebDriver driver,int timeOut,String title) {
	WebDriverWait wait=new WebDriverWait(driver,timeOut);
	
	wait.until(ExpectedConditions.titleContains(title));
	//System.out.println("page title"+driver.getTitle());	
	return driver.getTitle();
	
}	
	
	
	
	
}
