package pageObjects;

import BrowserControl.WebConnector;

public class PurchasePage extends WebConnector {

    /*****  Locators *****/

    private String CheckoutXpath = "//button[@id='checkout']";
    private String FirstNameXpath = "//input[@id='first-name']";
    private String LastNameXpath = "//input[@id='last-name']";
    private String ZipCodeXpath  = "//input[@id='postal-code']";
    private String ContinueButtonXpath = "//input[@id='continue']";
    private String FinishButtonXpath = "//button[@name='finish']";

    /***** Getters and Setters ******/

    /**
     * Method to click checkout Button
     */

    public void clickCheckoutButton(){
        BasePage.findElementByXpath(10, CheckoutXpath).click();

    }

    /**
     * Method to set First Name
     */

    public void setFirstName(String FirstName){
        BasePage.findElementByXpath(10, FirstNameXpath).clear();
        BasePage.findElementByXpath(10, FirstNameXpath).sendKeys(FirstName);

    }

    public void setLastName(String LastName){
        BasePage.findElementByXpath(10, LastNameXpath).clear();
        BasePage.findElementByXpath(10, LastNameXpath).sendKeys(LastName);
    }

    public void setZipCode(String ZipCode){
        BasePage.findElementByXpath(10, ZipCodeXpath).clear();
        BasePage.findElementByXpath(10, ZipCodeXpath).sendKeys(ZipCode);

    }

    /**
     * Method to click on Continue Button
     */

    public void clickContinueButton(){
        BasePage.findElementByXpath(10, ContinueButtonXpath).click();
    }

    /**
     * Method to click Finish Button
     */

    public void clickFinishButton(){
        BasePage.findElementByXpath(10, FinishButtonXpath).click();
    }








}
