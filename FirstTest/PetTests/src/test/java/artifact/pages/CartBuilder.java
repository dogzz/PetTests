package artifact.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import artifact.base.BasePage;

public class CartBuilder extends BasePage {
	
	@FindBy(xpath = "//input[@value = 'Add Item']")
	private WebElement btnAddItem;
	
	@FindBy(id = "empty-card")
	private WebElement btnEmptyCart;
	
	@FindBy(name = "itemName")
	private WebElement fldItemName;
	
	@FindBy(name = "itemDescription")
	private WebElement fldItemDescription;
	
	@FindBy(name = "itemPrice")
	private WebElement fldItemPrice;
	
	@FindBy(name = "itemQuantity")
	private WebElement fldItemQuantity;
	
	@FindBy(name = "cart")
	private WebElement areaCart;
	
	public void enterItemName(String itemName) {
		switchToFrame("right");
		fldItemName.clear();
		fldItemName.sendKeys(itemName);
	}
	
	public void enterItemDescription(String itemDescription) {
		switchToFrame("right");
		fldItemDescription.clear();
		fldItemDescription.sendKeys(itemDescription);
	}
	
	public void enterItemPrice(String itemPrice) {
		switchToFrame("right");
		fldItemPrice.clear();
		fldItemPrice.sendKeys(itemPrice);
	}
	
	public void enterItemQuantity(String itemQuantity) {
		switchToFrame("right");
		fldItemQuantity.clear();
		fldItemQuantity.sendKeys(itemQuantity);
	}

	public void clickOnAddItem() {
		switchToFrame("right");
		btnAddItem.click();
	}
	
	public void clickOnEmptyCart() {
		switchToFrame("right");
		btnEmptyCart.click();
	}
	
	public void addItem(String itemName) {
		enterItemName(itemName);
		clickOnAddItem();
	}
	
	public void addItem(String itemName, String description, String itemPrice, String itemQuantity) {
		enterItemName(itemName);
		enterItemDescription(description);
		enterItemPrice(itemPrice);
		enterItemQuantity(itemQuantity);
		clickOnAddItem();
	}
	
	public String getCartText() {
		switchToFrame("right");
		return areaCart.getText();
	}

	public void emptyCart() {
		clickOnEmptyCart();
		
	}
	
	
	public CartBuilder(WebDriver driver) {
		super(driver);
	}

}
