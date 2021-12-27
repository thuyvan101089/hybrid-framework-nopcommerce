package com.nopcommerce.user;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_03_Page_Object_01_Register {

	private WebDriver driver;
	private String projectPath = System.getProperty("user.dir");
	private String firstName, lastName, emailAddress, password;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Mở URL lên nó qua trang HomePage
		driver.get("https://demo.nopcommerce.com/");
		homePage = new UserHomePageObject(driver);

		firstName = "Automation";
		lastName = "FC";
		password = "123456";
		emailAddress = "AFC" + generateFakeNumber() + "@mail.vn";

	}

	@Test
	public void Register_01_Register_Empty_Data() {
		System.out.println("Register_01 - Step 01: Click to RegisterLink");
		homePage.openRegisterPage();
		
		// Click Registerlink => Nhảy qua register 
		registerPage = new UserRegisterPageObject(driver);
		
		System.out.println("Register_01 - Step 02: Click to Register Button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_01 - Step 03: Verify error messages");
		Assert.assertEquals(registerPage.getErrorMessageAtFirstNameTextbox(), "First name is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtLastNameTextbox(), "Last name is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtEmailTextbox(), "Email is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtPasswordTextbox(), "Password is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtConfirmPassWordTextbox(), "Password is required.");

	}

	@Test
	public void Register_02_Invalid_Email() {

		System.out.println("Register_02 - Step 01: Click to RegisterLink");
		homePage.openRegisterPage();
		// Click Registerlink => Nhảy qua register 
		registerPage = new UserRegisterPageObject(driver);

		System.out.println("Register_02 - Step 02: Input required fields");
		registerPage.inputToFirstNameTextBox(firstName);
		registerPage.inputToLastNameTextBox(lastName);
		registerPage.inputToEmailTextBox("abcd@1234%%%%");
		registerPage.inputToPasswordTextBox(password);
		registerPage.inputToConfirmPasswordTextBox(password);

		System.out.println("Register_02 - Step 03: Click to Register Button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_02 - Step 04: Verify invalid email messages");
		Assert.assertEquals(registerPage.getErrorMessageAtEmailTextbox(), "Wrong email");

	}

	@Test
	public void Register_03_Register_Success() {
		System.out.println("Register_03 - Step 01: Click to RegisterLink");
		homePage.openRegisterPage();
		// Click Registerlink => Nhảy qua register 
		registerPage = new UserRegisterPageObject(driver);

		System.out.println("Register_03 - Step 02: Input required fields");
		registerPage.inputToFirstNameTextBox(firstName);
		registerPage.inputToLastNameTextBox(lastName);
		registerPage.inputToEmailTextBox(emailAddress);
		registerPage.inputToPasswordTextBox(password);
		registerPage.inputToConfirmPasswordTextBox(password);

		System.out.println("Register_03 - Step 03: Click to Register Button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_03 - Step 04: Verify successful messages displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		System.out.println("Register_03 - Step 05: Click to Logout link");
		registerPage.clickToLogoutLink();

	}

	@Test
	public void Register_04_Existing_Email() {
		System.out.println("Register_04 - Step 01: Click to RegisterLink");
		homePage.openRegisterPage();
		
		// Click Registerlink => Nhảy qua register 
		registerPage = new UserRegisterPageObject(driver);

		System.out.println("Register_04 - Step 02: Input required fields");
		registerPage.inputToFirstNameTextBox(firstName);
		registerPage.inputToLastNameTextBox(lastName);
		registerPage.inputToEmailTextBox(emailAddress);
		registerPage.inputToPasswordTextBox(password);
		registerPage.inputToConfirmPasswordTextBox(password);

		System.out.println("Register_04 - Step 03: Click to Register Button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_04 - Step 04: Verify Existing Email Message displayed");
		Assert.assertEquals(registerPage.getErrorExistingEmailMessage(), "The specified email already exists");
	}

	@Test
	public void Register_05_Password_Less_Than_6_Characters() {

		System.out.println("Register_05 - Step 01: Click to RegisterLink");
		homePage.openRegisterPage();
		
		// Click Registerlink => Nhảy qua register 
		registerPage = new UserRegisterPageObject(driver);

		System.out.println("Register_05 - Step 02: Input required fields");
		registerPage.inputToFirstNameTextBox(firstName);
		registerPage.inputToLastNameTextBox(lastName);
		registerPage.inputToEmailTextBox(emailAddress);
		registerPage.inputToPasswordTextBox("1234");
		registerPage.inputToConfirmPasswordTextBox("1234");

		System.out.println("Register_05 - Step 03: Click to Register Button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_05 - Step 04: Verify Error Password Message displayed");
		Assert.assertEquals(registerPage.getErrorMessageAtPasswordTextbox(),
				"Password must meet the following rules:\nmust have at least 6 characters");
	}

	@Test
	public void Register_06_Invalid_Confirm_Password() {

		System.out.println("Register_06 - Step 01: Click to RegisterLink");
		homePage.openRegisterPage();
		
		// Click Registerlink => Nhảy qua register 
		registerPage = new UserRegisterPageObject(driver);

		System.out.println("Register_06 - Step 02: Input required fields");
		registerPage.inputToFirstNameTextBox(firstName);
		registerPage.inputToLastNameTextBox(lastName);
		registerPage.inputToEmailTextBox(emailAddress);
		registerPage.inputToPasswordTextBox(password);
		registerPage.inputToConfirmPasswordTextBox("1234");

		System.out.println("Register_06 - Step 03: Click to Register Button");
		registerPage.clickToRegisterButton();

		System.out.println("Register_06 - Step 04: Verify Error Confirm Password Message displayed");
		Assert.assertEquals(registerPage.getErrorMessageAtConfirmPassWordTextbox(), "The password and confirmation password do not match.");

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
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
