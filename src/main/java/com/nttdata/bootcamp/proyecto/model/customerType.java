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
@Document(collection = "customerTypes")
public class customerType {
	
	@Id
	private long id;
	@Field
	private String description;

}
