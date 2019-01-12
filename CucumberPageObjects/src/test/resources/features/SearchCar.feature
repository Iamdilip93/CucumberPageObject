@Search-Cars
Feature: Accepatance Testing To Search cars page is working fine.
  in order to validate that
  search car page is working fine
  we will do acceptance testing

  @Search-Cars-Positive
  Scenario: validate search cars page
    Given I am on the home page  "https://www.carsguide.com.au"  of CarsGuide WebSite
    When I move to the menu
      | menu                  |
      | buy+sell              |
      | reviews               |
      | news                  |
      | advice                |
      | pricing+specification |
    And click on "Search Cars" links
    And select car brand as "BMW" from AnyMake dropdown
    And select car brand as "1 SERIES" from SelectModel dropdown
    And select car brand as "Australia" from SelectLocation dropdown
    And select car brand as "$10,000" from price dropdown
    And click on Find_My_Next_Car button
    Then I should see list of search cars
    And the page title should be "Bmw 1 Series Under 10000 for Sale | carsguide"
