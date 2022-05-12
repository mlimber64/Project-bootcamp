package com.nttdata.bootcamp.proyecto.service;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.proyecto.model.cardType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface cardTypeService {
	
	Flux<cardType> findAll();
	
	Mono<cardType> save(cardType ct);
	
	Mono<cardType> update(String id, cardType ct);
	
	Mono<cardType> delete(String id);

}
