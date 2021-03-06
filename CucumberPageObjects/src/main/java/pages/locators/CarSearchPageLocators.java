package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {

	@FindBy(how=How.XPATH,using="//*[@id='makes']")
	public WebElement carMakeDropDown;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='models']")
	public WebElement selectModelsDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='locations']")
	public WebElement selectLocationeDropDown ;
	
	@FindBy(how=How.XPATH,using="//*[@id='price-max']")
	public WebElement  selectPriceDropDown;
	
	@FindBy(how=How.XPATH,using="//*[@id='search-submit']")
	public WebElement findMyNextCarButton;

}
