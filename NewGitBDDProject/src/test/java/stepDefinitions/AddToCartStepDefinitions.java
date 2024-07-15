package stepDefinitions;

import BrowserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.AddToCartPage;

public class AddToCartStepDefinitions extends WebConnector {

   AddToCartPage addToCartPage = new AddToCartPage();

   @When("the user select {string} option")
   public void the_user_select_option(String expectedoption) throws InterruptedException {
      addToCartPage.checkselectedoption(expectedoption);
      Thread.sleep(3000);
   }

   @When("the user click on Add to Cart Button")
   public void the_user_click_on_add_to_cart_button() throws InterruptedException {
      addToCartPage.clickAddtoCartButton();
      Thread.sleep(3000);
   }

   @When("the user click on shopping Cart container")
   public void the_user_click_on_shopping_cart_container() throws InterruptedException {
      addToCartPage.clickshoppingcartcontainer();
      Thread.sleep(3000);
   }

   @Then("the user should see {string} is added to Your Cart")
   public void the_user_should_see_is_added_to_your_cart(String expectedText) throws InterruptedException {
      Assert.assertTrue(driver.getPageSource().contains(expectedText));
      Thread.sleep(3000);
   }


}

