package com.loginservice.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loginservice.modules.Users;

@Repository
public interface UserRepositry extends JpaRepository<Users, Integer>{

	Users findByName(String name);

}
