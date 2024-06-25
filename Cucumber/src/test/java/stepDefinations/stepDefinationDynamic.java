package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;



public class stepDefinationDynamic {

	@When("^user login into application with \"([^\"]*)\" username and password\"([^\"]*)\"$")
	public void user_login_into_application_with_username_and_password(String name,String Password) {
		//code
		System.out.println(name);
		System.out.println(Password);
	 }
	
	@And("^User name\"([^\"]*)\" is dispalyed")
	public void User_name_is_dispalyed(String Name) {
		//code
		System.out.println(Name);
	}

}
