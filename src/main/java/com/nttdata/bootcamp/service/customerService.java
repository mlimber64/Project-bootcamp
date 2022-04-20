package com.nttdata.bootcamp.service;

import com.nttdata.bootcamp.model.customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface customerService {
	
	public Flux<customer> findAll();
	
	public Mono<customer> save(customer customer);
	
	public Mono<customer> update(customer customer);
	
	public Mono<Void> delete(customer customer);

}
