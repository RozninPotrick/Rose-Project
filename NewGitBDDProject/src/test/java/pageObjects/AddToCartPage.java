package pageObjects;

import BrowserControl.WebConnector;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPage extends WebConnector {

    /****** Locator ******/
    private String SauceLabsBackpackXpath = "//div[@data-test='inventory-item-name']";
    private String AddtocartXpath = "//button[@id='add-to-cart']";
    private String shoppingcartcontainerXpath = "//a[@class='shopping_cart_link']";
    /****** Getters And Setters *******/

    /**
     * Method to check selected product
     */

    public void checkselectedoption(String expectedoption){
        BasePage.findElementByXpath(10, SauceLabsBackpackXpath).click();

    }

    /**
     * Method to click Add to Cart Button
     */

     public void clickAddtoCartButton(){
         BasePage.findElementByXpath(10, AddtocartXpath).click();

     }

    /**
     * Method to click CartIcon
     */
    public void clickshoppingcartcontainer(){
         BasePage.findElementByXpath(10, shoppingcartcontainerXpath).click();
     }
}
