package StepDefinitions;

import Pages.SiteHomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SiteHomeSteps {
	
	SiteHomePage siteHomePage;
	
	@When("^Site Name is WWMG$")
	public void site_Name_is_WWMG() throws Throwable {
		siteHomePage = new SiteHomePage();
		siteHomePage.checkSiteNames();
	}
	
	@Then("^Click the Site Tile of WWMG$")
	public void click_the_Site_Tile_of_WWMG() throws Throwable {
		siteHomePage = new SiteHomePage();
		siteHomePage.clickTileImage("WWMG");
	}

	@Then("^Check the Trial Home of WWMG is Displayed$")
	public void check_the_Trial_Home_of_WWMG_is_Displayed() throws Throwable {
	    
	}
	
	


}
