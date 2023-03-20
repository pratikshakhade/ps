package com.loginservice.controller;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loginservice.modules.Users;
import com.loginservice.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/")
	String r() {
		return "dene";
	}
	
	
	@PostMapping("/save")
	public Users saveUsers(@RequestBody Users u ) {
		System.out.println("user ::::"+u);
		return service.saveUser(u);
	}
	
	@GetMapping("/userbyname")
	public Users saveUsers(@RequestParam String name, @RequestParam String password) {
		System.out.println("name"+password);
		return service.getUser(name,password);
	}
}
