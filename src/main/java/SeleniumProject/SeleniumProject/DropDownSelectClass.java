package SeleniumProject.SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
        String dob="May-20-1973";
		WebDriverManager.chromedriver().setup();
		driver =new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		By month=By.id("month");
		By day=By.id("day");
		By year=By.id("year");
		
		By monthOptions=By.xpath("//select[@id='month']/option");
		By dayOptions=By.xpath("//select[@id='day']/option");
		By yearOptions=By.xpath("//select[@id='year']/option");
		
		dropDownNoSelectClass(driver, monthOptions,dob.split("-")[0]);
		dropDownNoSelectClass(driver, dayOptions,dob.split("-")[1]);
		dropDownNoSelectClass(driver, yearOptions,dob.split("-")[2]);
		
		
//		WebElement month1=driver.findElement(month);
//		Select select1=new Select(month1);
//		select1.selectByVisibleText("May");
//		
//		WebElement day1=driver.findElement(day);
//		Select select2=new Select(day1);
//		select2.selectByVisibleText("4");
//		
//		Select select3=new Select(driver.findElement(year));
//		select3.selectByVisibleText("1973");
//
		
		//doSelectValueByVisiableText(month, "Jun");
		//doSelectValueByVisiableText(day, "31");
		//doSelectValueByIndex(day, 5);
		//doSelectValueByValue(year, "1955");
		//doSelectValueByVisiableText(year, "1905");
		
		
		
		
	}
	
	public static void dropDownNoSelectClass(WebDriver driver,By locator,String value) {
		List<WebElement> optionList=driver.findElements(locator);
		for(int i=0;i<optionList.size();i++) {
			String text=optionList.get(i).getText();
			if(text.equals(value)) {
				 optionList.get(i).click();
				 break;
			}
		}
	}
	
	
	
	
	
	
	public static void doSelectValueByVisiableText(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
		
		
	}
	
	public static void doSelectValueByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
		
		
	}
	
	public static void doSelectValueByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
		
		
		
	}	
	
	
	
	
	public static WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
