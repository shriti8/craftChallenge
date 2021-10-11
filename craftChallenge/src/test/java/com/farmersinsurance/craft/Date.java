package com.farmersinsurance.craft;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Date {
	public final String url="https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY";
	@Test
	//To validate right date format
	public void testCheckDate() {
		HttpClient client=new HttpClient();
		try {
			
			ApodResponse apodResponse =client.getData(url+"&date=2021-10-09");
		
	Assert.assertEquals("2021-10-09", apodResponse.getDate());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	@Test
	//To validate Invalid date format
	public void testCheckInvalidDateFormat() {
		HttpClient client=new HttpClient();
		try {
			
			ApodResponse apodResponse =client.getData(url+"&date=202-1-00");
		
	Assert.assertEquals(400, apodResponse.getCode());
	if(apodResponse.getCode()==400) {
		Assert.assertEquals("time data '202-1-00' does not match format '%Y-%m-%d'", apodResponse.getMsg());
	}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	@Test
	//To validate out of range date with correct response code and error message
	public void testCheckOutOfRange() {
		HttpClient client=new HttpClient();
		try {
			
			ApodResponse apodResponse =client.getData(url+"&date=1800-10-09");
			
		
	Assert.assertEquals(400, apodResponse.getCode());
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@Test
		//To validate Invalid date with correct response code and error message
		public void testCheckInvalidDate() {
			HttpClient client=new HttpClient();
			try {
				
				ApodResponse apodResponse =client.getData(url+"&date=2021-10-99");
				
			
		Assert.assertEquals(400, apodResponse.getCode());
		if(apodResponse.getCode()==400) {
			Assert.assertEquals("unconverted data remains: 9", apodResponse.getMsg());
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
