package SeleniumProject.SeleniumProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
				
		WebDriverLibrary wfl=new WebDriverLibrary();
		WebDriver driver=wfl.launchBrowser("chrome");
		driver.manage().window().maximize();
		wfl.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(wfl.getPageTitle());
		
		By domain=By.id("Form_submitForm_subdomain");
		By fname=By.name("FirstName");
		By lname=By.name("LastName");
		By email=By.name("Email");
		By jobTitle=By.name("JobTitle");
		By company=By.name("CompanyName");
		By phoneNumber=By.name("Contact");
		By noOfempl=By.id("Form_submitForm_NoOfEmployees");
		By industry=By.id("Form_submitForm_Industry");
		By country=By.id("Form_submitForm_Country");
		By state=By.id("Form_submitForm_State");
		By dummyData=By.id("Form_submitForm_SetDummyData");
		
		ElementUtil el=new ElementUtil(driver);
		el.doSendKeys(domain, "staples.com");
		el.doSendKeys(fname, "Vaibhav");
		el.doSendKeys(lname, "Shukla");
		el.doSendKeys(email, "vcshukla@yahoo.com");
		el.doSendKeys(jobTitle, "Manager");
		el.doSelectVisibleText(noOfempl, "76 - 100");
		//el.doSelectEmp(noOfempl, "76 - 100");
		el.doSendKeys(company, "IBM");
		el.doSelectVisibleText(industry, "Education");
		el.doSendKeys(phoneNumber, "646-288-3185");
		el.doSelectVisibleText(country, "United States");
		Thread.sleep(5000);
		el.doSelectVisibleText(state, "New York");
		el.doClick(dummyData);
		
	

	
	}
	
	
}
