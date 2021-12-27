package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.BasePageFactory;

public class RegisterPageObject extends BasePageFactory {
	private WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="FirstName")
	private WebElement firstNameTextbox;
	
	@FindBy (id="LastName")
	private WebElement lastNameTextbox;
	
	@FindBy (id="Email")
	private WebElement emailTextbox;
	
	@FindBy (id="Password")
	private WebElement passwordTextbox;
	
	@FindBy (id="ConfirmPassword")
	private WebElement confirmPasswordTextbox;
	
	@CacheLookup
	@FindBy (id="register-button")
	private WebElement registerButton;
	
	@FindBy (id="FirstName-error")
	private WebElement firstnameErrorMessage;
	
	@FindBy (id="LastName-error")
	private WebElement lastnameErrorMessage;
	
	@FindBy (id="Email-error")
	private WebElement emailErrorMessage;
	
	@FindBy (id="Password-error")
	private WebElement passwordErrorMessage;
	
	@FindBy (id="ConfirmPassword-error")
	private WebElement confirmPasswordErrorMessage;
	
	@FindBy (css="div.result")
	private WebElement registerSuccessMessage ;
	
	@FindBy (xpath="//a[@class ='ico-logout']")
	private WebElement logoutLink;
	
	@FindBy (xpath="//div[contains(@class,'message-error')]//li")
	private WebElement existingEmailErrorMessage;
	
	
	public void clickToRegisterButton() {
		waitForAllElementClickable(driver, registerButton);
		clickToElement(driver, registerButton);		
	}

	public String getErrorMessageAtFirstNameTextbox() {
		waitForElementVisible(driver, firstnameErrorMessage);
		return getElementText(driver, firstnameErrorMessage);
	}

	public String getErrorMessageAtLastNameTextbox() {
		waitForElementVisible(driver, lastnameErrorMessage);
		return getElementText(driver, lastnameErrorMessage);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForElementVisible(driver, emailErrorMessage);
		return getElementText(driver, emailErrorMessage);
	}

	public String getErrorMessageAtPasswordTextbox() {
		waitForElementVisible(driver, passwordErrorMessage);
		return getElementText(driver, passwordErrorMessage);
	}

	public String getErrorMessageAtConfirmPassWordTextbox() {
		waitForElementVisible(driver, confirmPasswordErrorMessage);
		return getElementText(driver, confirmPasswordErrorMessage);
	}

	public void inputToFirstNameTextBox(String firstName) {
		waitForElementVisible(driver, firstNameTextbox);
		sendkeyToElement(driver, firstNameTextbox, firstName);
	}

	public void inputToLastNameTextBox(String lastName) {
		waitForElementVisible(driver, lastNameTextbox);
		sendkeyToElement(driver, lastNameTextbox, lastName);
		
	}

	public void inputToEmailTextBox(String emailAddress) {
		waitForElementVisible(driver, emailTextbox);
		sendkeyToElement(driver, emailTextbox, emailAddress);
		
	}

	public void inputToPasswordTextBox(String password) {
		waitForElementVisible(driver, passwordTextbox);
		sendkeyToElement(driver, passwordTextbox, password);
		
	}

	public void inputToConfirmPasswordTextBox(String confirmPassword) {
		waitForElementVisible(driver, confirmPasswordTextbox);
		sendkeyToElement(driver, confirmPasswordTextbox, confirmPassword);
		
	}

	public String getRegisterSuccessMessage() {
		waitForElementVisible(driver, registerSuccessMessage);
		return getElementText(driver, registerSuccessMessage);
	}
	

	public void clickToLogoutLink() {
		waitForAllElementClickable(driver, logoutLink);
		clickToElement(driver, logoutLink);	
		
	}

	public String getErrorExistingEmailMessage() {
		waitForElementVisible(driver, existingEmailErrorMessage);
		return getElementText(driver, existingEmailErrorMessage);
	}


}
