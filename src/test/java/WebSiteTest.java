import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class WebSiteTest {

	private WebDriver driver;
	
	@BeforeSuite
	public void init() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}
	
	@Test
	public void test1() {
		driver.get("http://yandex.ru");
		
//		WebElement webElement = driver.findElement(By.cssSelector(".input__control.input__input"));
//		Assert.assertEquals(webElement.isEnabled(), true);
		
		WebElement webElement = driver.findElement(By.cssSelector(".input__control.input__input"));
		webElement.click();
		webElement.clear();
		webElement.sendKeys("Java");
		webElement.submit();
		
		List<WebElement> answerBlocks = driver
			.findElement(By.cssSelector(".content__left"))
			.findElements(By.cssSelector(".serp-item"));
		
		Assert.assertEquals(answerBlocks.size(), 16);
	}
}
