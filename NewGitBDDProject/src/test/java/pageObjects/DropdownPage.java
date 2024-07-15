package pageObjects;

import BrowserControl.WebConnector;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage extends WebConnector {

    /****** Locators ******/

    private String product_sort_containerXpath = "//select[@class='product_sort_container']";

    private String selectedOptionXpath = "//span[@class='active_option']";


    /****** Getters & Setters *******/

    /**
     * Method to check the number of options available in the product sort container
     * @param expectedCount
     */

    public void checkNumberOfOptions(int expectedCount){
        WebElement product_sort_container = BasePage.findElementByXpath(10, product_sort_containerXpath);
        List<WebElement> options = product_sort_container.findElements(By.tagName("option"));
        Assert.assertEquals(expectedCount, options.size());
    }

    /**
     * Method to click Dropdown list(product sort container)
     */

    public void clickproduct_sort_container(){
        BasePage.findElementByXpath(10, product_sort_containerXpath).click();

    }

    /**
     * Method to select number of option
     * @param option
     */
    public void selectOptionFromProductSortContainer(String option){
        WebElement product_sort_container = BasePage.findElementByXpath(10, product_sort_containerXpath);
        Select select = new Select(product_sort_container);
        select.selectByVisibleText(option);
    }

    /**
     * Method to check selected option
     * @param expectedoption
     */

    public void checkSelectedOption(String expectedoption){
        String actualoption = BasePage.findElementByXpath(10, selectedOptionXpath).getText();
        Assert.assertEquals(expectedoption, actualoption);
    }



}
