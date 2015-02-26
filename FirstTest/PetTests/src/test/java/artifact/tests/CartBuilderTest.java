package artifact.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import artifact.base.BaseTests;

public class CartBuilderTest extends BaseTests {
	
	@BeforeMethod
	public void navigateToCartBuilderPage() {
		blockNavigation.clickOnCartBuilderLink();
	}
	
	@Test
	public void testAddCorrectItem() {		
		pageCartBuilder.addItem("ohohoho");
		Assert.assertTrue(pageCartBuilder.getCartText().contains("ohohoho"));
	}
	
	@Test
	public void testAddFullCorrectItem() {
		pageCartBuilder.addItem("The Name", "Full Item Description", "11", "8");
		Assert.assertTrue(pageCartBuilder.getCartText().contains("The Name"));
		Assert.assertTrue(pageCartBuilder.getCartText().contains("Full Item Description"));
		Assert.assertTrue(pageCartBuilder.getCartText().contains(">11.0</unit-price>"));
		Assert.assertTrue(pageCartBuilder.getCartText().contains("<quantity>8</quantity>"));
	}
	
	@Test
	public void testClearCartWithFullItem() {
		pageCartBuilder.addItem("The Name", "Full Item Description", "11", "8");
		pageCartBuilder.emptyCart();
		Assert.assertFalse(pageCartBuilder.getCartText().contains("The Name"));
		Assert.assertFalse(pageCartBuilder.getCartText().contains("Full Item Description"));
		Assert.assertFalse(pageCartBuilder.getCartText().contains(">11.0</unit-price>"));
		Assert.assertFalse(pageCartBuilder.getCartText().contains("<quantity>8</quantity>"));
	}

}
