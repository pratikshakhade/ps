package com.admin.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.admin.modules.HotelDetails;

@Repository
public interface HotelDetailsRepositry extends MongoRepository<HotelDetails, String> {

	HotelDetails findByHotelname(String hotelname);

	

}
