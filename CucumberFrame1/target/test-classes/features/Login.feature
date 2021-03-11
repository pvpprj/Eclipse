Feature: Application Login


@MobileTest
Scenario: Home page default login
Given User is on NetBanking Landing pages
When User login into application with "jin" and password "1234"
Then Home page is populates
And Cards Displayeds are "True"
 
 @WebTest
Scenario: Home page default login
Given User is on NetBanking Landing pages
When User login into application with "john" and password "4321"
Then Home page is populates
And Cards Displayeds are "False"
 
@MobileTest
Scenario: Home page default login
Given User is on NetBanking Landing pages
When User login into application with "Rahul" and password "0987"
Then Home page is populates
And Cards Displayeds are "False"
  
  @WebTest
Scenario Outline: Home page default login
Given User is on NetBanking Landing pages
When User login in to application with <Username> and password <password>  
Then Home page is populates
And Cards Displayeds are "True"
 
Examples:
|Username |password|
|user1 		|pass1   |
|user2 		|pass2   |
|user3 		|pass3   |
|user4 		|pass4   | 
  
 