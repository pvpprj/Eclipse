Feature: Application Login

@RegTest
Scenario: Home page default login
Given User is on NetBanking Landing pages
When User login into application with "jin" and password "1234"
Then Home page is populates
And Cards Displayeds are "True"
 
