package artifact.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import artifact.base.BasePage;

public class NavigationBlock extends BasePage {
	
	@FindBy(xpath = "//a[contains(text(),'Shopping Cart Builder')]")
	private WebElement linkCartBuilder;
	
	@FindBy(xpath = "//a[contains(text(), 'Charge Order')]")
	private WebElement linkChargeOrder;
	
	public void clickOnCartBuilderLink() {
		switchToFrame("left_top");
		linkCartBuilder.click();
	}
	
	public void clickOnChargeOrderLink() {
		switchToFrame("left_top");
		linkChargeOrder.click();
	}

	public NavigationBlock(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
