package com.loginservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loginservice.modules.HotelOwnerUser;
import com.loginservice.modules.Users;
import com.loginservice.service.HotelOwnerService;

@RestController
public class HotelOwnerController {

	
	@Autowired
	HotelOwnerService service;
	
	@PostMapping("/admin/save")
	public HotelOwnerUser saveUsers(@RequestBody HotelOwnerUser u ) {
		return service.save(u);
	}
	
	@GetMapping("/loginOwner")
	public HotelOwnerUser saveUsers(@RequestParam String name, @RequestParam String password) {
		System.out.println("name"+password);
		return service.saveUser(name,password);
	}
	
}
