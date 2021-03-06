package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarsSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
	
	 UsedCarsSearchPageLocators usedCarsSearchPageLocators=null;
	
	public UsedCarsSearchPageActions() {
		
		this.usedCarsSearchPageLocators=new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),usedCarsSearchPageLocators);
	}
	

	public void selectCarMake(String carBrand) {
		Select selectCarMaker=new Select(usedCarsSearchPageLocators.carMakeDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarMaker=new Select(usedCarsSearchPageLocators.selectModelsDropDown);
		selectCarMaker.selectByVisibleText(carModel);
	}
	
	public void selectLocation(String location) {
		Select selectCarMaker=new Select(usedCarsSearchPageLocators.selectLocationeDropDown);
		selectCarMaker.selectByVisibleText(location);
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarMaker=new Select(usedCarsSearchPageLocators.selectPriceDropDown);
		selectCarMaker.selectByVisibleText(carPrice);
	}

	public void clickOnFindMyNextCarButton() {
		usedCarsSearchPageLocators.findMyNextCarButton.click();
	}
	
	
}
