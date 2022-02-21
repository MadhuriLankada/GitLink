

import org.testng. Assert;
import org.testng. annotations. Test;
import io.restassured. RestAssured;
import io.restassured.http.Method;
import io.restassured.response. Response;
import io.restassured.specification. RequestSpecification;

public class ValidationsResponseStatus {
	
	 @Test
	    public void ValidationResponseStatus() {
	 
	    RestAssured.baseURI = "https://reqres.in/api/users?page=2";
	    RequestSpecification httpResponse = RestAssured.given();
	    Response response = httpResponse.request(Method.GET,"https://reqres.in/api/users?page=2");
	    int statusCode = response.getStatusCode();
	    Assert.assertEquals(statusCode, 200, "Correct status code");
	   }
	  
	  @Test
	  public void ValidateResponseStatus1() {
	RestAssured.baseURI = "https://reqres.in/api/users?page=2";
	RequestSpecification httpResponse = RestAssured.given();
	Response response = httpResponse.request(Method.GET,"https://reqres.in/api/users/2");
	 String statusCode = response.getStatusLine();
	 Assert.assertEquals(statusCode, "HTTP/1.1 200 OK", "Correct status code");
	}
	  
		
}
