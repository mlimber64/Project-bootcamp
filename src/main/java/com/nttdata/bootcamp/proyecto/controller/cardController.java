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

import com.nttdata.bootcamp.proyecto.model.card;
import com.nttdata.bootcamp.proyecto.service.cardService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/card")
public class cardController {
	
	@Autowired
	private cardService serviceCard;
	
	@GetMapping
	private Flux<card> findAll(){
		return serviceCard.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private Mono<card> save(@RequestBody card c){
		return serviceCard.save(c);
	}
	
	@PutMapping("/{id}")
	private Mono<ResponseEntity<card>> update(@PathVariable("id") String id,@RequestBody card c){
		return serviceCard.update(id, c)
				.flatMap(cards -> Mono.just(ResponseEntity.ok(cards)))
				.switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
	}
	
	@DeleteMapping("/{id}")
	private Mono<ResponseEntity<card>> delete(@PathVariable("id") String id){
		return serviceCard.delete(id)
				.flatMap(cards -> Mono.just(ResponseEntity.ok(cards)))
				.switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
	}


}
