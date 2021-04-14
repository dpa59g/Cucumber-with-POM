package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class SiteHomePage extends TestBase{

	public SiteHomePage() {
	     PageFactory.initElements(driver, this);
	 }
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Site Home')]")
	private WebElement siteHomeBreadCrumb;
	
	@FindAll(@FindBy(how = How.XPATH, using = "//p-panel/div/div/span"))
	 private List<WebElement> siteNames;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'WWMG Everett Clinic')]")
	private WebElement WWMGTile;
	
	@FindAll(@FindBy(how = How.XPATH, using ="//body/app-root[1]/app-layout[1]/ng-sidebar-container[1]/div[1]/div[1]/section[1]/app-sitehome[1]/div[1]/div[2]/div[1]/div[1]/p-dataview[1]/div[1]/div[2]/div[1]/div[1]/p-panel[1]"))
	private List<WebElement> TileImage;
	
	
	public String checkSiteHomeDisplayed() {
		String breadCrumb = siteHomeBreadCrumb.getText();
		System.out.println("Displayed BreadCrumb is :"+breadCrumb);
		return breadCrumb;
	}
	
	public void checkSiteNames() {
		
		for(int i =0; i<siteNames.size() ;i++) {
			System.out.println("SiteNames are :"+siteNames.get(i).getText());
		}
		
	}
	
	public void clickTileImage(String siteName) {
		for(int i =0; i<siteNames.size() ;i++) {
			System.out.println("Entering into Site : "+siteNames.get(i).getText());
			if(siteNames.get(i).getText().contains(siteName)) {
				TileImage.get(i).click();
				break;
			}
		}
	}
	
}
