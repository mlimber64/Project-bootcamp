package com.nttdata.bootcamp.proyecto.service;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.proyecto.model.accountType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface accountTypeService {
	
	 Flux<accountType> findAll();
	
	 Mono<accountType> save(Mono<accountType> a);
	
	 Mono<accountType> update(accountType accountType);
	
	 Mono<accountType> delete(String id);

}
