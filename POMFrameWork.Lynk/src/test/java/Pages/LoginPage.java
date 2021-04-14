package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() {
	     PageFactory.initElements(driver, this);
	 }
	
	@FindBy(how = How.ID, using = "okta-signin-username") 
	 private WebElement EmailTextBox;
	
	@FindBy(how = How.ID, using = "okta-signin-password") 
	 private WebElement PasswordTextBox;
	
	@FindBy(how = How.ID, using = "okta-signin-submit") 
	 private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Site Home')]") 
	 private WebElement siteHomeBreadCrumb;
	
	public void enterEmail(String email) {
		System.out.println("Enters Email id :"+ email);
		EmailTextBox.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		System.out.println("Enters Password :"+ password);
		PasswordTextBox.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
		

}
