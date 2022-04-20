package com.nttdata.bootcamp.service;

import com.nttdata.bootcamp.model.card;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface cardService {
	
	public Flux<card> findAll();
	
	public Mono<card> save(card card);
	
	public Mono<card> update(card card);
	
	public Mono<Void> delete(card card);

}
