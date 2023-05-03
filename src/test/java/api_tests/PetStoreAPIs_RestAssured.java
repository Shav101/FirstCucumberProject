package api_tests;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

public class PetStoreAPIs_RestAssured {
	
	String baseUrl = "https://petstore.swagger.io/v2";
	Response response;
	
	
	@Test
	public void findPetsByStatus() {
		// The test is directly calling to the end point and validating just two items
		// statuscode and content type
		
		//     variable
		String endpoint = "/pet/findByStatus";
		given().contentType("application/json")
		.accept(ContentType.JSON)
		.when().get(baseUrl + endpoint + "?status=sold")
		.then().statusCode(200)
		.and().contentType("application/json")
		.log().all();
		
		
	}
	
	@Test
	public void findPetsByStatus_providingQueryParameter() {
		// The test is directly calling to the end point with query parameter as a header
		// And getting the response into a Response object,
		// Then validating statuscode and content type
		
		//     variable
		String endpoint = "/pet/findByStatus";
		response = given().contentType("application/json")
		.accept(ContentType.JSON)
		.queryParam("statuc", "sold")
		.when().get(baseUrl + endpoint)
		.thenReturn();
		
		response.prettyPrint();
		
		assertEquals(response.getStatusCode(),200);
		assertEquals(response.getContentType(),"application/json");
		
	}

}
