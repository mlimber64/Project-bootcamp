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

import com.nttdata.bootcamp.proyecto.model.account;
import com.nttdata.bootcamp.proyecto.service.accountService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/account")
public class accountController {
	
	@Autowired
	private accountService serviceAccount;
	
	@GetMapping("/list")
	public ResponseEntity<Flux<account>> findAll(){
		return new ResponseEntity<Flux<account>>(serviceAccount.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Mono<account>> save(@RequestBody account account){
		return new ResponseEntity<Mono<account>>(serviceAccount.save(account),HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Mono<account>> update(@RequestBody account account){
		return new ResponseEntity<Mono<account>>(serviceAccount.update(account),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Mono<Void>> delete(@RequestBody account account){
		return new ResponseEntity<Mono<Void>>(serviceAccount.delete(account),HttpStatus.OK);
	}

}
