@SmokeTest
Feature: Verify product sort container

  As a user of the system
  I should be able to select an option from the product sort container
  So that the selected option is displayed

  Background: Navigate
    Given the user navigate to "Swag Labs" page
    When the user login with "standard_user" username and "secret_sauce" password
    And the user click on login button
    Then the user should see "Products"

  Scenario: 1.Verify the number of options available in product sort container
    Then the user should see 4 options in product_sort_container

  Scenario: 2.Verify that the user can select an option from product sort container
    When the user click on the product_sort_container
    And the user select "Price (high to low)" option from product_sort_container
    Then the user should see "Price (high to low)" option is selected

  Scenario Outline: 3.Verify that the user can select an option from product sort container
    When the user click on the product_sort_container
    And the user select "<option>" option from product_sort_container
    Then the user should see "<option>" option is selected

    Examples:
      | option              |
      | Name (A to Z)       |
      | Name (Z to A)       |
      | Price (low to high) |
      | Price (high to low) |


