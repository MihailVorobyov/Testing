import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ShopPage extends BaseActions {
	
	private static final By PRODUCT_TABLE = By.cssSelector(".product-table");
	private static final By PRODUCT_ROW = By.cssSelector(".one-product");
	
	public ShopPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public List<WebElement> findProducts() {
		List<WebElement> productElements = driver
			.findElement(PRODUCT_TABLE)
			.findElements(PRODUCT_ROW);
		
		return productElements;
	}
	
}
