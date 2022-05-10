package com.nttdata.bootcamp.proyecto.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.*;



@Document(collection = "accountTypes")
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
public class accountType {

	@Id
	private String id = UUID.randomUUID().toString().substring(0,10);
	@Field("description")
	private String description;
	

}
