package com.loginservice.modules;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@javax.persistence.Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Table
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String role;
	private String password;
	private String email;
	
}
