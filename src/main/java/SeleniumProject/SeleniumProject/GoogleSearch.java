package SeleniumProject.SeleniumProject;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("selenium");

		Thread.sleep(2000);

		By suggersionList = By.xpath("//ul[@class='erkvQe']/li//span");

		 suggesionList1(suggersionList,"selenium webdriver");
		//System.out.println(captureList(suggersionList));

	}

	public static void suggesionList1(By locator, String value) {

		java.util.List<WebElement> suggesionList = driver.findElements(locator);

		for (int i = 0; i < suggesionList.size(); i++) {
			if (suggesionList.get(i).getText().equals(value)) {

				suggesionList.get(i).click();
				break;
			}

		}

	}

	public static ArrayList<String> captureList(By locator) {

		java.util.List<WebElement> suggesionList = driver.findElements(locator);
		ArrayList<String> ListOfIteams = new ArrayList<String>();
		for (int i = 0; i < suggesionList.size(); i++) {

			ListOfIteams.add(suggesionList.get(i).getText());

		}
		return ListOfIteams;

	}

}
