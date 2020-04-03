package validations_3_HAMCREST_Examples;
import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class HAMCREST_AllinOneEg_HardAssert {

@Test
public void HardAssert() {

	RestAssured.baseURI = "https://private-e57c7-sampletestapi2.apiary-mock.com";
	RestAssured.basePath = "";
										
	given().contentType(ContentType.JSON)
			.get("/search")
			.then()
			.body("limit", equalTo(22))
			.body("limit", greaterThan(10))
			.body("limit", lessThan(22))
			.body("limit", greaterThanOrEqualTo(20))
			.body("limit", lessThanOrEqualTo(22))
			.body("results.name.de-DE",hasItems ("Redner","Kopfhrer"))		
			.body("results.id",hasItem ("2e7c7d14-6e8a-441f-a325-9ba1961f69a5"))
			.body("results[0].description",hasEntry("da-DK","Category description"))
			.body("results[0].description",hasKey("da-DKzzzz"));
	Response resp = 	given().contentType(ContentType.JSON).get("/search");	
	resp.prettyPrint();
}							
}							



