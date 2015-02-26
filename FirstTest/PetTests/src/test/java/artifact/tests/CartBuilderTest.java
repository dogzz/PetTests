package artifact.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import artifact.base.BaseTests;

public class CartBuilderTest extends BaseTests {
	
	@Test
	public void testAddCorrectItem() {
		pageCartBuilder.addItem("ohohoho");
		Assert.assertTrue(pageCartBuilder.getCartText().contains("ohohoho"));
	}

}
