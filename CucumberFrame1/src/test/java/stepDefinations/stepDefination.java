package stepDefinations;

import java.util.List;
import org.junit.runner.RunWith;
import gherkin.ast.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	
	 @Given("^User is on NetBanking Landing pages$")
	    public void user_is_on_netbanking_landing_pages() throws Throwable {
		 System.out.println("Navigate to login URL");
	    }

	    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    	System.out.println(strArg1);
			System.out.println(strArg2);
	    }

	    @Then("^Home page is populates$")
	    public void home_page_is_populates() throws Throwable {
	    	System.out.println("Validated Home Page");
	    }

	    @And("^Cards Displayeds are \"([^\"]*)\"$")
	    public void cards_displayeds_are_something(String strArg1) throws Throwable {
	    	System.out.println(strArg1);   
	    }
	    
	    @When("^User login in to application with (.+) and password (.+)$")
	    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable {
	    	System.out.println(username); 
	    	System.out.println(password); 
	    }
}