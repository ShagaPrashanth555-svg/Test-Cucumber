 package stepdefinitions;

 import cucumber.api.java.en.Then;
 import cucumber.api.java.en.When;
 import cucumber.api.java.en.Given;
 import cucumber.api.PendingException;
 import pageObject.GooglePage;

public class StepDefinition {
	
	GooglePage gp = new GooglePage();

	@Given("^I have open the GooglePage$")
	public void i_have_open_the_GooglePage() throws Throwable {
		gp.openBrowser();
	}
	
	@When("^I search JPMC word \"([^\"]*)\"$")
	public void i_search_JPMC_word(String KeyWord) throws Throwable {
		gp.searchKeyword(KeyWord);
	}
	
	@Then("^click first JPMC url ad verfiy logo$")
	public void click_first_JPMC_url_ad_verfiy_logo() throws Throwable {
		gp.navigateJPMCPage();
	}
}
