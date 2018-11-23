package RestAssuredGet;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class GetData {
  @Test
  public void f() {
	  
	  
	  Response resp=RestAssured.get("http://data-qa1.bestbuy.com/v1/productVariation/id/sku/5768401");
	  int code=resp.getStatusCode();
	  System.out.println(code);
  }
}
