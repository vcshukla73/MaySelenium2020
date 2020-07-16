package SeleniumProject.SeleniumProject;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EspnCricInfoParentToChildXpath {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.espncricinfo.com/series/14222/scorecard/299004/pakistan-vs-south-africa-1st-test-south-africa-tour-of-pakistan-2007-08");
		selectBowlerName("A Nel");
		System.out.println(captureList("A Nel"));

	}

	public static void selectBowlerName(String name) {
		String bowlName = driver
				.findElements(By.xpath("(//a[text()='" + name + "'])[1]//ancestor::td//following-sibling::td")).get(0)
				.getText();
		System.out.println("Bowler Name " + bowlName);

	}

	public static ArrayList<String> captureList(String name) {

		java.util.List<WebElement> suggesionList = driver
				.findElements(By.xpath("(//a[text()='" + name + "'])[1]//ancestor::td//following-sibling::td"));
		ArrayList<String> ListOfIteams = new ArrayList<String>();
		for (int i = 0; i < suggesionList.size(); i++) {

			ListOfIteams.add(suggesionList.get(i).getText());

		}
		return ListOfIteams;

	}
}
