package com.farmersinsurance.craft;

import java.io.IOException;
import java.time.ZoneId;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiKeys {
	public final String url="https://api.nasa.gov/planetary/apod";
	@Test
	//To validate when correct api key is entered
	public void testCheckKey() {
		HttpClient client=new HttpClient();
		try {
			
			ApodResponse apodResponse =client.getData(url+"?api_key=DEMO_KEY");
		
	Assert.assertEquals(java.time.LocalDate.now(ZoneId.of("Etc/UTC")).toString(),apodResponse.getDate());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	@Test
	//To validate when invalid api key is entered
	public void testCheckInvalidKey() {
		HttpClient client=new HttpClient();
		try {
			
			ApodResponse apodResponse =client.getData(url+"?api_key=12");
		
	Assert.assertEquals(403,apodResponse.getHttpCode());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
