package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CustomerPage {
	
	WebDriver driver;
	
	public CustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[@class='btn bg-blue']")
	private WebElement addNewCustomer;
	
	@FindBy(how=How.XPATH, using="//a[@href='#'][1]//span[contains(text(),'Customers')]")
	private WebElement customerMenu;
	
	@FindBy(how=How.XPATH, using="(//span[@class='menu-item-title'][contains(text(),'Customers')])[1]")
	private WebElement customerMenuItem;
	
	@FindBy(how=How.ID, using="Email")
	private WebElement customerEmail;
	
	@FindBy(how=How.ID, using="Password")
	private WebElement customerPassword;

	@FindBy(how=How.ID, using="FirstName")
	private WebElement customerFirstname;	

	@FindBy(how=How.ID, using="LastName")
	private WebElement customerLastname;	

	@FindBy(how=How.ID, using="Gender_Male")
	private WebElement customerMaleGender;

	@FindBy(how=How.ID, using="Gender_Female")
	private WebElement customerFemaleGender;

	@FindBy(how=How.ID, using="DateOfBirth")
	private WebElement customerDOB;

	@FindBy(how=How.ID, using="Company")
	private WebElement customerCompanyName;

	@FindBy(how=How.ID, using="IsTaxExempt")
	private WebElement customerIsTextEmpty;

	@FindBy(how=How.XPATH, using="//input[@value='1']")
	private WebElement customerNewsletterName;

	@FindBy(how=How.XPATH, using="//input[@value='2']")
	private WebElement customerNewsletterStore;

	@FindBy(how=How.XPATH, using="//div[@class='k-multiselect-wrap k-floatwrap']")
	private WebElement customerRole;

	@FindBy(how=How.XPATH, using="//li[contains(text(),'Registered')]")
	private WebElement customerListRegistered;

	@FindBy(how=How.XPATH, using="//li[contains(text(),'Guests')]")
	private WebElement customerListGuests;

	@FindBy(how=How.ID, using="VendorId")
	private WebElement customerManagerVendor;

	@FindBy(how=How.ID, using="Active")
	private WebElement customerCustomerActive;

	@FindBy(how=How.ID, using="AdminComment")
	private WebElement customerAdminComment;

	@FindBy(how=How.XPATH, using="//button[@name='save']")
	private WebElement customerSaveInformation;
	
	@FindBy(how=How.ID, using="SearchEmail")
	private WebElement customerSearchEmail;
	
	@FindBy(how=How.ID, using="SearchFirstName")
	private WebElement customerSearchFirstname;
	
	@FindBy(how=How.ID, using="SearchLastName")
	private WebElement customerSearchLastname;
	
	@FindBy(how=How.ID, using="search-customers")
	private WebElement customerSearchButton;	
	
	@FindBy(how=How.XPATH, using="//table[@role='grid']")
	private WebElement tableSearchResults;
	
	@FindBy(how=How.XPATH, using="//table[@id='customers-grid']")
	private WebElement table;
	
	@FindBy(how=How.XPATH, using="//table[@id='customers-grid']/tbody/tr")
	private List<WebElement> tableRows;
	
	@FindBy(how=How.XPATH, using="//table[@id='customers-grid']/tbody/tr/td")
	private List<WebElement> tableColumns;
	
	public void clickOnCustomerMenu() throws Exception {
		customerMenu.click();
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", customerMenu);
	}
	
	public void clickOnCustomerMenuItem() throws Exception {
//		customerMenuItem.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", customerMenuItem);
	}
	
	public void clickOnCustomerAddNew() throws Exception {
//		addNewCustomer.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", addNewCustomer);
	}
	
	// Search
	
	public void setSearchEmail(String email) {
		customerSearchEmail.clear();
		customerSearchEmail.sendKeys(email);
	}
	
	public void setSearchFirstName(String email) {
		customerSearchFirstname.clear();
		customerSearchFirstname.sendKeys(email);
	}
	
	public void setSearchLastName(String email) {
		customerSearchLastname.clear();
		customerSearchLastname.sendKeys(email);
	}
	
	public void clickOnSearchButton() throws Exception {
		customerSearchButton.click();
		Thread.sleep(2000);
	}
	
	public boolean verifySearchCustomerByEmail(String email) {
		boolean flag = false;
		for(int index = 1; index <= tableRows.size(); index++) {
			String emailText = driver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+index+"]/td[2]")).getText();
			if(emailText.equalsIgnoreCase(email)) {
				flag = true;
			}
		}
		return flag;
	}
}
