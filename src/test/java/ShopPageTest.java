import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopPageTest extends BaseUITest{
	private static final int PRODUCTS_PER_PAGE = 5;
	
	
	
	@Test
	public void findProducts() {
		homePage.home();
		homePage.goToProductsPage();
		Assert.assertEquals(shopPage.findProducts().size(), PRODUCTS_PER_PAGE);
	}
}
