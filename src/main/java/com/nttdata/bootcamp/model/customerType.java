package com.nttdata.bootcamp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@AllArgsConstructor
@Document(collection = "customerType")
public class customerType {
	
	@Id
	private long id;
	@Field
	private String description;

}
