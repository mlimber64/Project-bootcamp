package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.model.account;
import com.nttdata.bootcamp.service.accountService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/account")
public class accountController {
	
	@Autowired
	private accountService serviceAccount;
	
	@GetMapping("/findAll")
	public ResponseEntity<Flux<account>> findAllAccount(){
		return new ResponseEntity<Flux<account>>(serviceAccount.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Mono<account>> saveAccount(@RequestBody account account){
		return new ResponseEntity<Mono<account>>(serviceAccount.save(account),HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Mono<account>> updateAccount(@RequestBody account account){
		return new ResponseEntity<Mono<account>>(serviceAccount.update(account),HttpStatus.OK);
	}
	
	public ResponseEntity<Mono<Void>> deleteAccount(@RequestBody account account){
		return new ResponseEntity<Mono<Void>>(serviceAccount.delete(account),HttpStatus.OK);
	}

}
