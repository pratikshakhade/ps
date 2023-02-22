package com.admin.controller;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.admin.modules.HotelDetails;
import com.admin.service.HotelDetailService;

@RestController
public class HotelDetailsController {

	
	@Autowired
	HotelDetailService service;
	
	@PostMapping("/saveDetails")
	public HotelDetails save(@RequestBody HotelDetails h) {
		
		return service.save(h);
		
	}
	
	@GetMapping("/getDetails")
	public HotelDetails save(@RequestParam String hotelname) {
		
	
		return service.find(hotelname);
		
	}
}
