package firelwan;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Store;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class Stopperstack {
	
	public static String baseURL="https://www.shoppersstack.com/shopping";

	@Test
	public void LoginToStopperstack() {
		HashMap<String , String> loginData=new HashMap<String, String>();
		loginData.put("email", "manojbalasubramaniyam4488@gmail.com");
		loginData.put("password", "Password@123");
		loginData.put("role", "SHOPPER");
		
		String loginreponse=RestAssured.given().contentType(ContentType.JSON).body(loginData).log().all()
		            .when().post(baseURL+"/users/login")
		            .then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js=new JsonPath(loginreponse);
		Object shopperId=js.get("data.userId");
		Object token= js.get("data.jwtToken");
		System.out.println(shopperId);
		Store store=new Store();
		String id=shopperId.toString();
		store.setId(id);
		Assert.assertEquals(shopperId, 38225);
		System.out.println(token);
	}
}
