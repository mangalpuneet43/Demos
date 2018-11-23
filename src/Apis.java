import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Apis {

	public static void main(String[] args) {

		  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		  
		  
		  RequestSpecification httprequest= RestAssured.given();
		  
		 
		  
		  Response response=httprequest.get("/Hyderabad");
		  
		  ResponseBody body=response.getBody();
		  
		  System.out.println(body.asString());
		  
	
		  RegistraionSuccessPage page=body.as(RegistraionSuccessPage.class);
		  
		  System.out.println(page.City);
		  
		  Assert.assertEquals("Hyderabad",page.City);
		  
		  Assert.assertEquals("30 Degree celsius",page.Temperature);
		  
		  

	}

}
