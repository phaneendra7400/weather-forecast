package src.test;


/**
 * @author ramasrid
 *
 */
public class WeatherTest {

	@BeforeClass
	public static void setup() {
		// code for init variables
	}

	/**
	 * This method is used to check whether Internet is working or not
	 */
	@Test
	public void makeSureThatYouHaveActiveInternet() {
		given().when().get("http://www.google.com").then().statusCode(200);
	}

	/**
	 * This method is used to validate the status code of the WebService using
	 * Status Code flag and will pass if it has status code as 200
	 */
	@Test
	public void weatherValidWebserviceStatusCode() {
		String validUrl = "http://api.openweathermap.org/data/2.5/forecast?APPID=019a736fd448ec0464f324f3f7063003&units=metric&q=Bangalore,IN&mode=json";
		given().when().get(validUrl).then().statusCode(200);
	}

	/**
	 * This method is used to validate the status code of the WebService using
	 * Status Code flag and will pass if it has status code as 401
	 */
	@Test
	public void weatherInValidWebserviceStatusCode() {
		String inValidUrl = "http://api.openweathermap.org/data/2.5/forecast?APPID=sridhar&units=metric&q=Bangalore,IN&mode=json";
		given().when().get(inValidUrl).then().statusCode(401);
	}

}
