package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.model.accountType;
import com.nttdata.bootcamp.service.accountTypeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/accountType" )
public class accountTypeController {
	
	@Autowired
	private accountTypeService serviceAccountType;
	
	//@RequestMapping(value = "/findAllAccountType" , method = RequestMethod.GET)
	@GetMapping("/list")
	public ResponseEntity<Flux<accountType>> findAllAccountType(){
		return new ResponseEntity<Flux<accountType>>(serviceAccountType.findAll(),HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<Mono<accountType>> saveAccountType(@RequestBody accountType accountType){
		return new ResponseEntity<Mono<accountType>>(serviceAccountType.save(accountType),HttpStatus.CREATED);
	}
	
	@PostMapping()
	public ResponseEntity<Mono<accountType>> updateAccountType(@RequestBody accountType accountType){
		return new ResponseEntity<Mono<accountType>>(serviceAccountType.update(accountType),HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Mono<Void>> deleteAccountType(@RequestBody accountType accountType){
		return new ResponseEntity<Mono<Void>>(serviceAccountType.delete(accountType),HttpStatus.OK);
	}

}
