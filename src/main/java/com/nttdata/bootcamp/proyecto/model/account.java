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
@Document(collection = "account")
public class account {

	@Id
	@Field("_id")
	private String id;
	@Field("idType")
	private int idType;
	@Field("idCustomer")
	private int idCustomer;
	@Field("number")
	private int number;
	@Field("balance")
	private double balance;
	@Field("movement")
	private int movement;
	@Field("maintenance")
	private double maintenance;
	@Field("active")
	private int active;

}
