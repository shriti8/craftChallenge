package com.farmersinsurance.craft;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpClient {
	
	public  ApodResponse getData(String url)throws IOException {
		ApodResponse apodResponse=new ApodResponse();
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            HttpGet request = new HttpGet(url);

             CloseableHttpResponse response = httpClient.execute(request);

            try {

                // Get HttpResponse Status
                System.out.println(response.getProtocolVersion());              // HTTP/1.1
                System.out.println(response.getStatusLine().getStatusCode());   // 200
                System.out.println(response.getStatusLine().getReasonPhrase()); // OK
                System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

                HttpEntity entity = response.getEntity();
                ObjectMapper mapper = new ObjectMapper();
                
                if (entity != null ) {
                	 String result = EntityUtils.toString(entity);
                	 //Currently ApodResponse support attributes only from 200 and 400, hence for status code 403 skipping the mapping.
                	 if(response.getStatusLine().getStatusCode()!=403)
                	 {
                		 apodResponse =mapper.readValue(result, ApodResponse.class); 
                	 }
                
                    apodResponse.setHttpCode(response.getStatusLine().getStatusCode());
                    System.out.println(result);
                }

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }
		return apodResponse;

    }
	

                }

