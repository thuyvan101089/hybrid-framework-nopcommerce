package javaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_06_Condition_Statement {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	// @Test
	public void TC_01_If() {
		boolean status = 5 > 3;

		// Ham if se nhan vào 1 điều kiện đúng
		// Kiểm tra duy nhất 1điều kiên
		// Nêu điều kiên đúng thì sẽ action trong phần thân
		if (status) {
			// Đúng thì vào phần thân của if
			// Sai thì bỏ qua
			System.out.println("Go to IF");
		}
		// Gán Assign
		int studentNumber = 10;
		// == so sánh
		status = (studentNumber == 10);
		System.out.println(status);

		WebDriver driver = new FirefoxDriver();
		// Element luôn luôn có trong DOm dù popup hiển thị hay không
		WebElement salePopup = driver.findElement(By.id(""));
		if (salePopup.isDisplayed()) {

		}
		// Element ko co trong DOM khi popup ko hiển thị
		List<WebElement> salePopups = driver.findElements(By.id(""));
		// Check element ko hiển thị
		if (salePopups.size() > 0 && salePopups.get(0).isDisplayed()) {

		}
		// Uncheck to checkbox

		WebElement languageCheckbox = driver.findElement(By.id(""));
		if (languageCheckbox.isSelected()) {
			languageCheckbox.click();
		}
		// Check to check box
		if (!languageCheckbox.isSelected()) {
			languageCheckbox.click();
		}

	}
	//@Test
	public void TC_02_If_Else() {

		// Có tới 2 điều kiện nếu như đúng thì vào if sai thì vào else

		// Nếu driver start với Chrome/Firefox/ Safari thì dùng hàm click thông thường
		// thông thường (builtin) của Selenium Webdriver

		// Nếu Driver là IE thì dùng hàm click của Javascript

		System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();

//		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
//		driver = new ChromeDriver();

		if (driver.toString().contains("internet explorer")) {
			System.out.println("Click by Javascript Executor");

		} else {
			System.out.println("Click by Selenium Webelement");
		}

	}

		@Parameters("browser")
		//@Test
		public void TC_03_If_Else_Many_Times(String browserName) {
			//Có nhiều điều kiện
			// Best pratice: ko nên if else quá nhiều
			
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
				driver = new FirefoxDriver();
			} else if(browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
			}else {
				throw new RuntimeException("Please input the correct browser name");
			}
			System.out.println(browserName);
			System.out.println(driver.toString());
			driver.quit();
		}
		@Test
		public void TC_04_If_Else_IF() {
			//Page Object
			//Dynamic Page
			
			String pageName ="Login";
				if(pageName.equals("Login")) {
					//LoginPage  loginPage = new loginPage();
					//return loginPage
				}else if (pageName.equals("Register")) {
					//RegisterPage  registerPage = new registerPage();
					//return registerPage
				}else if (pageName.equals("New Customer")) {
					//CustomerPage customerPage  = new CustomerPage();
					//return customerPage
				}else {
					//HomePage homePage  = new HomePage();
					//return homePage
				}
				
				// Biểu thức tam nguyên = ? :
				int age = 20;
				String access = (age < 18) ? "You can not access" : "Welcome to our system";
				
				if (age<18) {
					access ="You can not access";
				} else {
					access = "Welcome to our system";
				}
		}

}
