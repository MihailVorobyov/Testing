import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseActions {
	
	private static final String HOME_PAGE_URL = "http://127.0.0.1:8080/";
	
	private static final By LOGIN_FORM = By.cssSelector(".sign-in-form");
	private static final By LOGIN_INPUT = By.cssSelector(".form-control.form-login");
	private static final By PASSWORD_INPUT = By.cssSelector(".form-control.form-password");
	
	private static final String LOGIN = "admin";
	private static final String PASSWORD = "admin";
	
	private static final By PRODUCTS_PAGE_REF = By.cssSelector(".products-page");
	
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public void home() {
		driver.get(HOME_PAGE_URL);
	}
	
	public void signIn() {
		typeInField(LOGIN_INPUT, LOGIN);
		typeInField(PASSWORD_INPUT, PASSWORD);
		
		driver.findElement(LOGIN_FORM).submit();
	}
	
	public void goToProductsPage () {
		go(PRODUCTS_PAGE_REF);
	}

}
