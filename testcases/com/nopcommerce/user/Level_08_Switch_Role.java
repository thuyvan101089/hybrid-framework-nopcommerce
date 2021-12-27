package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import pageObject.nopCommerce.admin.AdminDashboardPageObject;
import pageObject.nopCommerce.admin.AdminLoginPageObject;
import pageObjects.nopCommerce.user.UserCustomerInfoPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;

public class Level_08_Switch_Role extends BaseTest{

	private WebDriver driver;
	private String userEmailAddress, userPassword, adminEmailAddress, adminPassword;
	private UserHomePageObject userHomePage;
	private UserLoginPageObject userLoginPage;
	private UserCustomerInfoPageObject userCustomerInfoPage;
	private AdminLoginPageObject adminLoginPage;
	private AdminDashboardPageObject adminDashboardPage;
	private UserCustomerInfoPageObject customerInfoPage;
	
	
	
	@Parameters ("browser")
	@BeforeClass
	
	public void beforeClass(String browserName) {	
		driver = getBrowserDriver(browserName);	
		//Che giấu việc khởi tạo trong hàm
		userHomePage = PageGeneratorManager.getUserHomePage(driver);
	
		
		userEmailAddress = "vanxinhdeptest@gmail.vn";
		userPassword = "123456";
		adminEmailAddress ="admin@yourstore.com";
		adminPassword ="admin";
	}

	@Test
	public void Role_01_User_To_Admin() {
		userLoginPage = userHomePage.openLoginPage();
		// Login as user
		userHomePage = userLoginPage.loginAsUser(userEmailAddress,userPassword);
		Assert.assertTrue(userHomePage.isMyAccountLinkDisplay());
		
		//HomePgae => Customer Info
		userCustomerInfoPage = userHomePage.openMyAccountPage();
		
		//Customer Info => Home
		userHomePage = userCustomerInfoPage.clickToLogoutLinkAtUserPage(driver);
		
		//User Homepage => Open Admin Page => Login Admin page 
		userHomePage.openPageUrl(driver, GlobalConstants.ADMIN_PAGE_URL);
		adminLoginPage = PageGeneratorManager.getAdminLoginPage(driver);
		
		//Login as admin
		adminDashboardPage = adminLoginPage.loginAsAdmin(adminEmailAddress, adminPassword);
		Assert.assertTrue(adminDashboardPage.isDashboardHeaderDisplay());	
		
		//Dashboard Page => click log out => Login Page
		adminLoginPage = adminDashboardPage.clickToLogoutLinkAtAdminPage(driver);
	
	}
	@Test
	public void Role_02_Admin_To_User() {
		//Login Page Admin => Open user URL => home page
		
		adminLoginPage.openPageUrl(driver,GlobalConstants.PORTAL_PAGE_URL);
		userHomePage = PageGeneratorManager.getUserHomePage(driver);
		
		//Home page => login user
		
		userLoginPage = userHomePage.openLoginPage();
		
		// Login as user
		userHomePage =  userLoginPage.loginAsUser(userEmailAddress,userPassword);
		Assert.assertTrue(userHomePage.isMyAccountLinkDisplay());
	}
	
	@Test
	public void User_03_Customer_Infor() {
		customerInfoPage = userHomePage.openMyAccountPage();
		Assert.assertTrue(customerInfoPage.isCustomerInfoPageDisplayed());
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
