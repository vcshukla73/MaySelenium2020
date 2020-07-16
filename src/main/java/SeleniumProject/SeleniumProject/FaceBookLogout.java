package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogout {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vcshukla@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mcamca");
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/img")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div[1]/div[3]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span]")).click();
		//driver.findElement(By.cssSelector("#jsc_c_55 > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.xpath("(//div[@class='kr520xx4 pedkr2u6 ms05siws pnx7fd3z b7h9ocf4 pmk7jnqg j9ispegn k4urcfbm']//div[@data-visualcompletion='ignore-dynamic'])[7]")).click();
		
		
		///html/body/div[1]/div/div/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div[1]/div[3]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span
		///html/body/div[1]/div/div/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div[1]/div[3]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span
		////a[text()='abhi sahu']//parent::td//preceding-sibling::td/input[@type='checkbox']
		
		///html/body/div[1]/div/div/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div[1]/div[3]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span
		
		driver.close();
		
	}

}
