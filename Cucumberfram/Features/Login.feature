Feature: Application Login


Scenario: Home Page default login
Given User is on Netbanking landing page
When User login into application with username and password
Then Home page is populated
And Cards are displyed
 