package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageObjectsManager.FileReaderManager;

public class LoginPage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver remoteDriver) {
		driver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}

	@FindBy(how=How.ID, using="Email")
	private WebElement txtEmail;
	
	@FindBy(how=How.ID, using="Password")
	private WebElement txtPassword;
	
	@FindBy(how=How.XPATH, using="//input[@value='Log in']")
	private WebElement btnLogin;
	
	@FindBy(how=How.LINK_TEXT, using="Logout")
	private WebElement linkLogout;
	
	public void navigateToHomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void setUsername(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		linkLogout.click();
	}
	
	public void quit() {
		driver.quit();
	}
}
