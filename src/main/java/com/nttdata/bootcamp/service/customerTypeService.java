package com.nttdata.bootcamp.service;

import com.nttdata.bootcamp.model.customerType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface customerTypeService {
	
	public Flux<customerType> findAll();
	
	public Mono<customerType> save(customerType customerType);
	
	public Mono<customerType> update(customerType customerType);
	
	public Mono<Void> delete(customerType customerType);

}
