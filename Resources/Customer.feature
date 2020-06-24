Feature: Customer

@Regression
Scenario: Add a new customer
	Given User launch browser and application URL
	When User enters email and password
	And Click on login button
	Then User can view dashboard
	When Click on customer menus
	And Click on customer menu item
	And Click on add new buttom
#	Then User can view customer page
#	When User input customer information
#	And Click on save button
#	Then User can see confirmation "The new customer has been added successfully."

#@Smoke
#Scenario Outline: Search customer by email ID
#	Given User launch and open URL "https://admin-demo.nopcommerce.com/"
#	When User enters email "admin@yourstore.com" and password "admin"
#	And Click on login button
#	Then User can view dashboard
#	When Click on customer menus
#	And Click on customer menu item
#	And User enter customer email
#	And Click on search buttom
#	Then Email should found in search table
#	
#	Examples: 
#		|email				|password|
#		|admin@yourstore.com|admin	 |