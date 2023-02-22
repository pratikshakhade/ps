package com.admin.modules;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelTable {

	@Id
	private String id;
	private int totaltable;
	private String occupied;
	private String satrtTime;
	private String endTime;
	private String hotelname;
}
