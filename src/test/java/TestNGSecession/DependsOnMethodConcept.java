package TestNGSecession;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest()
	{
		System.out.println("home page test");
	}
	@Test(dependsOnMethods="loginTest")
	public void dealsPageTest() {
		System.out.println("deals Test");
	}
	
	
	

}
