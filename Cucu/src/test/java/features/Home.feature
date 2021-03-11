Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking Landing page
When User login into application with username and password
Then Home page is populate
And Cards is Displayed
 
