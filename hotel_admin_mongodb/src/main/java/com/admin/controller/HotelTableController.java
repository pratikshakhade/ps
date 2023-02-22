package com.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.modules.HotelDetails;
import com.admin.modules.HotelTable;
import com.admin.service.HotelDetailService;
import com.admin.service.HotelTableService;

@RestController
public class HotelTableController  {

	@Autowired
	HotelTableService service;
	
	@PostMapping("/saveTable")
	public HotelTable save(@RequestBody HotelTable t) {
		
		return service.save(t);
	}	
}
