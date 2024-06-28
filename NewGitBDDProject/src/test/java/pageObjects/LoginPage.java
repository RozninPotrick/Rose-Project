package pageObjects;

import BrowserControl.WebConnector;
import org.openqa.selenium.WebElement;

public class LoginPage extends WebConnector {

    /**** Locators ****/
    private String usernameFieldXpath = "//input[@id='user-name']";
    private String passwordFieldXpath = "//input [@id='password']";
    private String loginButtonXpath   = "//input[@id='login-button']";
    private String mainmenuXpath      = "//button[@id='react-burger-menu-btn']";
    private String logoutButtonXpath  = "//a[@id='logout_sidebar_link']";


    /**** Getters and Setters ****/
  public void setusername(String username){

      BasePage.findElementByXpath(10, usernameFieldXpath).clear();
      BasePage.findElementByXpath(10, usernameFieldXpath).sendKeys(username);

  }

    public void setpassword(String password) {
      BasePage.findElementByXpath(10, passwordFieldXpath).clear();
      BasePage.findElementByXpath(10, passwordFieldXpath).sendKeys(password);

    }

    public void clickLoginButton(){
      BasePage.findElementByXpath(10, loginButtonXpath).click();

   }

   public void clickmainmanu() {
      BasePage.findElementByXpath(10,mainmenuXpath).click();

   }

    public void clickLogoutButton() {
      BasePage.findElementByXpath(10, logoutButtonXpath).click();
    }
}
