package pageObject.nopCommerce.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.Admin.AdminDasboardPageUI;

public class AdminDashboardPageObject extends BasePage {
	   private WebDriver driver;

	   public AdminDashboardPageObject  (WebDriver driver) {
		this.driver = driver;
	}
	   
	   public boolean isDashboardHeaderDisplay() {
		   waitForElementVisible(driver, AdminDasboardPageUI.DASHBOARD);
		   return isElementDisplayed(driver, AdminDasboardPageUI.DASHBOARD);
	   }
}