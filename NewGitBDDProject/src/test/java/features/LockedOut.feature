#@SmokeTest
Feature: Verify Login Page
  As a user of the system
  I should be able to login with valid credentials
  so that I can log into my account

  Background: Navigation
      Given the user navigate to "Swag Labs" page

  Scenario: 1. Verify login with valid credentials
      When the user login with "locked_out_user" username and "secret_sauce" password
      And the user click on login button
      Then the user should see "Epic sadface: Sorry, this user has been locked out."
    
  Scenario: 2. Verify login with Invalid username
      When the user login with "locked_out_user1" username and "secret_sauce" password
      And the user click on login button
      Then the user should see "Epic sadface: Username and password do not match any user in this service"
    
  Scenario: 3. Verify login with Invalid password
       When the user login with "locked_out_user" username and "secret_sauce1" password
       And the user click on login button
       Then the user should see "Epic sadface: Username and password do not match any user in this service"

  Scenario Outline: 4.Verify Login with Invalid Credentials
     When the user login with "<username>" username and "<password>" password
     And the user click on login button
     Then the user should see "<expectedText>"

     Examples:
       | username         | password      | expectedText                                                              |
       | locked_out_user1 | secret_sauce  | Epic sadface: Username and password do not match any user in this service |
       | locked_out_user  | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |
       | locked_out_user  |               | Epic sadface: Password is required                                        |
       | locked_out_ user | secret_sauce  | Epic sadface: Username and password do not match any user in this service |