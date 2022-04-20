package com.nttdata.bootcamp.service;

import com.nttdata.bootcamp.model.accountType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface accountTypeService {
	
	public Flux<accountType> findAll();
	
	public Mono<accountType> save(accountType accountType);
	
	public Mono<accountType> update(accountType accountType);
	
	public Mono<Void> delete(accountType accountType);

}
