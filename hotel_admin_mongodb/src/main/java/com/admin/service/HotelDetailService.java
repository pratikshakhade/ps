package com.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.modules.HotelDetails;
import com.admin.modules.Menu;
import com.admin.repositry.HotelDetailsRepositry;

@Service
public class HotelDetailService {

	@Autowired
	HotelDetailsRepositry repositry;
	
	
	public HotelDetails save(HotelDetails h) {
		
		return repositry.save(h);
		
	}
	
public HotelDetails find(String hotelname) {
		
	
		return repositry.findByHotelname(hotelname);
		
	}
	
	
}
