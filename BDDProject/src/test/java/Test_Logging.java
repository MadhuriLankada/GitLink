import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Test_Logging {
	
	@Test
	void login() {
		
		
		System.out.println("**********GET1**********");
		RestAssured.given()
		.when().log().all()
		.get("https://reqres.in/api/users?page=2")
		.then().log().all();
		
        System.out.println("**********GET2**********");
		RestAssured.given()
		.when().log().all()
		.get("https://reqres.in/api/users/2")
		.then().log().all();
		
		System.out.println("**********POST1**********");
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.when().log().all()
		.get("https://reqres.in/api/users?page=2")
		.then().log().status();
		
		System.out.println("**********PUT**********");
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}")
		.when().log().all()
		.get("https://reqres.in/api/users?page=2")
		.then().log().status();
		
			
		
	}	
}
 