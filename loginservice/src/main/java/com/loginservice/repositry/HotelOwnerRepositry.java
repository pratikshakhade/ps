package com.loginservice.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loginservice.modules.HotelOwnerUser;
@Repository
public interface HotelOwnerRepositry extends JpaRepository<HotelOwnerUser,Integer> {

	HotelOwnerUser findByNameAndPassword(String name, String password);

}
