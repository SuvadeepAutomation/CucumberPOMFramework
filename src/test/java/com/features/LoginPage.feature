Feature: Login Page Functionality
  I want to test the Login Page Functionality


Scenario: Verify the login page title
	Given user is on login page
 	When user gets the title of the page
 	Then page title should be "Login - My Store"

Scenario: Forgot Password link
	Given user is on login page
	Then forgot your password link should be displayed

Scenario: Login with correct credentials
	Given user is on login page
	When user enters username "suvadeepbasu1@gmail.com"
	And user enters password "Covid@1210"
	And user clicks on Login button

