package validations_2_Actual_Validations_of_JSONdata;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
public class JSONAssertEx_NON_EXTENSIBLE {

/*
	@Test
	public static void test001(){
		
		String actualval = "{id:1,name:\"john\",course:\"CSE\"}";
		String expval = "{id:1,name:\"john\"}";	
		JSONAssert.assertEquals(expval, actualval, JSONCompareMode.NON_EXTENSIBLE);
	}
	
*/
	@Test
	public static void test002(){
		
		String actualval = "{id:1,name:\"john\",values:[\"samsung\",\"apple\"]}";
		String expval = "{id:1,name:\"john\",values:[\"apple\",\"samsung\"]}";	
		JSONAssert.assertEquals(expval, actualval, JSONCompareMode.NON_EXTENSIBLE);
	}

}
