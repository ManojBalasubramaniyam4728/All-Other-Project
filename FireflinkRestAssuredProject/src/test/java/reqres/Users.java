package reqres;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Users {

	//Get Method
	@Test
	public void ListUsers() {
		RestAssured.given()
		.when().get("https://reqres.in/api/users?page=2")
		.then().assertThat().statusCode(200).log().all();
	}
	
	//Post Method
	@Test
	public void CreateUser() throws InterruptedException {
		HashMap<String, String> data=new HashMap<String, String>();
		data.put("name", "morpheus");
		data.put("job", "leader");
		RestAssured.given().body(data)
		.when().get("https://reqres.in/api/users")
		.then().assertThat().statusCode(200).log().all();
	}
}
