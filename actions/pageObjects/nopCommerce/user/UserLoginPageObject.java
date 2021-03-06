package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.user.LoginPageUI;

public class UserLoginPageObject extends BasePage {
   private WebDriver driver;

   public UserLoginPageObject(WebDriver driver) {
	this.driver = driver;
}

public UserHomePageObject clickToLoginButton() {
	waitForAllElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
	clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	return PageGeneratorManager.getUserHomePage(driver);
	
}

public String getErrorMessageAtEmailTextbox() {
	waitForElementVisible(driver, LoginPageUI.ERROR_EMAIL_MESSAGE);
	return getElementText(driver, LoginPageUI.ERROR_EMAIL_MESSAGE);
}

public void inputToEmailTextbox(String emailAddress) {
	waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
	sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailAddress);
	
}

public String getErrorMessageUnsuccessful() {
	waitForElementVisible(driver, LoginPageUI.UNSUCCESSFUL_ERROR_EMAIL_MESSAGE);
	return getElementText(driver, LoginPageUI.UNSUCCESSFUL_ERROR_EMAIL_MESSAGE);
}

public void inputToPasswordTextbox(String password) {
	waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
	sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
}

public UserHomePageObject loginAsUser(String emailAddress, String password) {
	inputToEmailTextbox(emailAddress);
	inputToPasswordTextbox( password);
	return  clickToLoginButton();
}



   
   
   
}
