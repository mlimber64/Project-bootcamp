package com.nttdata.bootcamp.proyecto.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@AllArgsConstructor
@Document(collection ="accountType")
public class accountType {
	
	@Id
	private ObjectId _id;
	@Field
	private String description;
	@Field
	private String codigo;

}
