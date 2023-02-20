package Api.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;




public class PostRequestUsing_ExternalJsonFile {
	
	@Test
	void External_jsonfile() throws FileNotFoundException 
	
	{
		
		    File f = new File("C:\\Users\\DELL\\Documents\\body.json");
		    FileReader fr = new FileReader(f);
		    JSONTokener jt = new JSONTokener(fr);
		    JSONObject data =  new JSONObject(jt);
		    
		    given()
			   .contentType("application/json")
			   .body(data.toString())
			   
			.when()
			   .post("https://reqres.in/api/users")
			   
			.then()
			   .statusCode(201)
			   .body("name",equalTo("sydni"))
			   .body("job",equalTo("doctor"))
			   .log().all();
			  
			
		}

	
	}
		
		
		
		
	


