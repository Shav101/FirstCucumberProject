package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHomePage;
import utilities.AmazonUtils;
import utilities.DataReader;
import utilities.Driver;

public class AmazonSearchSteps {
	
	AmazonHomePage amazon = new AmazonHomePage();
	AmazonUtils utils = new AmazonUtils();
	
	
	@Given("I am on Amazon homepage")
	public void i_am_on_amazon_homepage() {
	    Driver.getDriver().get(DataReader.getProperty("amazonUrl"));
	    
	}
	@Then("I verify that I am on the Amazon homepage")
	public void i_verify_that_i_am_on_the_amazon_homepage() {
		String homepageTitle = Driver.getDriver().getTitle();
	    Assert.assertEquals(homepageTitle, "Amazon.com. Spend less. Smile more.");
		
	}
	@When("i search for {string} and click search")
	public void i_search_for_and_click_search(String testdata) {
	    utils.actionsSendkeys(amazon.searchField, testdata);
		amazon.searchButton.click();
	}
	@Then("verify that I am on the search result page")
	public void verify_that_i_am_on_the_search_result_page() {
	    Driver.getDriver().getTitle();
		
	}
	@When("I get text of the search criteria text element")
	public void i_get_text_of_the_search_criteria_text_element() {
	    amazon.searchResult.getText();
		
	}
	@Then("I verify that the search criteria text matches the search input")
	public void i_verify_that_the_search_criteria_text_matches_the_search_input() {
	    Assert.assertTrue(amazon.searchResult.isDisplayed());
		
	}

}
