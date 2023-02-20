package Api.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import net.minidev.json.JSONObject;

public class Pojo_PostRequest {
	
//Generate getters and setters
	
	String name;
	String job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
//send post request using POJO class
	@Test
	void TestPostUsingPojo()
	{
		
		Pojo_PostRequest data= new Pojo_PostRequest();
		     data.setName("sydni");
		     data.setJob("doctor");
		
		given()
		   .contentType("application/json")
		   .body(data)
		
		.when()
		   .post("https://reqres.in/api/users")
		   
		.then()
		   .statusCode(201)
		   .body("name",equalTo("sydni"))
		   .body("job",equalTo("doctor"))
		   .log().all();
		  
		
	}

}

