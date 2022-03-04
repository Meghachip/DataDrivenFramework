package myway2automation.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import myway2automation.base.BaseTest;
import myway2automation.pages.LoginPage;


public class logintTest extends BaseTest{ 
	
	public LoginPage loginpage;
	
	
	@BeforeTest()
	public void setUp() {
		initialization();	
		loginpage = new LoginPage();
		
	}

	@Test
	public void doLoginTest(){
		logger.debug("login");
		logger.info("iing");
		loginpage.validateLogin();
	}
	


}
