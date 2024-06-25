package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class stepDefinations {

	@Given("^User is on landing Page$")
	public void user_is_on_landing_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("navigate");
	}
	
	@When("^user login into application with username and password$")
	public void user_login_into_application_with_username_and_password() {
		//code
		System.out.println("Username and Password");
	}
	@Then("^Home Page is populated$")
	public void Home_Page_is_populated() {
		//code
		System.out.println("Home page");
	}
	@And("^User name is dispalyed")
	public void User_name_is_dispalyed() {
		//code
		System.out.println("name");
	}

}
