package com.frank.review.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${country}")
	private String country;
	
	@Value("${owner}")
	private String owner;
	
	@Value("${likes[1]}")
	private String like;
	
	@GetMapping(path = "/hello")
	public String hello() {
		
		return "Hello springboot is runnig.... good !";
	}
	
	@GetMapping(path = "/country")
	public String country() {
		
		return "Hello " + owner + " from " + country + " and you like " + like;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}





