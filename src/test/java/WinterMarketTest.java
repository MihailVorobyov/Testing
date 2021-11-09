import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class WinterMarketTest {

	private WebDriver driver;
	
	@BeforeSuite
	public void init() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}
	
	@Test
	public void test1() {
		driver.get("http://127.0.0.1:8080");
		
//		WebElement webElement = driver.findElement(By.cssSelector(".input__control.input__input"));
//		Assert.assertEquals(webElement.isEnabled(), true);
		
		WebElement loginInput = driver.findElement(By.cssSelector(".form-control.form-login"));
		loginInput.click();
		loginInput.clear();
		loginInput.sendKeys("admin");
		WebElement passwordInput = driver.findElement(By.cssSelector(".form-control.form-password"));
		passwordInput.click();
		passwordInput.clear();
		passwordInput.sendKeys("admin");
		
		passwordInput.submit();
		
		WebElement productsRef = driver.findElement(By.cssSelector(".products-page"));
		productsRef.click();
		
		List<WebElement> answerBlocks = driver
			.findElement(By.cssSelector(".product-table"))
			.findElements(By.cssSelector(".one-product"));
		
		Assert.assertEquals(answerBlocks.size(), 5);
	}
}
