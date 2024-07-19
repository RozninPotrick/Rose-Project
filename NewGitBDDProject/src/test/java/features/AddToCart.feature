@SmokeTest
Feature: Adding product to the cart
         As a user of the system
         I should be able to login with valid Credentials
         So that I can add Backpack to the Cart

  Background: Navigate
            Given the user navigate to "Swag Labs" page
            When the user login with "standard_user" username and "secret_sauce" password
            And the user click on login button
            Then the user should see "Products"

  Scenario: 1.Verify that the product is added to the Cart
            When the user select "Sauce Labs Backpack" product and add to Cart
            And the user click on Add to Cart Button
            And the user click on shopping Cart container
            Then the user should see "Sauce Labs Backpack" is added to Your Cart



