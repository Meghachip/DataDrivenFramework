package myway2automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import myway2automation.base.BaseTest;

public class LoginPage extends BaseTest{
	
	
	@FindBy(xpath="//*[@class='nav navbar-nav navbar-right']/li[3]")
	WebElement loginBtn;
	
	
	@FindBy(id ="email")
	WebElement userNameField;
	
	
	@FindBy(id="password")
	WebElement passwordText;
	

	@FindBy(name="commit")
	WebElement submitBtn;
	

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateLogin() {
		 loginBtn.click();
		 userNameField.sendKeys("meghachip@gmail.com");
		 passwordText.sendKeys("Goalsetter#2022");
		 submitBtn.click();
		
	}
	
	
	
	
	
	

}
