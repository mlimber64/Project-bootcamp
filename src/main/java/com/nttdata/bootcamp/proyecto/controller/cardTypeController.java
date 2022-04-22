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

import com.nttdata.bootcamp.proyecto.model.cardType;
import com.nttdata.bootcamp.proyecto.service.cardTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/cardType")
public class cardTypeController {
	
	@Autowired
	private cardTypeService serviceCardType;
	
	@GetMapping("/list")
	public ResponseEntity<Flux<cardType>> findAll(){
		return new ResponseEntity<Flux<cardType>>(serviceCardType.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Mono<cardType>> save(@RequestBody cardType cardType){
		return new ResponseEntity<Mono<cardType>>(serviceCardType.save(cardType),HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Mono<cardType>> update(@RequestBody cardType cardType){
		return new ResponseEntity<Mono<cardType>>(serviceCardType.update(cardType),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Mono<Void>> delete(@RequestBody cardType cardType){
		return new ResponseEntity<Mono<Void>>(serviceCardType.delete(cardType),HttpStatus.OK);
	}
	

}
