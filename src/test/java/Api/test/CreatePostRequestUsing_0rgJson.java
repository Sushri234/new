package Api.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import net.minidev.json.JSONObject;

public class CreatePostRequestUsing_0rgJson {
	
	
	 //Create post request body using org.json 
    
    void TestPostUsingOrgJson()
    {
    	
    	JSONObject data = new JSONObject();
    	data.put("name", "syandi");
    	data.put("job", "doctor");
    	
    	given()
    	   .contentType("application/json")
    	   .body(data)
    	
    	.when()
    	   .post("https://reqres.in/api/users")
    	   
    	.then()
    	   .statusCode(201)
    	   .body("name",equalTo("syandi"))
    	   .body("job",equalTo("doctor"))
    	   .log().all();
    	  
    	
    }
    


}
