package pageObject.nopCommerce.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.Admin.AdminLoginPageUI;

public class AdminLoginPageObject  extends BasePage {
	   private WebDriver driver;

	   public AdminLoginPageObject (WebDriver driver) {
		this.driver = driver;
	}

	public void inputToUserNameTextBox(String emailAddress) {
		waitForElementVisible(driver, AdminLoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, AdminLoginPageUI.EMAIL_TEXTBOX, emailAddress);
		
	} 
	
	public void inputToPassWordTextBox(String password) {
		waitForElementVisible(driver, AdminLoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, AdminLoginPageUI.PASSWORD_TEXTBOX, password);
		
	} 
	
	
	public AdminDashboardPageObject clickToLoginButton() {
		waitForAllElementClickable(driver, AdminLoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, AdminLoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getAdminDashboardPage(driver);
		
	} 
	
	public AdminDashboardPageObject loginAsAdmin(String emailAddress, String password ) {
		inputToUserNameTextBox(emailAddress);
		inputToPassWordTextBox(password);
		return clickToLoginButton();
		
		
		
	}

}
