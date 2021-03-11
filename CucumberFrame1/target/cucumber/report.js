$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Vegitable.feature");
formatter.feature({
  "name": "Search and Place Order for Vegitables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for Items and Validates the Result",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencard Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Veg_StepDefination.user_is_on_greencard_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serching for \"Cucumber\"",
  "keyword": "When "
});
formatter.match({
  "location": "Veg_StepDefination.user_serching_for_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Cucumber\" result are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Veg_StepDefination.something_result_are_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for Items and then move out to check out page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencard Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Veg_StepDefination.user_is_on_greencard_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serching for \"Brinjal\"",
  "keyword": "When "
});
formatter.match({
  "location": "Veg_StepDefination.user_serching_for_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Veg_StepDefination.added_item_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "Veg_StepDefination.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected \"Brinjal\" item are displayed in Check out page",
  "keyword": "Then "
});
formatter.match({
  "location": "Veg_StepDefination.verify_selected_something_item_are_displayed_in_check_out_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Search for Items and then move out to check out page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencard Landing Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User serching for \u003cname\u003e Vegitables",
  "keyword": "When "
});
formatter.step({
  "name": "Added item to cart",
  "keyword": "And "
});
formatter.step({
  "name": "User proceeded to checkout page for purchase",
  "keyword": "And "
});
formatter.step({
  "name": "verify selected \u003cname\u003e items are displayed in Check out page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name"
      ]
    },
    {
      "cells": [
        "Beetroot"
      ]
    },
    {
      "cells": [
        "Cauliflower"
      ]
    },
    {
      "cells": [
        "Carrot"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search for Items and then move out to check out page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencard Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Veg_StepDefination.user_is_on_greencard_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serching for Beetroot Vegitables",
  "keyword": "When "
});
formatter.match({
  "location": "Veg_StepDefination.user_serching_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Veg_StepDefination.added_item_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "Veg_StepDefination.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected Beetroot items are displayed in Check out page",
  "keyword": "Then "
});
formatter.match({
  "location": "Veg_StepDefination.verify_selected_item_are_displayed_in_check_out_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for Items and then move out to check out page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencard Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Veg_StepDefination.user_is_on_greencard_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serching for Cauliflower Vegitables",
  "keyword": "When "
});
formatter.match({
  "location": "Veg_StepDefination.user_serching_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Veg_StepDefination.added_item_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "Veg_StepDefination.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected Cauliflower items are displayed in Check out page",
  "keyword": "Then "
});
formatter.match({
  "location": "Veg_StepDefination.verify_selected_item_are_displayed_in_check_out_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for Items and then move out to check out page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on Greencard Landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Veg_StepDefination.user_is_on_greencard_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User serching for Carrot Vegitables",
  "keyword": "When "
});
formatter.match({
  "location": "Veg_StepDefination.user_serching_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Veg_StepDefination.added_item_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "Veg_StepDefination.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected Carrot items are displayed in Check out page",
  "keyword": "Then "
});
formatter.match({
  "location": "Veg_StepDefination.verify_selected_item_are_displayed_in_check_out_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});