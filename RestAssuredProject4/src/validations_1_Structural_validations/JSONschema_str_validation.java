package validations_1_Structural_validations;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import java.io.File;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class JSONschema_str_validation {

	@Test()
	
	public void getallStudents() throws Exception {
		
		RestAssured.baseURI="http://localhost:8080";
		RestAssured.basePath = "/student";
		
		File schema = new File (System.getProperty("user.dir")+"/Jsonschema.json");
		
		RestAssured.given().contentType(ContentType.JSON).
		log().all().get("/96").then().body(matchesJsonSchema(schema));		
	}	
}