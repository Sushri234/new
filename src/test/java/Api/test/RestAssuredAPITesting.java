package Api.test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;//static packages
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

public class RestAssuredAPITesting {
	
	
	int id; //create a global variable ID to access in every method
	
//To Get Users details
	
	  @Test (priority=1)
	  void getusers() { 
	   
	   given()
	   
	  .when() 
	  .get("https://reqres.in/api/users?page=2")
	  
	  .then() 
	  .statusCode(200)
	  .body("page",equalTo(2)) 
	  .log().all(); //this will display entire response in the console window 
	  }
	  
//Send request To create The Users
	  
	@Test(priority=2)
	void createUsers()
	{
		HashMap data= new HashMap();
		data.put("name", "sushri");
		data.put("job", "engineer");
		
		id=given()
		  .contentType("application/json")
		   .body(data)
		
		.when()
		  .post("https://reqres.in/api/users")
		  .jsonPath().getInt("id");
		  
		//.then()
		//.statusCode(201)
		//.log().all();
	   }
	
//Send request To Update the Users
	
	@Test(priority=3, dependsOnMethods= {"createUsers"})
	
	 void updateUser()
	 {
		
		HashMap data =new HashMap();
		data.put("name","sangita");
		data.put("job", "trainer");
		
		given()
		  .contentType("application/json")
		  .body(data)
		
		.when()
		  .put("https://reqres.in/api/users/"+id)
		 
		.then()
		  .statusCode(200)
		  .log().all();
		
	 }
	
//To delete the Users
	
	/*@Test(priority=4)
	void deleteUsers()
	{
		
		
		given()
		   
		.when()
		   .delete("https://reqres.in/api/users/2"+id)
		    
		.then()
		   .statusCode(204)
		   .log().all();
	}*/
	
	
	

}



