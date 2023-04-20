package com.frank.review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.frank.review.entity.User;

@Controller
public class UserController {
	
	@RequestMapping(path = "/usersOld" ,method = RequestMethod.POST)
	@ResponseBody
	public String save() {
		
		System.out.println("user save....");
		
		return "{'module' : 'user save'}";
		
	}
	
	@RequestMapping(path = "/usersOld/{id}" , method = RequestMethod.DELETE)
	@ResponseBody
	public String delete(@PathVariable Integer id) {
		
		System.out.println("user delete..." + id);
		
		return "{'module' : 'user delete'}";
		
	}
	
	@RequestMapping(path = "/usersOld", method = RequestMethod.PUT) 
	@ResponseBody
	public String update(@RequestBody User user) {
		
		System.out.println("user update..." + user);
		
		return "{'module' : 'user update'}";
		
	}
	
	@RequestMapping(path = "/usersOld/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String getById(@PathVariable Integer id) {
		
		System.out.println("user getById..." + id);
		
		return "{'module' : 'user getById'}";
		
	}
	
	@RequestMapping(path = "/usersOld", method = RequestMethod.GET)
	@ResponseBody
	public String getAll() {
		
		System.out.println("user getAll..." );
		
		return "{'module' : 'user getAll'}";
		
	}
}








