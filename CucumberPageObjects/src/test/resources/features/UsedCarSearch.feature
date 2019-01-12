@Used-Search-Cars
Feature: Accepatance Testing To Validate Used Search cars page is working fine.
  in order to validate that
  search car page is working fine
  we will do acceptance testing

  @Used-Search-Cars-Positive
  Scenario: validate used search cars page
    Given I am on the home page  "https://www.carsguide.com.au"  of CarsGuide WebSite
    When I move to the menu
      | menu                  |
      | buy+sell              |
      | reviews               |
      | news                  |
      | advice                |
      | pricing+specification |
    And click on "Used" links on used  search Car page
    And select car brand as "AUDI" from AnyMake dropdown on used  search Car page
    And select car model on used  search Car page
      | carModel |
      | A4       |
      |A3				|
    And select car brand as "SA - All" from SelectLocation dropdown on used  search Car page
    And select car brand as "$2,000" from price dropdown on used  search Car page
    And click on Find_My_Next_Car button on used  search Car page
    Then I should see list of search cars on used  search Car page
    And the page title should be "Used Audi A4 Under 2000 for Sale SA | carsguide"
