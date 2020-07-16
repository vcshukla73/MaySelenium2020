package SeleniumProject.SeleniumProject;

public class YahooLoginPage {

	public static void main(String[] args) {

		WebDriverLibrary Yah = new WebDriverLibrary();
		
		Yah.launchBrowser("chrome");
		
		Yah.launchUrl("https://www.yahoo.com/");
		System.out.println("Page Title "+Yah.getPageTitle());
		System.out.println("Current URL :"+Yah.getPageCurrentUrl());
		
		
		
		
		
		
		
		
	}

}
