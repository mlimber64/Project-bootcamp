package com.nttdata.bootcamp.proyecto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@Document
public class customer {
	
	@Id
	private long id;
	@Field
	private int idType;
	@Field
	private String firstName;
	@Field
	private String lastName;
	@Field
	private int age;
	@Field
	private int numberPhone;
	@Field
	private String email;
	@Field
	private int active;

}
