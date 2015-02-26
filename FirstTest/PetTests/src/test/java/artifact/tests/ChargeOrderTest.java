package artifact.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import artifact.base.BaseTests;

public class ChargeOrderTest extends BaseTests {
	
	@BeforeMethod
	public void navigateToChargeOrderPage() {
		blockNavigation.clickOnChargeOrderLink();
	}

	@Test
	public void testAddFullCorrectItem() {
		pageChargeOrder.addItem("12456", "135");
		Assert.assertTrue(pageChargeOrder.getCartText().contains("google-order-number=\"12456\""));
		Assert.assertTrue(pageChargeOrder.getCartText().contains("135.0</amount>"));		
	}
	
	@Test
	public void testClearCartWithFullItem() {
		pageChargeOrder.addItem("12456", "135");
		pageChargeOrder.emptyCart();
		Assert.assertFalse(pageChargeOrder.getCartText().contains("google-order-number=\"12456\""));
		Assert.assertFalse(pageChargeOrder.getCartText().contains("135.0</amount>"));
	}

}
