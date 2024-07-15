package stepDefinitions;

import BrowserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.PurchasePage;

public class PurchaseStepDefinitions extends WebConnector {

    PurchasePage purchasePage = new PurchasePage();


    @When("the user click on Checkout button")
    public void the_user_click_on_checkout_button() throws InterruptedException {
        purchasePage.clickCheckoutButton();
        Thread.sleep(3000);
    }

    @Then("the user should see {string} page")
    public void the_user_should_see_page(String expectedText) throws InterruptedException {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
        Thread.sleep(3000);
    }

    @Then("the user fill with {string} in FirstName field, {string} in Last Name field and {string} in Zip Code field")
    public void the_user_fill_with_in_first_name_field_in_last_name_field_and_in_zip_code_field(String FirstName, String LastName, String ZipCode) {
       purchasePage.setFirstName(FirstName);
       purchasePage.setLastName(LastName);
       purchasePage.setZipCode(ZipCode);
    }

    @Then("the user click on Continue Button")
    public void the_user_click_on_continue_button() throws InterruptedException {
      purchasePage.clickContinueButton();
      Thread.sleep(3000);
    }

    @Then("the user see {string} page")
    public void the_user_see_page(String expectedText) throws InterruptedException {
      Assert.assertTrue(driver.getPageSource().contains(expectedText));
      Thread.sleep(3000);
    }

    @Then("the user click on Finish Button")
    public void the_user_click_on_finish_button() {
      purchasePage.clickFinishButton();
    }

    @Then("user should see {string} text will displayed")
    public void user_should_see_text_will_displayed(String expectedText) throws InterruptedException {
       Assert.assertTrue(driver.getPageSource().contains(expectedText));
       Thread.sleep(3000);
    }







}

