$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Customer.feature");
formatter.feature({
  "line": 1,
  "name": "Customer",
  "description": "",
  "id": "customer",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7854207400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add a new customer",
  "description": "",
  "id": "customer;add-a-new-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch browser and application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters email and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User can view dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on customer menus",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click on customer menu item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on add new buttom",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_launch_and_open_URL()"
});
formatter.result({
  "duration": 4020969300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_email_and_password()"
});
formatter.result({
  "duration": 586173500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_login_button()"
});
formatter.result({
  "duration": 8976389500,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.user_can_view_dashboard()"
});
formatter.result({
  "duration": 405774700,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.click_on_customer_menus()"
});
formatter.result({
  "duration": 134419800,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.click_on_customer_menu_item()"
});
formatter.result({
  "duration": 4058242300,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.click_on_add_new_buttom()"
});
formatter.result({
  "duration": 5186686800,
  "status": "passed"
});
formatter.after({
  "duration": 1026718400,
  "status": "passed"
});
formatter.uri("Login_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6248691900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Successfull login with valid credentials",
  "description": "",
  "id": "application-login;successfull-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sprint_1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launch browser and application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters email and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on logout link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_launch_and_open_URL()"
});
formatter.result({
  "duration": 2123637400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_email_and_password()"
});
formatter.result({
  "duration": 583167700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_login_button()"
});
formatter.result({
  "duration": 9442685700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "LoginSteps.page_title_should_be(String)"
});
formatter.result({
  "duration": 2604900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_logout_link()"
});
formatter.result({
  "duration": 3392191400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "LoginSteps.page_title_should_be(String)"
});
formatter.result({
  "duration": 97300,
  "status": "passed"
});
formatter.after({
  "duration": 1101963000,
  "status": "passed"
});
});