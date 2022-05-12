package com.nttdata.bootcamp.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.proyecto.model.cardType;
import com.nttdata.bootcamp.proyecto.service.cardTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/cardType")
public class cardTypeController {
	
	@Autowired
	private cardTypeService serviceType;
	
	//list cardType
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	private Flux<cardType> findAll(){
		return serviceType.findAll();
	}
	
	//create new cardType
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private Mono<cardType> save(@RequestBody cardType type){
		return serviceType.save(type);
	}
	
	//edit cardType
	@PutMapping("/{id}")
	private Mono<ResponseEntity<cardType>> update(@PathVariable("id") String id , @RequestBody cardType type){
		return serviceType.update(id, type)
				.flatMap(types -> Mono.just(ResponseEntity.ok(types)))
				.switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
	}
	
	//delete cardType
	@DeleteMapping("/{id}")
	private Mono<ResponseEntity<cardType>> delete(@PathVariable("id") String id){
		return serviceType.delete(id)
				.flatMap(types -> Mono.just(ResponseEntity.ok(types)))
				.switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
	}

}
