

import org.testng. Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Negative_Validation {
	  @Test
	public void ValidateResponseStatus1() {
			RestAssured.baseURI = "https://reqres.in/api/users?page=2";
			RequestSpecification httpResponse = RestAssured.given();
			Response response = httpResponse.request(Method.GET,"https://reqres.in/api/users/23");
			 String statusCode = response.getStatusLine();
			 Assert.assertEquals(statusCode, "HTTP/1.1 404 Not Found", "Correct status code");
			}
	  
	  @Test
	  public void ValidateResponseStatus2() {
	  RestAssured.baseURI = "https://reqres.in/api/users?page=2";
	  RequestSpecification httpResponse = RestAssured.given();
	  Response response = httpResponse.request(Method.POST,"{\r\n"
	  		+ "    \"name\": \"morpheus\",\r\n"
	  		+ "    \"job\": \"leader\"\r\n"
	  		+ "}");
	   String statusCode = response.getStatusLine();
	   Assert.assertEquals(statusCode, "HTTP/1.1 415 Unsupported Media Type", "Correct status code");
	  }
	  }

