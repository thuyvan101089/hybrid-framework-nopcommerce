package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.nopCommerce.user.HomePageUI;

public class UserHomePageObject extends BasePage {
	private WebDriver driver;
	
	public UserHomePageObject (WebDriver driver) {
		this.driver = driver;
	}
	public UserRegisterPageObject openRegisterPage() {
		
		waitForAllElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return PageGeneratorManager.getUserRegisterPage(driver);
	}
	public UserLoginPageObject openLoginPage() {
		waitForAllElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return PageGeneratorManager.getUserLoginPage(driver);
		
	}
	public boolean isMyAccountLinkDisplay() {
		waitForElementVisible(driver, HomePageUI.MY_ACOUNT_LINK);
		return isElementDisplayed(driver, HomePageUI.MY_ACOUNT_LINK);
	}
	public UserCustomerInfoPageObject  openMyAccountPage() {
		waitForAllElementClickable(driver, HomePageUI.MY_ACOUNT_LINK);
		clickToElement(driver, HomePageUI.MY_ACOUNT_LINK);
		return PageGeneratorManager.getUserCustomerInfoPage(driver);
		
		
	}


}
