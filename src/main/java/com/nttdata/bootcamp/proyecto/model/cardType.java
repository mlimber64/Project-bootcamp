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
@Document(collection = "cardType")
public class cardType {
	
	@Id
	private ObjectId id;
	@Field("description")
	private String description;
	

}