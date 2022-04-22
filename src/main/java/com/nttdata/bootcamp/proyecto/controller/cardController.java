package com.nttdata.bootcamp.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.proyecto.model.card;
import com.nttdata.bootcamp.proyecto.service.cardService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/card")
public class cardController {
	
	@Autowired
	private cardService serviceCard;
	
	@GetMapping("/list")
	public ResponseEntity<Flux<card>> findAll(){
		return new ResponseEntity<Flux<card>>(serviceCard.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Mono<card>> save(@RequestBody card card){
		return new ResponseEntity<Mono<card>>(serviceCard.save(card),HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Mono<card>> update(@RequestBody card card){
		return new ResponseEntity<Mono<card>>(serviceCard.update(card),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Mono<Void>> delete(@RequestBody card card){
		return new ResponseEntity<Mono<Void>>(serviceCard.delete(card),HttpStatus.OK);
	}

}
