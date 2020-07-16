package SeleniumProject.SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	

	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	
	}
	
	
	public WebElement getElement(By locator) {
		
		WebElement element=null;
		try {
			element=driver.findElement(locator);
		} catch (Exception e) {
			System.out.println("Element could not find "+locator);
		}
		
		return element;
		
	}
	
	
	public void doClick(By locator) {
		
		getElement(locator).click();
	}

	public void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
		
	}
	
	public void doSelectVisibleText(By locator,String value) {
		
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
		
	}
	
	public  void doSelectVisbleByText(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	
	
	
	 
	
	public void doSelectEmp(By locator,String value) {
		List<WebElement> noOfEmp=driver.findElements(locator);
		for(int i=0;i<noOfEmp.size();i++) {
			String text=noOfEmp.get(i).getText();
			if(text.equals(value)) {
				noOfEmp.get(i).click();
				break;
			}
			
		}
	}	
	
	
	
	

}
