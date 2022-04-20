package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.model.card;
import com.nttdata.bootcamp.service.cardService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/card")
public class cardController {
	
	@Autowired
	private cardService serviceCard;
	
	@GetMapping("/findAll")
	public ResponseEntity<Flux<card>> findAllCard(){
		return new ResponseEntity<Flux<card>>(serviceCard.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Mono<card>> saveCard(@RequestBody card card){
		return new ResponseEntity<Mono<card>>(serviceCard.save(card),HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Mono<card>> updateCard(@RequestBody card card){
		return new ResponseEntity<Mono<card>>(serviceCard.update(card),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Mono<Void>> deleteCard(@RequestBody card card){
		return new ResponseEntity<Mono<Void>>(serviceCard.delete(card),HttpStatus.OK);
	}

}
