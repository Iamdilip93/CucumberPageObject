package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsguideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	
	public CarsguideHomePageActions() {
		
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),carsGuideHomePageLocators);
	}
	
	
	public void moveToBuySellMenu() {
		
		Actions action=new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buy_shellLink).perform();
	}
	
	public void clickOnSearchCars() {
		
		//moveToBuySellMenu
		carsGuideHomePageLocators.searchCarsLink.click();
	}
	
public void clickOnUsedCars() {
	
	//moveToBuySellMenu
	carsGuideHomePageLocators.usedCarsSearchLink.click();
	}

public void moveToReviewsMenu() {
	Actions action=new Actions(SeleniumDriver.getDriver());
	action.moveToElement(carsGuideHomePageLocators.carReviewsLink).perform();
}

public void moveToNewsMenu() {
	Actions action=new Actions(SeleniumDriver.getDriver());
	action.moveToElement(carsGuideHomePageLocators.carNewsLink).perform();
}
}
