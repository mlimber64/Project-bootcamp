package com.nttdata.bootcamp.proyecto.service;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.proyecto.model.accountType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface accountTypeService {
	
	 Flux<accountType> findAll();
	 
	 Mono<accountType> findByID(String id);
	
	 Mono<accountType> save(accountType at);
	
	 Mono<accountType> update(String id , accountType at);
	
	 Mono<accountType> delete(String id);
	 

}
