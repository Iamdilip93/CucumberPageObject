package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	
	@FindBy(how=How.XPATH,using="//a[text()='buy + sell']")
	public WebElement buy_shellLink;
	
	@FindBy(how=How.XPATH,using="(//a[@href='/car-reviews'])[1]")
	public WebElement carReviewsLink;
	
	@FindBy(how=How.XPATH,using="(//a[@href='/news'])[1]")
	public WebElement carNewsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Search Cars")
	public WebElement searchCarsLink;	
	
	@FindBy(how=How.LINK_TEXT,using="Used")
	public WebElement usedCarsSearchLink;
	
}
