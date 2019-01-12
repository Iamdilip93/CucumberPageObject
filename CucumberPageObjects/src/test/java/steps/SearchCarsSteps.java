package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsguideHomePageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsguideHomePageActions carsguideHomePageActions =new CarsguideHomePageActions();
	CarSearchPageActions carSearchPageActions=new CarSearchPageActions();
	
	@Given("^I am on the home page  \"([^\"]*)\"  of CarsGuide WebSite$")
	public void i_am_on_the_home_page_of_CarsGuide_WebSite(String websiteURL) throws Throwable {
	   Thread.sleep(10000);
	    SeleniumDriver.openPage(websiteURL);
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {
	    Thread.sleep(10000);
	    String Menu=list.get(1);
	    System.out.println("The Selected Menu is:"+Menu);
	    carsguideHomePageActions.moveToBuySellMenu();
	    
	    
	}

	@And("^click on \"([^\"]*)\" links$")
	public void click_on_links(String searchCars) throws Throwable {
	    Thread.sleep(5000);
		carsguideHomePageActions.clickOnSearchCars();
	}

	@And("^select car brand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_car_brand_as_from_AnyMake_dropdown(String carBrand) throws Throwable {
		Thread.sleep(5000);
		carSearchPageActions.selectCarMake(carBrand);
	}

	@And("^select car brand as \"([^\"]*)\" from SelectModel dropdown$")
	public void select_car_brand_as_from_SelectModel_dropdown(String carModel) throws Throwable {
		Thread.sleep(5000);
		carSearchPageActions.selectCarModel(carModel);
	}

	@And("^select car brand as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_car_brand_as_from_SelectLocation_dropdown(String location) throws Throwable {
		Thread.sleep(5000);
		carSearchPageActions.selectLocation(location);
	}

	@And("^select car brand as \"([^\"]*)\" from price dropdown$")
	public void select_car_brand_as_from_price_dropdown(String carPrice) throws Throwable {
		Thread.sleep(5000);
		carSearchPageActions.selectCarPrice(carPrice);
	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
		Thread.sleep(5000);
		carSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see list of search cars$")
	public void i_should_see_list_of_search_cars() throws Throwable {
	    
	    System.out.println("car list Found");
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expected_title) throws Throwable {
		String Actual_title=SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(Actual_title, expected_title);
	    
	}

}
