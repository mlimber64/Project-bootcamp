package com.nttdata.bootcamp.proyecto.service;

import com.nttdata.bootcamp.proyecto.model.card;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface cardService {
	
	public Flux<card> findAll();
	
	public Mono<card> save(card card);
	
	public Mono<card> update(card card);
	
	public Mono<Void> delete(card card);

}
