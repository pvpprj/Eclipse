package stepDefinations;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.CheckOutPage;
import PageObject.HomePage;
import cucumberOption.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Veg_StepDefination {
	
	public WebDriver driver;
	HomePage h;
	CheckOutPage c;
	
	@Given("^User is on Greencard Landing Page$")
    public void user_is_on_greencard_landing_page() throws Throwable {
		driver=Base.getDriver();		
		
    }

	@When("^User serching for \"([^\"]*)\"$")
    public void user_serching_for_something(String strArg1) throws Throwable {
    	h=new HomePage(driver);
    	h.getsearch().sendKeys(strArg1);
    	
    	Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" result are displayed$")
    public void something_result_are_displayed(String strArg1) throws Throwable {

    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }

    @Then("^verify selected \"([^\"]*)\" item are displayed in Check out page$")
    public void verify_selected_something_item_are_displayed_in_check_out_page(String strArg1) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    }

    @And("^Added item to cart$")
    public void added_item_to_cart() throws Throwable {
       driver.findElement(By.cssSelector("a.increment")).click(); Thread.sleep(2000);
       driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();  Thread.sleep(2000);
    }

    @And("^User proceeded to checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
       driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click(); Thread.sleep(2000);
       driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();  Thread.sleep(2000);      
    }
	
    @When("^User serching for (.+) Vegitables$")
    public void user_serching_for(String name) throws Throwable {
    	h=new HomePage(driver);
    	h.getsearch().sendKeys(name);
    	Thread.sleep(2000);      
    }
    
    
    @Then("^verify selected (.+) items are displayed in Check out page$")
    public void verify_selected_item_are_displayed_in_check_out_page(String name) throws Throwable {
    	
    	c=new CheckOutPage(driver);
    	Assert.assertTrue(c.getProductName().getText().contains(name));
    	  	Thread.sleep(2000);     
    }
    
}
