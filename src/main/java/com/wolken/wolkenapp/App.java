package com.wolken.wolkenapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import com.wolken.wolkenapp.dto.TextileDTO;

public class App {
	public static void main(String args[]) {
		
		get();
		post();
		delete();
		update();
	}
	
	public static void get() {
		RestTemplate resttemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<TextileDTO> entity = new HttpEntity<TextileDTO>(headers);
		
		
		ResponseEntity<Object[]> responseentity = resttemplate.exchange(
				
				"http://localhost:8080/webservices-textiles/getall", 
				HttpMethod.GET, 
				entity, 
				Object[].class);
		Object[] ob = responseentity.getBody();
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}
	}
	
	public static void post() {
		RestTemplate resttemplate = new RestTemplate();
		
		TextileDTO body = new TextileDTO();
		body.setTextileShopID(2);
		body.setTextileShopName("Horizon");
		body.setLocation("Bangalore");
		body.setNoOfFloors(4);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<TextileDTO> entity = new HttpEntity<TextileDTO>(body,headers);
		
		ResponseEntity<String> responseentity = resttemplate.exchange(
				"http://localhost:8080/webservices-textiles/save", 
				HttpMethod.POST, 
				entity, 
				String.class);
		
		System.out.println(responseentity.getBody());
	}
	
	public static void delete() {
		RestTemplate resttemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<TextileDTO> entity = new HttpEntity<TextileDTO>(headers);
		
		
		ResponseEntity<String> responseentity = resttemplate.exchange(
				
				"http://localhost:8080/webservices-textiles/delete?textileShopID=2", 
				HttpMethod.DELETE, 
				entity, 
				String.class);
		
		System.out.println(responseentity.getBody());
	}
	
	public static void update() {
		RestTemplate resttemplate = new RestTemplate();
		
		TextileDTO body = new TextileDTO();
		body.setTextileShopID(1);
		body.setTextileShopName("Kinara");
		body.setLocation("Bangalore");
		body.setNoOfFloors(4);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<TextileDTO> entity = new HttpEntity<TextileDTO>(body,headers);
		
		ResponseEntity<String> responseentity = resttemplate.exchange(
				"http://localhost:8080/webservices-textiles/update", 
				HttpMethod.PUT, 
				entity, 
				String.class);
		
		System.out.println(responseentity.getBody());
	}
	
	
	
}
