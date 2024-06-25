package stepDefinitions;

import BrowserControl.WebConnector;

import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginPageStepDefintions extends WebConnector {

    LoginPage loginPage = new LoginPage();

    @When("the user login with {string} username and {string} password")
    public void the_user_login_with_username_and_password(String username, String password) {

    }

}
