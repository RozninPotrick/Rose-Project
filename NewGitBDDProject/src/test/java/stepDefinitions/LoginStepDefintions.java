package stepDefinitions;

import BrowserControl.WebConnector;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;
import utilities.ConstantUtils;

public class LoginStepDefintions extends WebConnector {

    LoginPage loginPage = new LoginPage();

    @Given("the user navigate to {string} page")
    public void the_user_navigate_to_page(String string) {
     driver.get(ConstantUtils.BASE_URL);
    }

    @When("the user login with {string} username and {string} password")
    public void the_user_login_with_username_and_password(String username, String password) {
        loginPage.setusername(username);
        loginPage.setpassword(password);

    }

    @When("the user click on login button")
    public void the_user_click_on_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("the user should see {string}")
    public void the_user_should_see(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));

    }

    @When("the user click on Main Menu")
    public void the_user_click_on_main_menu() {
       loginPage.clickmainmanu();
    }

    @When("the user click on logout")
    public void the_user_click_on_logout() {
        loginPage.clickLogoutButton();
    }


}
