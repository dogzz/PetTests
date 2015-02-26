package artifact.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import artifact.pages.CartBuilder;
import artifact.pages.ChargeOrder;
import artifact.pages.NavigationBlock;

public class BaseTests {
	
	private WebDriver driver;
	public static CartBuilder pageCartBuilder;
	public static ChargeOrder pageChargeOrder;
	public static NavigationBlock blockNavigation;
	
	@BeforeTest
	public void init() {
		Properties props = System.getProperties();
		props.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/JavaCheckoutJ2eeExampleEjb/");
		pageCartBuilder = new CartBuilder(driver);
		pageChargeOrder = new ChargeOrder(driver);
		blockNavigation = new NavigationBlock(driver);
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	@AfterTest
	public void closeAll() {
		driver.quit();
	}

}
