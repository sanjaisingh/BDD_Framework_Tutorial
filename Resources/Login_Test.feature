Feature: Application Login
	
	@Sprint_1
	Scenario: Successfull login with valid credentials
		Given User launch browser and application URL
		When User enters email and password
		And Click on login button
		Then Page title should be "Dashboard / nopCommerce administration"
		When Click on logout link
		Then Page title should be "Your store. Login"