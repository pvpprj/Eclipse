Feature: Search and Place Order for Vegitables

@SeleniumTest
Scenario: Search for Items and Validates the Result
Given User is on Greencard Landing Page
When User serching for "Cucumber"
Then "Cucumber" result are displayed

@SeleniumTest
Scenario: Search for Items and then move out to check out page
Given User is on Greencard Landing Page
When User serching for "Brinjal"
And Added item to cart
And User proceeded to checkout page for purchase
Then verify selected "Brinjal" item are displayed in Check out page


@SeleniumTest
Scenario Outline: Search for Items and then move out to check out page
Given User is on Greencard Landing Page
When User serching for <name> Vegitables
And Added item to cart
And User proceeded to checkout page for purchase
Then verify selected <name> items are displayed in Check out page

Examples:

|name     |
|Beetroot |
|Cauliflower  |
|Carrot  |

