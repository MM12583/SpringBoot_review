package com.frank.review.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frank.review.entity.Users;

@RestController
@RequestMapping(path = "/users")
public class UserController2 {
	
	@PostMapping
	public String save() {
		
		System.out.println("user save....");
		
		return "{'module' : 'user save'}";
		
	}
	
	@DeleteMapping(path = "/{id}")
	public String delete(@PathVariable Integer id) {
		
		System.out.println("user delete..." + id);
		
		return "{'module' : 'user delete'}";
		
	}
	
	@PutMapping
	public String update(@RequestBody Users user) {
		
		System.out.println("user update..." + user);
		
		return "{'module' : 'user update'}";
		
	}
	
	@GetMapping(path = "/{id}")
	public String getById(@PathVariable Integer id) {
		
		System.out.println("user getById..." + id);
		
		return "{'module' : 'user getById'}";
		
	}
	
	@GetMapping
	public String getAll() {
		
		System.out.println("user getAll..." );
		
		return "{'module' : 'user getAll'}";
		
	}
}








