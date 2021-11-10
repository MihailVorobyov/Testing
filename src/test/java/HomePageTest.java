import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseUITest {
	private static final String WELCOME_TEXT = "Добро пожаловать в наш интернет-магазин";
	
	@Test
	public void findWelcome() {
		homePage.home();
		Assert.assertTrue(homePage.findString(WELCOME_TEXT));
	}
	
	@Test
	public void tryToLogin() {
		homePage.home();
		homePage.signIn();
		Assert.assertFalse(homePage.isElementPresent(By.name("username")) || homePage.isElementPresent(By.name("password")));
	}

}
