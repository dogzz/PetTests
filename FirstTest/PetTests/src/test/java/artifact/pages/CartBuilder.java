package artifact.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import artifact.base.BasePage;

public class CartBuilder extends BasePage {
	
	@FindBy(xpath = "//input[@value = 'Add Item']")
	private WebElement btnAddItem;
	
	@FindBy(name = "itemName")
	private WebElement fldItemName;
	
	@FindBy(name = "cart")
	private WebElement areaCart;
	
	public void enterItemName(String itemName) {
		switchToFrame("right");
		fldItemName.clear();
		fldItemName.sendKeys(itemName);
	}

	public void clickOnAddItem() {
		switchToFrame("right");
		btnAddItem.click();
	}
	
	public void addItem(String itemName) {
		enterItemName(itemName);
		clickOnAddItem();
	}
	
	public String getCartText() {
		switchToFrame("right");
		return areaCart.getText();
	}

	public CartBuilder(WebDriver driver) {
		super(driver);
	}

}
