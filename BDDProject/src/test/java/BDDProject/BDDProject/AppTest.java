package BDDProject.BDDProject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
	/*
	 * @Test public void shouldAnswerWithTrue() { assertTrue(true); }
	 */
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		System.out.println("step1:user enters login page");
	}

	@When("user enters username n password")
	public void user_enters_username_n_password() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
		System.out.println("step2:validates username and password");
	}

	@Then("open homepage")
	public void open_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	 //throw new io.cucumber.java.PendingException();
	    System.out.println("step3:open homepage");
	}

	
}
