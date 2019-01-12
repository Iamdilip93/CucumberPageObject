package steps;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.actions.CarsguideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;
import pages.locators.CarsGuideHomePageLocators;

public class UsedCarsSteps {
	
	CarsguideHomePageActions carsguideHomePageActions=new CarsguideHomePageActions();
	UsedCarsSearchPageActions usedCarsPageActions =new UsedCarsSearchPageActions();
	
@And("^click on \"([^\"]*)\" links on used  search Car page$")
public void click_on_links_on_used_search_Car_page(String usedcars) throws Throwable {
	Thread.sleep(5000);
	carsguideHomePageActions.clickOnUsedCars();
}

@And("^select car brand as \"([^\"]*)\" from AnyMake dropdown on used  search Car page$")
public void select_car_brand_as_from_AnyMake_dropdown_on_used_search_Car_page(String carBrand) throws Throwable {
	Thread.sleep(3000);
	usedCarsPageActions.selectCarMake(carBrand);
}

@And("^select car model on used  search Car page$")
public void select_car_model_on_used_search_Car_page(List<String> list) throws Throwable {
	Thread.sleep(3000);
   String menu=list.get(1);
   usedCarsPageActions.selectCarModel(menu);
    
}

@And("^select car brand as \"([^\"]*)\" from SelectLocation dropdown on used  search Car page$")
public void select_car_brand_as_from_SelectLocation_dropdown_on_used_search_Car_page(String location) throws Throwable {
	Thread.sleep(3000);
	usedCarsPageActions.selectLocation(location);
}

@And("^select car brand as \"([^\"]*)\" from price dropdown on used  search Car page$")
public void select_car_brand_as_from_price_dropdown_on_used_search_Car_page(String carPrice) throws Throwable {
	Thread.sleep(3000);
	usedCarsPageActions.selectCarPrice(carPrice);
}

@And("^click on Find_My_Next_Car button on used  search Car page$")
public void click_on_Find_My_Next_Car_button_on_used_search_Car_page() throws Throwable {
	Thread.sleep(3000);
	usedCarsPageActions.clickOnFindMyNextCarButton();
}

@Then("^I should see list of search cars on used  search Car page$")
public void i_should_see_list_of_search_cars_on_used_search_Car_page() throws Throwable {
   
    System.out.println("Used Car list Populated");
}
	
}
