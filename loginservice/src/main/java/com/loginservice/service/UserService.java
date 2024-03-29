package com.loginservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginservice.modules.Users;
import com.loginservice.repositry.UserRepositry;

@Service
public class UserService {

	@Autowired
	UserRepositry repositry;
	
   public Users saveUser(Users u ) {
	   u.setRole("user");
	   return repositry.save(u);
   }
	
   public Users getUser(String name, String password ) {
	   return repositry.findByNameAndPassword(name,password);
   }
   
   
   
}
