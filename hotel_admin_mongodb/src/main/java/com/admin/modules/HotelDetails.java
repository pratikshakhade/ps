package com.admin.modules;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDetails {
	

	@Id
    private String id;
	private String hotelname;
	private int rating;
	private List<Menu> menu=new ArrayList<Menu>();
}
