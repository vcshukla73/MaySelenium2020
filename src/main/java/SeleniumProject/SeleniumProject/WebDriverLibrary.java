package SeleniumProject.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverLibrary {

	public WebDriver driver;

	/**
	 * This method is used to launch the browser on the basic of given browser name
	 * 
	 * @param browser
	 * @return
	 */

	public WebDriver launchBrowser(String browser) {
		System.out.println("Browser value is "+browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();

		} else {
			System.out.println("Please pass the corect browser " + browser);
		}
		return driver;

	}

	/**
	 * this is used for launch browser
	 * 
	 * @param url
	 */

	public void launchUrl(String url) {
		driver.get(url);
	}

	/**
	 * this is used for get page title
	 * 
	 * @return
	 */

	public String getPageTitle() {
		return driver.getTitle();

	}

	/**
	 * this is used for get current url
	 * 
	 * @return
	 */
	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();

	}

}
