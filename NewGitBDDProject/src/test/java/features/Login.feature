@SmokeTest
Feature: Verify Login Page
  As a user of the system
  I should be able login with valid credentials
  So that I can log into my account

  Background: Navigate
    Given the user navigate to "Swag Labs" page

  Scenario: 1.Verify login with valid Credentials
    When the user login with "standard_user" username and "secret_sauce" password
    And the user click on login button
    Then the user should see "Products"
    When the user click on Main Menu
    And the user click on logout

  Scenario: 2.Verify login with invalid username
    When the user login with "standard_user1" username and "secret_sauce" password
    And the user click on login button
    Then the user should see "Epic sadface: Username and password do not match any user in this service"

  Scenario: 3.Verify login with invalid password
    When the user login with "standard_user" username and "secret_sauce1" password
    And the user click on login button
    Then the user should see "Epic sadface: Username and password do not match any user in this service"

  Scenario Outline: 4.Verify login with invalid Credentials
    When the user login with "<username>" username and "<password>" password
    And the user click on login button
    Then the user should see "<expectedText>"

    Examples:
      | username       | password      | expectedText                                                              |
      | standard_user1 | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
      | standard_user  | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |
      | standard_user  |               | Epic sadface: Password is required                                        |
      | standard_user  | secret_ sauce | Epic sadface: Username and password do not match any user in this service |


