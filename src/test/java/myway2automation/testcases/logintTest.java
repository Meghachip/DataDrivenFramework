package myway2automation.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import myway2automation.base.BaseTest;


public class logintTest extends BaseTest{ 
	
	
	@BeforeTest()
	public void setUp() {
		initialization();	
		
	}

	@Test
	public void doLoginTest() {
		
		logger.debug("login");
		logger.info("iing");
	}
	


}
