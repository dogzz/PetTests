package artifact.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import artifact.pages.CartBuilder;

public class BaseTests {
	
	private WebDriver driver;
	public CartBuilder pageCartBuilder;
	
	@BeforeSuite
	public void init() {
		driver = new FirefoxDriver();
		driver.get("http://localhost:8080/JavaCheckoutJ2eeExampleEjb/");
		pageCartBuilder = new CartBuilder(driver);
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	@AfterSuite
	public void closeAll() {
		driver.quit();
	}

}
