package TestNGSecession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	//BS
	//BT
	//BC
	//BM
			//TC1
	//AM
	//BM
			//TC2
	//AM
	//AC
	//AT
	//AS
//	before suitecreate user in DB
//	before test upload user details
//	before class launch browser and url
//	before method login
//	Verify user login
//	after method logout
//	before method login
//	Verify user pw
//	after method logout
//	after class -- close the browser
//	after Test delete user from db
//	PASSED: verifyUserTest
//	PASSED: verifyUserPw
//	aftersuite -- disconnect from dv
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suitecreate user in DB");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test upload user details");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class launch browser and url");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method login");
	}
	@Test(priority=1)
	
	public void verifyUserTest() {
		System.out.println("Verify user login");
		int i=9/0;
	}
	
	
	@Test(priority=2)
	public void verifyUserPw() {
		System.out.println("Verify user pw");
		
	}
	@AfterMethod
	public void logout() {
		System.out.println("after method logout");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class -- close the browser");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after Test delete user from db");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite -- disconnect from dv");
	}
	
	
	
	
	
	
	
	
	

}
