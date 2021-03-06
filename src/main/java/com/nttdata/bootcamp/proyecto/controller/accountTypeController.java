package com.nttdata.bootcamp.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.nttdata.bootcamp.proyecto.model.accountType;
import com.nttdata.bootcamp.proyecto.service.accountTypeService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/v1/accountType" )
public class accountTypeController {
	
	@Autowired
	private accountTypeService serviceType;
	
	@GetMapping
	private Flux<accountType> findAll(){
		return serviceType.findAll();
	}
	
	@GetMapping("/account/{id}")
	private Mono<accountType> findById(@PathVariable("id") String id){
		return serviceType.findAllById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private Mono<accountType> save(@RequestBody accountType type){
		return serviceType.save(type);
	}
	
	@PutMapping("/type/{id}")
	private Mono<ResponseEntity<accountType>> update(@PathVariable("id") String id , @RequestBody accountType type){
		return serviceType.update(id, type)
				.flatMap(types -> Mono.just(ResponseEntity.ok(types)))
				.switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
	}
	
	@DeleteMapping("/type/{id}")
	private Mono<ResponseEntity<accountType>> delete(@PathVariable("id") String id){
		return serviceType.delete(id)
				.flatMap(types -> Mono.just(ResponseEntity.ok(types)))
				.switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
	}
}
