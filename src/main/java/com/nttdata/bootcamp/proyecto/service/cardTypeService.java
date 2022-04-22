package com.nttdata.bootcamp.proyecto.service;

import com.nttdata.bootcamp.proyecto.model.cardType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface cardTypeService {
	
	public Flux<cardType> findAll();
	
	public Mono<cardType> save(cardType cardType);
	
	public Mono<cardType> update(cardType cardType);
	
	public Mono<Void> delete(cardType cardType);

}
