package Api.test;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;//static packages
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import org.testng.annotations.Test;

import net.minidev.json.JSONObject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class CreatePostRequestUsing_Hashmap {
	
	
@Test
	//post request body using HashMap
	  void TestPostUsinghHashmap()
	   {
		HashMap data = new HashMap();
		data.put("name", "sushri");
		data.put("job", "engineer");
		//
		
		/*String courseArr[]= {"c++","python"};
		data.put("course", courseArr);*/
		
		
		given()
		  .contentType("Application/json")
		  .body(data)
		
		.when()
		  .post("https://reqres.in/api/users")
		  
		.then()
		   .statusCode(201)
		   .body("name",equalTo("sushri"))
		   .body("job", equalTo("engineer"))
		   
		   //
		 /*.body("courses[0]",equalTo("c++"))
		   .body("courses[1]",equalTo("python"))
		   .header("Content-Type","Application/json;charset=utf-8")   */
		   
		   .log().all();
		}
	
	    void deleterequest()
	    {
	    	
	    	given()
	    	
	    	.when()
	    	  .put("http://localhost:3000/student")
	    	.then()
	    	   .statusCode(204)
	    	   .log().all();
	    }

     
}





