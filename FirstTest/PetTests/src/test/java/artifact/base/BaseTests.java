package artifact.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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
		//Properties props = System.getProperties();
		//props.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		try {
			driver = new RemoteWebDriver(new URL("http://172.28.151.18:4444/wd/hub"), DesiredCapabilities.chrome());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.get("http://172.28.151.18:8080/JavaCheckoutJ2eeExampleEjb/");
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
