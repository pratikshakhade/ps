package com.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.modules.HotelDetails;
import com.admin.modules.HotelTable;
import com.admin.repositry.HotelDetailsRepositry;
import com.admin.repositry.HotelTableRepositry;

@Service
public class HotelTableService {

	@Autowired
	HotelTableRepositry repositry;
	
	
	public HotelTable save(HotelTable t) {
		
		return repositry.save(t);
		
	}
}
