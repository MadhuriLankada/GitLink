

package StepDefinitions;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.Method;
@Test
public class TestAssure {
	
	String url="https://reqres.in/api/users?page=2";
	Response response;
	
	@Given("user is on api")
	public void user_is_on_api () {
	    // Write code here that turns the phrase above into concrete actions
         System.out.println("Given");
         RestAssured.baseURI = url;
	}

	@When("passing values from get method")
	public void passing_values_from_get_method() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when");
		RequestSpecification httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "https://reqres.in/api/users?page=2");
		
	}

	@Then("validate response received")
	public void validate_response_received() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then");
		response = RestAssured.given().get("https://reqres.in/api/users?page=2");
		int StatusCode = response.getStatusCode();
		Assert.assertEquals(StatusCode,200);
		String StatusLine = response.getStatusLine();
		Assert.assertEquals(StatusLine,"HTTP/1.1 200 OK");
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		
	}


}