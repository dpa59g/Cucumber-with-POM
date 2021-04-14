package StepDefinitions;

import Pages.LoginPage;
import Pages.SiteHomePage;
import Util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LoginSteps extends TestBase {
	
	LoginPage loginPage ;
	SiteHomePage siteHomePage;
	
	@Given("^user lauches the browser and Enter the Lynk Url$")
	public void user_lauches_the_browser_and_Enter_the_Lynk_Url() throws Throwable {
	   TestBase.initialization();
	}

	@Then("^user enter valid username and password and click on the login button$")
	public void user_enter_valid_username_and_password_and_click_on_the_login_button() throws Throwable {
		loginPage = new LoginPage();
		loginPage.enterEmail(prop.getProperty("username"));
		loginPage.enterPassword(prop.getProperty("password"));
		loginPage.clickLoginButton();
		
	}

	@Then("^Site Home should be displayed$")
	public void site_Home_should_be_displayed() throws Throwable {
		siteHomePage = new SiteHomePage();
		String bc = siteHomePage.checkSiteHomeDisplayed();
		if(bc.contains("Site Home")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	    
	}
}
