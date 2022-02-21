import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

   public class Test_Negative1 {
	@Test
	void login() {
	
		
			 System.out.println("**********GET**********");
				
				RestAssured.given()
				.when().log().all()
				.get("https://reqres.in/api/users/23")
				.then().log().status();
				
				
//				System.out.println("**********POST1**********");
//				RestAssured.given()
//				.contentType(ContentType.JSON)
//				.body("{\r\n"
//						+ "    \"email\": \"\"\r\n"
//						+ "}")
//				.when().log().all()
//				.get("https://reqres.in/api/users?page=2")
//				.then().log().status();
		

		}	
}
