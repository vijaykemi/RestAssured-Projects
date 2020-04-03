package validations_3_HAMCREST_Examples;
import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class HAMCREST_Eg1 {


	@BeforeClass
	public void tc000() {

		RestAssured.baseURI = "https://private-e57c7-sampletestapi2.apiary-mock.com";
		RestAssured.basePath = "";

	}
	/*	
	@Test
	
	public void tc001() {

		given().get("/search").then().body("limit",equalTo (20));

	}
	
@Test
	
	public void tc002() {

		given().get("/search").then().body("results.name.de-DE",hasItems ("Redner","Kopfhrer"));

	}

@Test

public void tc003() {

	given().get("/search").then().body("results[0].description",hasKey("da-DK"));

}
*/
@Test

public void tc004() {
	
	//List<HashMap<String,Object>> list=given().get("/search").then().extract().path("results.findAll{it.id='2e7c7d14-6e8a-441f-a325-9ba1961f69a5'}");

	//System.out.println("informations about speaker  "+ list);
	
given().get("/search").then().body("results.findAll{it.id=='2e7c7d14-6e8a-441f-a325-9ba1961f69a5'}",hasItems(hasEntry("key","version")));
	
	//given().get("/search").then().body("results.findAll{it.id=='2e7c7d14-6e8a-441f-a325-9ba1961f69a5'}", hasItem("id"));
	
	//given().get("/search").then().body("items.findAll{it.name=='Apple iPod touch 128GB'}", hasItems(hasEntry("name","Apple iPod touch 128GB")));

}
	
	}
	
