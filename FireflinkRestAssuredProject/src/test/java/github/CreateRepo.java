package github;

import java.util.HashMap; 
import org.testng.annotations.Test; 
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class CreateRepo {
	
	@Test
	public void CreateARepo() {
		HashMap<String, String> bodyOrPayload=new HashMap<String, String>();
		bodyOrPayload.put("name", "MyRepo");
		bodyOrPayload.put("description", "MyCodes");
		bodyOrPayload.put("private", "true"); 
      RestAssured.given().body(bodyOrPayload).headers("Authorization","Bearer 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")
      .when().post("https://api.github.com/user/repos")
      //loging all the respons body
      .then().log().all().
      //validating Status Code
      assertThat().statusCode(201)
      //validating Body
      .body("name",equalTo("MyRepo"))
      .body("description",equalTo ("MyCodes"))
      .body("private", equalTo("true"))
      //validating Header
      .header("Server", equalTo("GitHub.com"));
	}
}
