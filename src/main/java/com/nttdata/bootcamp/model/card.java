package com.nttdata.bootcamp.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "card")
public class card {
	
	@Id
	private long id;
	@Field
	private int idType;
	@Field
	private int idAccount;
	@Field
	private int idCustomer;
	@Field
	private int number;
	@Field
	private Date dueDate;
	@Field
	private double balance;
	@Field
	private int active;

}
