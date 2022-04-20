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
@Document
public class account {
	
	@Id
	private long id;
	@Field
	private int idType;
	@Field
	private int idCustomer;
	@Field
	private int number;
	@Field
	private double balance;
	@Field
	private int movement;
	@Field
	private double maintenance;
	@Field
	private int active;

}
