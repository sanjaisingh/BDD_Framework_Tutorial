package stepDefinitions;

import org.junit.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CustomerPage;
import pageObjectsManager.FileReaderManager;
import testDataTypes.CustomerData;

public class CustomerSteps {
	
	TestContext testContext;
	CustomerPage customerPage;
	
	public CustomerSteps(TestContext testContext) {
		this.testContext = testContext;
		customerPage = testContext.getPageObjectManager().getCustomerPageInstance();
	}	
	
	@Then("^User can view dashboard$")
	public void user_can_view_dashboard() {
		System.out.println("Done");
		
		CustomerData customer = FileReaderManager.getInstance().jsonDataReader().getCustomerByName("Lakshay");
		
		System.out.println(customer.firstName);
		System.out.println(customer.lastName);
		System.out.println(customer.age);
		System.out.println(customer.emailAddress);
		System.out.println(customer.address.city);
		System.out.println(customer.address.country);
		System.out.println(customer.address.county);
		System.out.println(customer.address.postCode);
		System.out.println(customer.address.state);
		System.out.println(customer.address.streetAddress);
		System.out.println(customer.phoneNumber.home);
		System.out.println(customer.phoneNumber.mob);
		//Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());
	}

	@When("^Click on customer menus$")
	public void click_on_customer_menus() throws Exception {
		customerPage.clickOnCustomerMenu();
	}

	@When("^Click on customer menu item$")
	public void click_on_customer_menu_item() throws Exception {
		//customerPage = new CustomerPage(driver);
		customerPage.clickOnCustomerMenuItem();
	}

	@When("^Click on add new buttom$")
	public void click_on_add_new_buttom() throws Exception {
		//customerPage = new CustomerPage(driver);
		customerPage.clickOnCustomerAddNew();
	}

	@Then("^User can view customer page$")
	public void user_can_view_customer_page() {
		
	}

	@When("^User input customer information$")
	public void user_input_customer_information() {
		
	}

	@When("^Click on save button$")
	public void click_on_save_button() {
		
	}

	@Then("^User can see confirmation \"([^\"]*)\"$")
	public void user_can_see_confirmation(String arg1) {
		
	}
	
	@When("^User enter customer email$")
	public void user_enter_customer_email() {
		//customerPage = new CustomerPage(driver);
		customerPage.setSearchEmail("victoria_victoria@nopCommerce.com");
	}

	@When("^Click on search buttom$")
	public void click_on_search_buttom() throws Exception {
		customerPage.clickOnSearchButton();
	}

	@Then("^Email should found in search table$")
	public void email_should_found_in_search_table() {
		Boolean status = customerPage.verifySearchCustomerByEmail("victoria_victoria@nopCommerce.com");
		Assert.assertEquals(true, status);
	}
}
