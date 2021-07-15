package com.rms.rms.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ServiceLayer {

	private final RestTemplate restTemplate;
	
	@Autowired
	public ServiceLayer(RestTemplate restTemplate)
	{
		this.restTemplate=restTemplate;
	}
	
	public Object consumeAPI()
	{
	Object response=null;
		
		try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
           // UriComponentsBuilder builder=UriComponentsBuilder.fromHttpUrl("https://dummy.restapiexample.com/api/v1/employees").queryParam("username", "pawan").queryParam("password", "123");
           headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
           
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            
//HttpEntity<String> response = restTemplate.exchange(
          //  builder.toUriString(), 
           // HttpMethod.GET, 
           // entity, 
           // String.class);
            
            
            response  = restTemplate.exchange("https://dummy.restapiexample.com/api/v1/employees", HttpMethod.GET,entity,Object.class);

            System.out.println(response);
        } catch (Exception ex) {
           ex.printStackTrace();

        }
		
		
		return response;
	}
}
