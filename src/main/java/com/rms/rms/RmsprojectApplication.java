package com.rms.rms;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RmsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmsprojectApplication.class, args);
		
	}

	
	/*public String callmethos()
	{
		 String apiOutput="";
		DefaultHttpClient httpclient=new DefaultHttpClient();
	    String uri="http://164.100.180.24/budgetnew/token";
	    HttpPost getrequest=new HttpPost(uri);
	    getrequest.addHeader("accept", "application/json");
	    try {
			HttpResponse response=httpclient.execute(getrequest);
			int statuscode=response.getStatusLine().getStatusCode();
			if(statuscode!=200)
			{
				throw new RuntimeException("Failed with HTTP error code : " + statuscode);
			}
			HttpEntity httpEntity = response.getEntity();
	        apiOutput = EntityUtils.toString(httpEntity);
	        
			System.out.println(apiOutput);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return apiOutput;
	   
	}*/
	
}
