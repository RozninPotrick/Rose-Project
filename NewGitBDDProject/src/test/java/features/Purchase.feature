@SmokeTest
Feature: Verify login and purchase a product
    As a user of the system
    I should be able to login with valid credentials
    So that I can purchase a product

 Background: Navigation
    Given the user navigate to "Swag Labs" page
    When the user login with "standard_user" username and "secret_sauce" password
    And the user click on login button
    Then the user should see "Products"
    When the user select "Sauce Labs Backpack" product and add to Cart
    And the user click on Add to Cart Button
    And the user click on shopping Cart container
    Then the user should see "Sauce Labs Backpack" is added to Your Cart

 Scenario: 1.Verify to purchase a product
   When the user click on Checkout button
   Then the user should see "Checkout: Your Information" page
   And the user fill with "R" in FirstName field, "P" in Last Name field and "SE18 0PB" in Zip Code field
   And the user click on Continue Button
   Then the user see "Checkout: Overview" page
   And the user click on Finish Button
   Then user should see "Thank you for your order!" text will displayed



