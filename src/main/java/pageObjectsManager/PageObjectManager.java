package pageObjectsManager;

import org.openqa.selenium.WebDriver;

import pageObjects.CustomerPage;
import pageObjects.LoginPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private CustomerPage customerPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;		
	}

	public LoginPage getLoginPageInstance() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}
	
	public CustomerPage getCustomerPageInstance() {
		return (customerPage == null) ? customerPage = new CustomerPage(driver) : customerPage;
	}
}
