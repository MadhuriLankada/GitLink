

import org.testng. annotations.DataProvider;

import org.testng. annotations. Test;
import io.restassured.RestAssured;
          public class DataParameterize {
          @DataProvider (name = "DeleteData")
          public Object[] dataForDelete() {
          return new Object[] {10,11,12,13,14};
          }
     @Test (dataProvider = "DeleteData") 
     public void test_delete(int userid) {
     RestAssured.baseURI = "https://reqres.in/api/users?page=2";
     RestAssured.given()
     .when()
     .delete("/users/"+userid).
     then ().
     statusCode (204);
    }
}
