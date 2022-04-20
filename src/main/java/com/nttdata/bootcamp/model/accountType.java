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
@Document(collection =  "accountType")
public class accountType {
	
	@Id
	private long _id;
	@Field
	private String description;
	@Field
	private String codigo;

}
