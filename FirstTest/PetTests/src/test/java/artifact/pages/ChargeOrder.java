package artifact.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import artifact.base.BasePage;

public class ChargeOrder extends BasePage {
	
	@FindBy(xpath = "//input[@value = 'Set Values']")
	private WebElement btnSetValues;
	
	@FindBy(id = "new-request")
	private WebElement btnEmptyCart;
	
	@FindBy(name = "orderNumber")
	private WebElement fldOrderNumber;
	
	@FindBy(name = "amount")
	private WebElement fldAmount;
	
	@FindBy(name = "cart")
	private WebElement areaCart;
	
	public void enterOrderNumber(String orderNumber) {
		switchToFrame("right");
		fldOrderNumber.clear();
		fldOrderNumber.sendKeys(orderNumber);
	}
	
	public void enterAmount(String amount) {
		switchToFrame("right");
		fldAmount.clear();
		fldAmount.sendKeys(amount);
	}
	
	public void clickOnSetValues() {
		switchToFrame("right");
		btnSetValues.click();
	}
	
	private void clickOnEmptyCart() {
		switchToFrame("right");
		btnEmptyCart.click();
	}

	public void addItem(String orderNumber, String amount) {
		enterOrderNumber(orderNumber);
		enterAmount(amount);
		clickOnSetValues();
	}
	
	public String getCartText() {
		switchToFrame("right");
		return areaCart.getText();
	}

	public void emptyCart() {
		clickOnEmptyCart();
	}
	
	public ChargeOrder(WebDriver driver) {
		super(driver);
	}

}
