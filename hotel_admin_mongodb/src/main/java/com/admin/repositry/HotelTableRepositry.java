package com.admin.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.admin.modules.HotelTable;

public interface HotelTableRepositry extends MongoRepository<HotelTable, String> {

}
