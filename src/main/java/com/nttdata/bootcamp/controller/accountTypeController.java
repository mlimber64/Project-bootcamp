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

import com.nttdata.bootcamp.model.accountType;
import com.nttdata.bootcamp.service.accountTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class accountTypeController {
	
	@Autowired
	private accountTypeService serviceAccountType;
	
	@GetMapping("/findAll")
	public ResponseEntity<Flux<accountType>> findAllAccountType(){
		return new ResponseEntity<Flux<accountType>>(serviceAccountType.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Mono<accountType>> saveAccountType(@RequestBody accountType accountType){
		return new ResponseEntity<Mono<accountType>>(serviceAccountType.save(accountType),HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Mono<accountType>> updateAccountType(@RequestBody accountType accountType){
		return new ResponseEntity<Mono<accountType>>(serviceAccountType.update(accountType),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Mono<Void>> deleteAccountType(@RequestBody accountType accountType){
		return new ResponseEntity<Mono<Void>>(serviceAccountType.delete(accountType),HttpStatus.OK);
	}

}
