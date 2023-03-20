package com.loginservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginservice.modules.HotelOwnerUser;
import com.loginservice.modules.Users;
import com.loginservice.repositry.HotelOwnerRepositry;


@Service
public class HotelOwnerService {

	
	@Autowired
	HotelOwnerRepositry repositry;
	
	
	public HotelOwnerUser save(HotelOwnerUser h) {
		return repositry.save(h);
	} 
	
	  public HotelOwnerUser saveUser(String name, String password ) {
		   return repositry.findByNameAndPassword(name,password);
	   }
	   
}
