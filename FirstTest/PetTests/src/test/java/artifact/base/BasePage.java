package artifact.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	private WebDriver driver;
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	protected void switchToFrame(String frameName) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frameName);
	}
}
