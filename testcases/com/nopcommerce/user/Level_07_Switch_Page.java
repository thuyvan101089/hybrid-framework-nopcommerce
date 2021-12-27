package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.nopCommerce.user.UserAddressPageObject;
import pageObjects.nopCommerce.user.UserCustomerInfoPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserMyProductReviewPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import pageObjects.nopCommerce.user.UserRewardPointPageObject;

public class Level_07_Switch_Page extends BaseTest{

	private WebDriver driver;
	private String firstName, lastName,emailAddress, validPassword;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;
	private UserCustomerInfoPageObject customerInfoPage;
	private UserMyProductReviewPageObject myProductReviewPage;
	private UserRewardPointPageObject rewardPointPageObject;
	private UserAddressPageObject addressPage;
	


	@Parameters ("browser")
	@BeforeClass
	
	public void beforeClass(String browserName) {	
		driver = getBrowserDriver(browserName);	
		//Che giấu việc khởi tạo trong hàm
		homePage = PageGeneratorManager.getUserHomePage(driver);
		
		firstName = "Automation";
		lastName = "FC";
		validPassword = "123456";
		emailAddress = "afc" + generateFakeNumber() + "@mail.vn";
	}

	@Test
	public void User_01_Register() {
		
		registerPage = homePage.openRegisterPage();
		
		registerPage.inputToFirstNameTextBox(firstName);
		registerPage.inputToLastNameTextBox(lastName);
		registerPage.inputToEmailTextBox(emailAddress);
		registerPage.inputToPasswordTextBox(validPassword);
		registerPage.inputToConfirmPasswordTextBox(validPassword);
		registerPage.clickToRegisterButton();
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		homePage = registerPage.clickToLogoutLink();		
	}
	@Test
	public void User_02_Login() {

		loginPage = homePage.openLoginPage();
		
		loginPage.inputToEmailTextbox(emailAddress);
		loginPage.inputToPasswordTextbox(validPassword);
		homePage = loginPage.clickToLoginButton();		
		
		Assert.assertTrue(homePage.isMyAccountLinkDisplay());
		
	}
	
	@Test
	public void User_03_Customer_Infor() {
		customerInfoPage = homePage.openMyAccountPage();
		Assert.assertTrue(customerInfoPage.isCustomerInfoPageDisplayed());
	}
	
	@Test
	public void User_04_Switch_Page() {
		
		//Customer Info -> Address
		addressPage= customerInfoPage.openAddressPage(driver);
		//Address -> My Product Review
		myProductReviewPage = addressPage.openMyProductReviewPage(driver);
		//My product Review -> Reward Point
		rewardPointPageObject = myProductReviewPage.openRewardPointPage(driver);
		
		// Reward Point -> Address
		addressPage = rewardPointPageObject.openAddressPage(driver);
		//Address -> Reward Point 
		rewardPointPageObject = addressPage.openRewardPointPage(driver);
		//Reward Point -> My Product Review
		myProductReviewPage =  rewardPointPageObject.openMyProductReviewPage(driver);
		// My Product Review -> Address	
		addressPage = myProductReviewPage.openAddressPage(driver);
		//Address -> Customer Info
		customerInfoPage = addressPage.openCustomerInfoPage(driver);
		myProductReviewPage = customerInfoPage.openMyProductReviewPage(driver);
	}
	
	
	@Test
	public void User_05_Switch_Role() {
		
	}
		
		

	@AfterClass
	public void afterClass() {
		driver.quit();
	}


	public void sleepInSecond(long time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
