package myway2automation.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import myway2automation.rough.Log4jDemo;


public class BaseTest {
	public static Properties config;
	public static Properties prop;
	public static FileInputStream fin;
	public static FileInputStream fis;
	public static WebDriver driver;
	//public static Reporter report;
	public static Logger logger = LoggerFactory.getLogger(BaseTest.class);
	
	
	
	public BaseTest() {


		if (driver == null) {

			try {
				config = new Properties();
				fin = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}

			try {
				config.load(fin);
			
				logger.debug("loading");
				logger.info("loading");
				logger.error("error");
			} catch (IOException e) {

				e.printStackTrace();
			}

			try {
				prop = new Properties();
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\prop.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				prop.load(fin);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
		
		public void initialization() {

		String browserName = config.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chrome99.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.IE.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		driver.get(config.getProperty("baseURL"));
		Reporter.log("Navigating to the URL");
		Reporter.log("<a target =\"_blank\" href=\"C:\\Users\\malam\\error.jpg\">Screenshot></a>");
		Reporter.log(
				"<a target =\"_blank\" href=\"C:\\Users\\malam\\error.jpg\"><img src = \"C:\\Users\\malam\\error.jpg\"></img></a>");

		driver.manage().window().maximize();
	}
	

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
