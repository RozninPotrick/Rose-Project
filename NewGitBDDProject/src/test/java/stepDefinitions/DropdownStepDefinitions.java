package stepDefinitions;

import BrowserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.DropdownPage;

public class DropdownStepDefinitions extends WebConnector {

    DropdownPage dropdownPage = new DropdownPage();

    @Then("the user should see {int} options in product_sort_container")
    public void the_user_should_see_options_in_product_sort_container(int count) {
        dropdownPage.checkNumberOfOptions(count);
    }

    @When("the user click on the product_sort_container")
    public void the_user_click_on_the_product_sort_container() throws InterruptedException {
        dropdownPage.clickproduct_sort_container();
        Thread.sleep(3000);

    }

    @When("the user select {string} option from product_sort_container")
    public void the_user_select_option_from_product_sort_container(String option) throws InterruptedException {
        dropdownPage.selectOptionFromProductSortContainer(option);
        Thread.sleep(3000);
    }


    @Then("the user should see {string} option is selected")
    public void the_user_should_see_option_is_selected(String option) throws InterruptedException {
        dropdownPage.checkSelectedOption(option);
        Thread.sleep(3000);
    }


}




