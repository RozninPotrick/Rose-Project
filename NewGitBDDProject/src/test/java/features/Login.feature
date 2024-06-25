@SmokeTest
Feature: Login Page
  As a user of the system
  I should be able login with valid credentials
  So that I can log into my account

  Background: Navigate
    Given the user navigate to "Swag Labs" page

  Scenario: 1.Verify login with valid Credentials
    When the user login with "standard_user" username and "secret_sauce" password
    And the user click on login button
    Then the user should see "Products"




