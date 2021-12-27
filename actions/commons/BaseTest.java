package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	private String projectPath = System.getProperty("user.dir");
	private WebDriver driver;
	
	protected WebDriver getBrowserDriver (String browserName) {
		
		if(browserName.equals("firefox")){
		
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		
		}else if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		}else if (browserName.equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			throw new RuntimeException("Browser name invalid");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Mở URL lên nó qua trang HomePage
		driver.get(GlobalConstants.PORTAL_PAGE_URL);
		return driver;
		
		}
	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
	

}
