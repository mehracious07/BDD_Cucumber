Feature:  feature to test login functionality
Scenario:  Check login is sucessful for valid credentials
	Given  the user is on the login page
	When   user enters a valid username
	And    user enters a valid password
	And    clicks the login button
	Then   the user should be redirected to the Dashboard
	
Scenario: Check login is unsuccessful for invalid credentials
   Given the user is on the login page
   When user enters an invalid username
   And user enters an invalid password
   And clicks the login button
   Then an error message Invalid Credentials should be displayed
   
#Background:
 #Given the user is on the login page of site2
 
@sanity
Scenario Outline: Login with multiple users
   Given the user is on the login page
   When user enters "<username>" and "<password>"
   And clicks the login button
   Then user should see "<expected>"

Examples:
  | username | password  | expected             |
  | Admin    | admin123  | Dashboard            |
  | wrong    | wrong123  | Invalid credentials  |


 