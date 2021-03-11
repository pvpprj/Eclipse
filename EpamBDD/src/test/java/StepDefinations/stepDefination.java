package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;

public class stepDefination {

	 @Given("^User is on NetBanking Landing pages$")
	    public void user_is_on_netbanking_landing_pages() throws Throwable {
		 System.out.println("Navigate to login URL123"); 
	    }

	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	    	System.out.println("User enter Username and Password");
	    }

	    @Then("^Home page is populates$")
	    public void home_page_is_populates() throws Throwable {
	    	 System.out.println("Navigate to Home Page");
    
	    }

	    @And("^Cards are Displayeds$")
	    public void cards_are_displayeds() throws Throwable {
	    	 System.out.println("Card are Displayed");

	    }

}
