package com.nttdata.bootcamp.proyecto.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@Document(collection = "cardTypes")
public class cardType {
	
	@Id
	private String id;
	@Field("description")
	private String description;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}